public class Festival {
    private String nombre;
    private String codigo;
    private String coordinador;
    private Escenario[] escenarios;

    public Festival(String nombre, String codigo, String coordinador, Escenario[] escenarios) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.coordinador = coordinador;
        this.escenarios = new Escenario[5];
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getCoordinador() {
        return this.coordinador;
    }

    public Escenario[] getEscenarios() {
        return this.escenarios;
    }

}
