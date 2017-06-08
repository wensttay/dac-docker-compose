package br.ifpb.edu.ads.dac.simple.docker.cluster.web;

import br.edu.ifpb.ads.dac.simple.docker.cluster.shared.Cliente;
import br.edu.ifpb.ads.dac.simple.docker.cluster.shared.ClienteDAOJDBC;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ricardo Job
 */
@WebServlet(name = "ClienteServlet", urlPatterns = {"/cliente"})
public class ClienteServlet extends HttpServlet {

    private ClienteDAOJDBC dao = new ClienteDAOJDBC();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        List<Cliente> todosOsClientes = dao.todosOsClientes();

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ClienteServlet</title>");
            out.println("</head>");
            out.println("<body>");
            
            out.print("<h4>Host Address: "+ InetAddress.getLocalHost().getHostAddress() +"</h4></br>");
            todosOsClientes.forEach(out::println);
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
