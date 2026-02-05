package app.ecom.servlets.shopkeeper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import app.ecom.modals.Shopkeeper;

@WebServlet("/admin/edit-shopkeeper")
public class EditShopkeeperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        List<Shopkeeper> shopkeepers =
            (List<Shopkeeper>) getServletContext().getAttribute("shopkeepers");

        for (Shopkeeper s : shopkeepers) {
            if (s.getId() == id) {
                req.setAttribute("shopkeeper", s);
                break;
            }
        }

        req.getRequestDispatcher("/jsp/admin/edit-shopkeeper.jsp")
           .forward(req, resp);
	}
}
