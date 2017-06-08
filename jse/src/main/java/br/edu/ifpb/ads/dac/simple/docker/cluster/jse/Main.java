package br.edu.ifpb.ads.dac.simple.docker.cluster.jse;

import br.edu.ifpb.ads.dac.simple.docker.cluster.shared.Cliente;
import br.edu.ifpb.ads.dac.simple.docker.cluster.shared.ClienteDAOJDBC;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 05/06/2017, 03:05:23
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("====================================================");
        
        try {
            System.out.println("Host Address: "+ InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException ex) {}
        
        // Listing all the saved Postgres Clientes
        ClienteDAOJDBC clienteDAOJDBC = new ClienteDAOJDBC();
        List<Cliente> todosOsClientes = clienteDAOJDBC.todosOsClientes();
        todosOsClientes.forEach(System.out::println);
    }
}
