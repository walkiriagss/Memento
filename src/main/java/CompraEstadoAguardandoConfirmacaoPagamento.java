public class CompraEstadoAguardandoConfirmacaoPagamento implements CompraEstado {

    private CompraEstadoAguardandoConfirmacaoPagamento() {};
    private static CompraEstadoAguardandoConfirmacaoPagamento instance = new CompraEstadoAguardandoConfirmacaoPagamento();
    public static CompraEstadoAguardandoConfirmacaoPagamento getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Aguardando Confirmação de Pagamento";
    }

}
