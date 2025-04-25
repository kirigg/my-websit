package auth;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (UserStorage.login(login, password)) {
            resp.sendRedirect("success.html");
        } else {
            resp.getWriter().println("Неверный логин или пароль");
        }
    }
}
