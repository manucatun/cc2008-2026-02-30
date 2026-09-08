import java.util.ArrayList;

public class Escenario {
    private String codigo;
    private String nombre;
    private String ubicacion;
    private int capacidad;
    private String estado;
    private ArrayList<Artista> artistas;

    public Escenario(String codigo, String nombre, String ubicacion, int capacidad, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.estado = estado;
        this.artistas = new ArrayList<>();
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public String getEstado() {
        return this.estado;
    }

    public ArrayList<Artista> getArtistas() {
        return this.artistas;
    }

    // Se cambió el nombre del método de "setCapacidad" a "modificarCapacidad" para
    // mayor claridad
    public void modificarCapacidad(int nuevaCapacidad) {
        this.capacidad = nuevaCapacidad;
    }

    // Se cambió el nombre del método de "setEstado" a "modificarEstado" para mayor
    // claridad
    public void modificarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public String toString() {
        return "Código: " + this.codigo + ", Nombre: " + this.nombre + ", Ubicación: " + this.ubicacion +
                ", Capacidad: " + this.capacidad + ", Estado: " + this.estado;
    }

}
