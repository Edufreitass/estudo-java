package negocio;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class GerenciadoraClientesTest {

    private GerenciadoraClientes gerenciadoraClientes;
    private final int idCliente01 = 1;
    private final int idCliente02 = 2;

    @Before
    public void setUp() {
        // Arrange
        Cliente cliente01 = new Cliente(idCliente01, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
        Cliente cliente02 = new Cliente(idCliente02, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 1, true);

        List<Cliente> clientesDoBanco = new ArrayList<>();
        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);

        gerenciadoraClientes = new GerenciadoraClientes(clientesDoBanco);
    }

    @After
    public void tearDown() {
        gerenciadoraClientes.limpa();
    }

    @Test
    public void testPesquisaCliente() {
        // Act
        Cliente cliente = gerenciadoraClientes.pesquisaCliente(idCliente01);

        // Assert
        assertThat(cliente.getId(), is(idCliente01));
        assertThat(cliente.getEmail(), is("gugafarias@gmail.com"));
    }

    @Test
    public void testPesquisaClienteInexistente() {
        // Act
        Cliente cliente = gerenciadoraClientes.pesquisaCliente(1001);

        // Assert
        assertNull(cliente);
    }

    @Test
    public void testRemoveCliente() {
        // Act
        boolean clienteRemovido = gerenciadoraClientes.removeCliente(idCliente02);

        // Assert
        assertThat(clienteRemovido, is(true));
        assertThat(gerenciadoraClientes.getClientesDoBanco().size(), is(1));
        assertNull(gerenciadoraClientes.pesquisaCliente(idCliente02));
    }

    @Test
    public void testRemoveClienteInexistente() {
        // Act
        boolean clienteRemovido = gerenciadoraClientes.removeCliente(1001);

        // Assert
        assertThat(clienteRemovido, is(false));
        assertThat(gerenciadoraClientes.getClientesDoBanco().size(), is(2));
    }

    @Test
    public void testClienteIdadeAceitavel() throws IdadeNaoPermitidaException {
        // Arrange
        Cliente cliente = new Cliente(1, "Gustavo", 25, "guga@gmail.com", 1, true);

        // Act
        boolean idadeValida = gerenciadoraClientes.validaIdade(cliente.getIdade());

        // Assert
        assertTrue(idadeValida);
    }

    @Test
    public void testClienteIdadeAceitavelMinima() throws IdadeNaoPermitidaException {
        // Arrange
        Cliente cliente = new Cliente(1, "Gustavo", 18, "guga@gmail.com", 1, true);

        // Act
        boolean idadeValida = gerenciadoraClientes.validaIdade(cliente.getIdade());

        // Assert
        assertTrue(idadeValida);
    }

    @Test
    public void testClienteIdadeAceitavelMaxima() throws IdadeNaoPermitidaException {
        // Arrange
        Cliente cliente = new Cliente(1, "Gustavo", 65, "guga@gmail.com", 1, true);

        // Act
        boolean idadeValida = gerenciadoraClientes.validaIdade(cliente.getIdade());

        // Assert
        assertTrue(idadeValida);
    }

    @Test
    public void testClienteIdadeInaceitavelAbaixoDe18Anos() {
        // Arrange
        Cliente cliente = new Cliente(1, "Gustavo", 17, "guga@gmail.com", 1, true);

        try {
            // Act
            gerenciadoraClientes.validaIdade(cliente.getIdade());
            fail();
        } catch (Exception e) {
            // Assert
            assertThat(e.getMessage(), is(IdadeNaoPermitidaException.MSG_IDADE_INVALIDA));
        }
    }

    @Test
    public void testClienteIdadeInaceitavelAcimaDe65Anos() {
        // Arrange
        Cliente cliente = new Cliente(1, "Gustavo", 66, "guga@gmail.com", 1, true);

        try {
            // Act
            gerenciadoraClientes.validaIdade(cliente.getIdade());
            fail();
        } catch (Exception e) {
            // Assert
            assertThat(e.getMessage(), is(IdadeNaoPermitidaException.MSG_IDADE_INVALIDA));
        }
    }
}
