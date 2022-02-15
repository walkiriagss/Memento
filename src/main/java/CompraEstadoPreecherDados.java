public class CompraEstadoPreecherDados implements CompraEstado {

    private CompraEstadoPreecherDados() {};
    private static CompraEstadoPreecherDados instance = new CompraEstadoPreecherDados();
    public static CompraEstadoPreecherDados getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Preencher Dados";
    }

}
