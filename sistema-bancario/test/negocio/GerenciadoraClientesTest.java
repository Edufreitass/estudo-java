package negocio;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

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
        Cliente cliente = gerenciadoraClientes.pesquisaCliente(1);

        // Assert
        assertThat(cliente.getId(), is(idCliente01));
        assertThat(cliente.getEmail(), is("gugafarias@gmail.com"));
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
}
