package com.nagarro.Product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.nagarro.entity.Product;
/**
 * 
 * @author kanikamahajan01
 *
 */
@WebServlet("/DeleteProduct")
public class DeleteProduct extends HttpServlet {
	
//delete operation
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class)
				.buildSessionFactory();
		Session session2 = factory.openSession();
		session2.beginTransaction();
		String title = request.getParameter("title");
		Query query;

		query = session2.createQuery("delete from Product where title=:title");

		query.setParameter("title", title);

		query.executeUpdate();
		session2.close();
		response.sendRedirect("welcome.jsp");

	}

}
