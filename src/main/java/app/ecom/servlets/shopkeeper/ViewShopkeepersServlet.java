package app.ecom.servlets.shopkeeper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import app.ecom.modals.Shopkeeper;

@WebServlet("/admin/shopkeepers")
public class ViewShopkeepersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Shopkeeper> shopkeepers =
	            (List<Shopkeeper>) getServletContext().getAttribute("shopkeepers");

	        request.setAttribute("shopkeepers", shopkeepers);

	        request.getRequestDispatcher("/jsp/admin/shopkeepers.jsp")
	           .forward(request, response);
	}

}
