public class CompraEstadoPreencherEndereco implements CompraEstado {

    private CompraEstadoPreencherEndereco() {};
    private static CompraEstadoPreencherEndereco instance = new CompraEstadoPreencherEndereco();
    public static CompraEstadoPreencherEndereco getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Preencher Endereço";
    }

}
