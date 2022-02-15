public class CompraEstadoAcompanharEnvio implements CompraEstado {

    private CompraEstadoAcompanharEnvio() {};
    private static CompraEstadoAcompanharEnvio instance = new CompraEstadoAcompanharEnvio();
    public static CompraEstadoAcompanharEnvio getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Acompanhar Envio";
    }

}
