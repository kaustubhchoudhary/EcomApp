package app.ecom.servlets.product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import app.ecom.modals.Product;

@WebServlet("/subadmin/products")
public class ViewProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Product> products = (List<Product>) getServletContext().getAttribute("products");

		request.setAttribute("products", products);

		request.getRequestDispatcher("/jsp/subadmin/products.jsp").forward(request, response);
	}

}
