public class CompraEfetuarPagamento implements CompraEstado {

    private CompraEfetuarPagamento() {};
    private static CompraEfetuarPagamento instance = new CompraEfetuarPagamento();
    public static CompraEfetuarPagamento getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Efetuar Pagamento";
    }

}
