package ua.ithillel.hillelwebapp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ua.ithillel.hillelwebapp.model.Language;
import ua.ithillel.hillelwebapp.servise.LanguageService;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "LanguageServlet", value = "/select-language")
public class LanguageServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        LanguageService languageService = new LanguageService();
        String languageType = req.getParameter("Type");
        Language language = Language.valueOf(languageType);

        List<String> languageFeatures = languageService.getLanguageFeatures(language);

        req.setAttribute("features", languageFeatures);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");

        view.forward(req, resp);
    }
}
