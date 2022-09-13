package ua.ithillel.hillelwebapp.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ua.ithillel.hillelwebapp.servise.ClientService;

import java.io.IOException;

@WebServlet(name = "client-servlet", urlPatterns = "/client")
public class ClientServlet extends HttpServlet {

    private ClientService clientService = new ClientService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("clientsList", clientService.getAllClients());
        RequestDispatcher view = req.getRequestDispatcher("clients.jsp");
        view.forward(req, resp);
    }
}
