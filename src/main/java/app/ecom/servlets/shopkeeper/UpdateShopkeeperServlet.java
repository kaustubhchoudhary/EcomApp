package app.ecom.servlets.shopkeeper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import app.ecom.modals.Shopkeeper;

/**
 * Servlet implementation class UpdateShopkeeperServlet
 */
@WebServlet("/admin/update-shopkeeper")
public class UpdateShopkeeperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String mobile = request.getParameter("mobile");

        List<Shopkeeper> shopkeepers =
            (List<Shopkeeper>) getServletContext().getAttribute("shopkeepers");

        for (Shopkeeper s : shopkeepers) {
            if (s.getId() == id) {
                s.setName(name);
                s.setMobile(mobile);
                break;
            }
        }

        response.sendRedirect("shopkeepers");
	}

}
