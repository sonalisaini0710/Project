package com.nagarro.Product;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nagarro.entity.Product;
/**
 * 
 * @author kanikamahajan01
 *
 */
@MultipartConfig
@WebServlet("/save")
public class SaveProducts extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// GETTING VALUES FROM FORM
		try {
			HttpSession sessionHttp = request.getSession();
			String uname = (String) sessionHttp.getAttribute("username");
			String title = request.getParameter("title");
			int quantity = Integer.parseInt(request.getParameter("quantity"));
			int size = Integer.parseInt(request.getParameter("size"));

			Part file = request.getPart("image");
			int imagesize = (int) file.getSize();

			String imageFileName = file.getSubmittedFileName(); // get selected image file name

			String uploadPath = "C:\\Users\\kanikamahajan01\\eclipse-workspace2\\Assignment7\\src\\main\\webapp\\img\\"
					+ imageFileName; // upload path where we have to upload our actual image

			byte[] data;
//FOR STORING IMAGE
			
			FileOutputStream fos = new FileOutputStream(uploadPath);
			InputStream is = file.getInputStream();

			data = new byte[is.available()];
			is.read(data);
			fos.write(data);
			is.close();
			fos.close();
			Product newProduct = new Product();
//CREATING OBJECT AND ADDING PRODUCT
			newProduct.setImage(data);
			newProduct.setQuantity(quantity);
			newProduct.setSize(size);
			newProduct.setTitle(title);
			newProduct.setUname(uname);
			newProduct.setImageSize(imagesize);

			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class)
					.buildSessionFactory();
			Session session = factory.openSession();

			session.beginTransaction();

			session.save(newProduct);

			session.getTransaction().commit();
			session.close();

			response.sendRedirect("welcome.jsp");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
