package ua.ithillel.hillelwebapp.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ua.ithillel.hillelwebapp.serviсe.CarService;

import java.io.IOException;

@WebServlet(name = "car-servlet", urlPatterns = "/car-rent")
public class CarServlet extends HttpServlet {

    private CarService carService = new CarService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("carsList", carService.getAllCars());
        RequestDispatcher view = req.getRequestDispatcher("cars.jsp");
        view.forward(req, resp);
    }
}
