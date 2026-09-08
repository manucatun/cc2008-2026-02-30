public class Artista {
    private String codigo;
    private String nombre;
    private String generoMusical;
    private double duracion;
    private int asistentes;

    public Artista(String codigo, String nombre, String generoMusical, double duracion, int asistentes) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.generoMusical = generoMusical;
        this.duracion = duracion;
        this.asistentes = asistentes;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getGenero() {
        return this.generoMusical;
    }

    public double getDuracion() {
        return this.duracion;
    }

    public int getAsistentes() {
        return this.asistentes;
    }

    public void modificarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void modificarGenero(String nuevoGenero) {
        this.generoMusical = nuevoGenero;
    }

    public void modificarDuracion(double nuevaDuracion) {
        this.duracion = nuevaDuracion;
    }

    public void modificarAsistentes(int nuevosAsistentes) {
        this.asistentes = nuevosAsistentes;
    }

    public String toString() {
        return "Código: " + this.codigo + ", Nombre: " + this.nombre + ", Género Musical: " + this.generoMusical +
                ", Duración: " + this.duracion + ", Asistentes: " + this.asistentes;
    }
}
