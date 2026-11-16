public class Configuracion {
    private static Configuracion instancia;
    private String clave;
    private String valor;

    private Configuracion() {
        this.clave = "idioma";
        this.valor = "español";
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    public String getClave() {
        return clave;
    }

    public String getValor() {
        return valor;
    }
}