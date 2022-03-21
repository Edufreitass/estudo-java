package negocio;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class GerenciadoraContasTest {

    private GerenciadoraContas gerenciadoraContas;
    private ContaCorrente conta01;
    private ContaCorrente conta02;

    @Before
    public void setUp() {
        // Arrange
        conta01 = new ContaCorrente(1, 200, true);
        conta02 = new ContaCorrente(2, 0, true);

        List<ContaCorrente> contasDoBanco = new ArrayList<>();
        contasDoBanco.add(conta01);
        contasDoBanco.add(conta02);

        gerenciadoraContas = new GerenciadoraContas(contasDoBanco);
    }

    @Test
    public void testTransfereValor() {
        // Act
        gerenciadoraContas.transfereValor(1, 100, 2);

        // Assert
        assertThat(conta02.getSaldo(), is(100.0));
        assertThat(conta01.getSaldo(), is(100.0));
    }

    @Test
    public void testTransfereValorComSaldoInsuficiente() {
        // Act
        boolean sucesso = gerenciadoraContas.transfereValor(1, 300, 2);

        // Assert
        assertTrue(sucesso);
        assertThat(conta01.getSaldo(), is(-100.0));
        assertThat(conta02.getSaldo(), is(300.0));
    }
}
