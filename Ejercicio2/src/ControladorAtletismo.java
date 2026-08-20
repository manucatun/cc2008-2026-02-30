import java.util.Scanner;

public class ControladorAtletismo {
    private Atleta atleta;
    private VistaAtletismo vista;

    public ControladorAtletismo() {
        vista = new VistaAtletismo();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        registrarAtleta();

        int opcion = 0;

        while (opcion != 9) {
            opcion = vista.menu();

            switch (opcion) {
                case 1:
                    registrarAtleta();
                    break;

                case 2:
                    if (atleta != null) {
                        if (atleta != null) {
                            if (espacio(atleta.getTiempos())) {
                                System.out.print("Ingrese el tiempo en segundos: ");
                                double tiempo = scanner.nextDouble();

                                if (tiempo > 0) {
                                    atleta.registrar(tiempo);
                                    System.out.println("Tiempo registrado correctamente.");
                                } else {
                                    System.out.println("El tiempo debe ser mayor que 0.");
                                }
                            } else {
                                System.out.println("No hay espacio para mas intentos.");
                            }
                        }
                    }
                    break;

                case 3:
                    if (atleta != null) {
                        vista.mostrarTiempos();

                        double[] tiempos = atleta.getTiempos();

                        if (intentos(tiempos) == 0) {
                            System.out.println("No hay espacio para más intentos.");
                        } else {
                            for (int i = 0; i < tiempos.length; i++) {
                                if (tiempos[i] > 0) {
                                    System.out.println("Intento " + (i + 1) + ": " + tiempos[i] + " segundos");
                                }
                            }
                        }
                    }
                    break;

                case 4:
                    if (atleta != null) {
                        System.out.println("Ingrese el número de intento: ");
                        int intento = scanner.nextInt();

                        double[] tiempos = atleta.getTiempos();

                        if (intento >= 1 && intento <= tiempos.length && tiempos[intento - 1] > 0) {
                            System.out.println(
                                    "Tiempo del intento " + intento + ": " + tiempos[intento - 1] + " segundos.");
                        } else {
                            System.out.println("El intento no ha sido registrado.");
                        }
                    }
                    break;

                case 5:
                    if (atleta != null) {
                        System.out.println("Ingrese el número del intento: ");
                        int intento = scanner.nextInt();

                        double[] tiempos = atleta.getTiempos();

                        if (intento >= 1 && intento <= tiempos.length && tiempos[intento - 1] > 0) {
                            System.out.println("Ingrese el nuevo tiempo: ");
                            double nuevoTiempo = scanner.nextDouble();

                            if (nuevoTiempo > 0) {
                                atleta.modificar(intento - 1, nuevoTiempo);
                                System.out.println("Tiempo modificado correctamente.");
                            } else {
                                System.out.println("El tiempo debe de ser mayor que 0");
                            }
                        } else {
                            System.out.println("El tiempo no ha sido registrado.");
                        }
                    }
                    break;

                case 6:
                    if (atleta != null) {
                        double[] tiempos = atleta.getTiempos();

                        if (intentos(tiempos) > 0) {
                            System.out.println("Promedio: " + calcularPromedio(tiempos) + " segundos.");
                        } else {
                            System.out.println("No hay tiempos registrados.");
                        }
                    }
                    break;

                case 7:
                    if (atleta != null) {
                        double[] tiempos = atleta.getTiempos();

                        if (intentos(tiempos) > 0) {
                            System.out.println("Mejor tiempo: " + mejorTiempo(tiempos) + " segundos");

                            System.out.println("Mayor tiempo: " + mayorTiempo(tiempos) + " segundos");
                        } else {
                            System.out.println("No hay tiempos registrados.");
                        }
                    }
                    break;

                case 8:
                    if (atleta != null) {
                        double[] tiempos = atleta.getTiempos();

                        System.out.println("Intentos realizados: " + intentos(tiempos));

                        System.out.println("Intentos disponibles: " + disponibilidad(tiempos));
                    }
                    break;

                case 9:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }

    private double calcularPromedio(double[] tiempos) {
        double sum = 0;
        double promedio = 0;
        for (int i = 0; i < tiempos.length; i++) {
            if (tiempos[i] > 0) {
                sum += tiempos[i];
            }
            promedio = sum / tiempos.length;
        }
        return promedio;
    }

    private double mejorTiempo(double[] tiempos) {
        double min = 0;
        for (int i = 0; i < tiempos.length; i++) {
            if (tiempos[i] > 0) {
                if (min == 0 || tiempos[i] < min) {
                    min = tiempos[i];
                }
            }
        }
        return min;
    }

    private double mayorTiempo(double[] tiempos) {
        double max = 0;
        for (int i = 0; i < tiempos.length; i++) {
            if (tiempos[i] > max) {
                max = tiempos[i];
            }
        }
        return max;
    }

    private int intentos(double[] tiempos) {
        int intentos = 0;
        for (int i = 0; i < tiempos.length; i++) {
            if (tiempos[i] > 0) {
                intentos++;
            }
        }
        return intentos;
    }

    private int disponibilidad(double[] tiempos) {
        return tiempos.length - intentos(tiempos);
    }

    private boolean espacio(double[] tiempos) {
        for (int i = 0; i < tiempos.length; i++) {
            if (tiempos[i] == 0) {
                return true;
            }
        }
        return false;
    }

    private void registrarAtleta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del atleta: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el número del participante: ");
        int numero = scanner.nextInt();
        System.out.print("Ingrese la edad del atleta: ");
        int edad = scanner.nextInt();
        atleta = new Atleta(nombre, numero, edad);
        System.out.println("Atleta registrado correctamente.");
    }
}