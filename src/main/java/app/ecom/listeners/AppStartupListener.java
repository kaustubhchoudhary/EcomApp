package app.ecom.listeners;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import java.util.ArrayList;
import java.util.List;

import app.ecom.modals.*;

@WebListener
public class AppStartupListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        ServletContext ctx = sce.getServletContext();

        // Users (Admin & Sub-admin)
        List<User> users = new ArrayList<>();
        users.add(new User("admin", "admin123", "ADMIN"));
        users.add(new User("subadmin", "sub123", "SUB_ADMIN"));

        // Categories
        List<Category> categories = new ArrayList<>();

        // Products
        List<Product> products = new ArrayList<>();

        // Shopkeepers
        List<Shopkeeper> shopkeepers = new ArrayList<>();

        // Store in application scope
        ctx.setAttribute("users", users);
        ctx.setAttribute("categories", categories);
        ctx.setAttribute("products", products);
        ctx.setAttribute("shopkeepers", shopkeepers);
    }
}
