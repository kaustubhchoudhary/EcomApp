package app.ecom.servlets.shopkeeper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import app.ecom.modals.Shopkeeper;


@WebServlet("/admin/add-shopkeeper")
public class AddShopkeeperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/jsp/admin/add-shopkeeper.jsp")
           .forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        List<Shopkeeper> shopkeepers =
            (List<Shopkeeper>) getServletContext().getAttribute("shopkeepers");

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String mobile = req.getParameter("mobile");

        shopkeepers.add(new Shopkeeper(id, name, mobile));

        resp.sendRedirect("shopkeepers");
    }

}
