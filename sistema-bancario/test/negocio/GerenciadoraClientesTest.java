package negocio;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class GerenciadoraClientesTest {

    private GerenciadoraClientes gerenciadoraClientes;

    @Test
    public void testPesquisaCliente() {
        // Arrange
        Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
        Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 1, true);

        List<Cliente> clientesDoBanco = new ArrayList<>();
        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);

        gerenciadoraClientes = new GerenciadoraClientes(clientesDoBanco);

        // Act
        Cliente cliente = gerenciadoraClientes.pesquisaCliente(1);

        // Assert
        assertThat(cliente.getId(), is(1));
        assertThat(cliente.getEmail(), is("gugafarias@gmail.com"));
    }

    @Test
    public void testRemoveCliente() {
        // Arrange
        Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
        Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 1, true);

        List<Cliente> clientesDoBanco = new ArrayList<>();
        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);

        gerenciadoraClientes = new GerenciadoraClientes(clientesDoBanco);

        // Act
        boolean clienteRemovido = gerenciadoraClientes.removeCliente(2);

        // Assert
        assertThat(clienteRemovido, is(true));
        assertThat(gerenciadoraClientes.getClientesDoBanco().size(), is(1));
        assertNull(gerenciadoraClientes.pesquisaCliente(2));
    }
}