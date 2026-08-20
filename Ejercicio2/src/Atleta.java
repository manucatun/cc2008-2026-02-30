public class Atleta {
    private String nombre;
    private int numero;
    private int edad;
    private double[] tiempos;

    public Atleta(String nombre, int numero, int edad) {
        this.nombre = nombre;
        this.numero = numero;
        this.edad = edad;
        this.tiempos = new double[10];
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getEdad() {
        return this.edad;
    }

    public double[] getTiempos() {
        return this.tiempos;
    }

    public void modificar(int intento, double tiempo) {
        tiempos[intento] = tiempo;
    }

    public void registrar(double tiempo) {
        for (int i = 0; i < tiempos.length; i++) {
            if (tiempos[i] == 0) {
                tiempos[i] = tiempo;
                break;
            }
        }
    }
}
