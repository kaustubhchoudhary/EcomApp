package app.ecom.servlets;

import app.ecom.modals.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        List<User> users =
            (List<User>) getServletContext().getAttribute("users");

        for (User u : users) {
            if (u.getUsername().equals(username)
                    && u.getPassword().equals(password)) {

                HttpSession session = request.getSession();
                session.setAttribute("username", u.getUsername());
                session.setAttribute("role", u.getRole());

                if ("ADMIN".equals(u.getRole())) {
                    response.sendRedirect(request.getContextPath() + "/admin/dashboard");
                } else {
                    response.sendRedirect(request.getContextPath() + "/subadmin/dashboard");
                }

                return;
            }
        }

        response.sendRedirect(
            request.getContextPath() + "/jsp/login.jsp");
    }
}
