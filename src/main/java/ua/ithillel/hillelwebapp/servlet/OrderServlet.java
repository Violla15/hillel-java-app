package ua.ithillel.hillelwebapp.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ua.ithillel.hillelwebapp.serviсe.OrderService;

import java.io.IOException;

@WebServlet(name = "order-servlet", urlPatterns = "/order")
public class OrderServlet extends HttpServlet {

    private OrderService orderService = new OrderService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("ordersList", orderService.getAllOrders());
        RequestDispatcher view = req.getRequestDispatcher("orders.jsp");
        view.forward(req, resp);
    }
}
