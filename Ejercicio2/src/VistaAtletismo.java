import java.util.Scanner;

public class VistaAtletismo {
    private Scanner scanner;

    public VistaAtletismo() {
        scanner = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("\n - - - TORNEO DE ATLETISMO - - -");
        System.out.println("1. Registrar nuevo atleta");
        System.out.println("2. Registrar nuevo tiempo");
        System.out.println("3. Consultar tiempos");
        System.out.println("4. Consultar un intento");
        System.out.println("5. Modificar tiempo");
        System.out.println("6. Mostrar promedio");
        System.out.println("7. Mostrar mejor y mayor tiempo");
        System.out.println("8. Consultar intentos disponibles");
        System.out.println("9. Salir");

        return scanner.nextInt();
    }

    public void mostrarTiempos() {
        System.out.println("\n - - - TIEMPOS REGISTRADOS - - -");
    }
}
