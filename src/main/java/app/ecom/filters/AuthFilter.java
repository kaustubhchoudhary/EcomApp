package app.ecom.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.*;

import java.io.IOException;

//@WebFilter("/*")
public class AuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        String uri = request.getRequestURI();

        // Public resources/urls
        if (uri.endsWith("login.jsp")
                || uri.endsWith("/login")
                || uri.contains("/css/")
                || uri.contains("/js/")) {

            chain.doFilter(req, res);
            return;
        }

        HttpSession session = request.getSession(false);

        if (session != null && session.getAttribute("username") != null) {
            chain.doFilter(req, res); // user is logged in
        } else {
            response.sendRedirect(
                request.getContextPath() + "/login.jsp");
        }
    }
}
