package app.ecom.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.*;

import java.io.IOException;

//@WebFilter("/jsp/*")
public class JspAccessFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        // Check if request is a forward (internal)
        String forwarded =
            (String) request.getAttribute(RequestDispatcher.FORWARD_REQUEST_URI);

        if (forwarded != null) {
            // Request came via forward -> allow
            chain.doFilter(req, res);
        } else {
            // Direct access -> block
            response.sendRedirect(
                request.getContextPath() + "/jsp/login.jsp");
        }
    }
}
