package app.ecom.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.*;

import java.io.IOException;

//@WebFilter({"/admin/*", "/subadmin/*"})
public class AuthorizationFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        HttpSession session = request.getSession(false);
        String role = (String) session.getAttribute("role");
        String uri = request.getRequestURI();

        if (uri.contains("/admin/") && "ADMIN".equals(role)) {
            chain.doFilter(req, res);
            return;
        }

        if (uri.contains("/subadmin/") && "SUB_ADMIN".equals(role)) {
            chain.doFilter(req, res);
            return;
        }

        response.sendRedirect(
            request.getContextPath() + "/jsp/accessDenied.jsp");
    }
}
