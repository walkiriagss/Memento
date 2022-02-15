import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    void deveArmazenarEstados() {
        Compra compra = new Compra();
        compra.setEstado(CompraEstadoPreecherDados.getInstance());
        compra.setEstado(CompraEstadoPreencherEndereco.getInstance());
        assertEquals(2, compra.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Compra compra = new Compra();
        compra.setEstado(CompraEstadoPreecherDados.getInstance());
        compra.setEstado(CompraEstadoPreencherEndereco.getInstance());
        compra.restauraEstado(0);
        assertEquals(CompraEstadoPreecherDados.getInstance(), compra.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Compra compra = new Compra();
        compra.setEstado(CompraEstadoPreecherDados.getInstance());
        compra.setEstado(CompraEfetuarPagamento.getInstance());
        compra.setEstado(CompraEstadoPreecherDados.getInstance());
        compra.setEstado(CompraEstadoPreencherEndereco.getInstance());
        compra.restauraEstado(2);
        assertEquals(CompraEstadoPreecherDados.getInstance(), compra.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Compra aluno = new Compra();
            aluno.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }


}