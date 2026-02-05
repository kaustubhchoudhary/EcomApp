package app.ecom.servlets.product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import app.ecom.modals.Product;

@WebServlet("/subadmin/edit-product")
public class EditProductServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        List<Product> products =
            (List<Product>) getServletContext().getAttribute("products");

        for (Product p : products) {
            if (p.getId() == id) {
                req.setAttribute("product", p);
                break;
            }
        }

        req.getRequestDispatcher("/jsp/subadmin/edit-product.jsp")
           .forward(req, resp);
    }
}
