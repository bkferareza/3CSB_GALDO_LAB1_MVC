package controller;

import model.StoreBean;
import utility.Factory;
import controller.InvalidCreditCard;

import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebServlet(urlPatterns={"/StoreServlet"})
public class StoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try{
		String item = request.getParameter("item");
		double quantity = Integer.parseInt(request.getParameter("quantity"));
		double price = Double.parseDouble(request.getParameter("price"));
		String creditCard = request.getParameter("creditCard");
		
		
		StoreBean store = Factory.getInstance(item, quantity, price, creditCard);
			
		request.setAttribute("outStoreBean", store);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("display.jsp");
		dispatcher.forward(request,  response);
		}
		catch(InvalidCreditCard e){
			out.println("<h3>Error NOTICE</h3>");
			out.println("<h4>You Input Invalid Credit Card Number</h4>");
			out.print("Credit Card Number: " + request.getParameter("creditCard") + " is invalid");
			out.println("<form action= 'index.jsp'><input type = 'submit' value = 'Return to homepage'></form>");			
		}
		catch(NumberFormatException i){
			out.println("<h3>Error NOTICE</h3>");
			out.println("<h4>Wrong number input</h4>");
			out.println("<form action= 'index.jsp'><input type = 'submit' value = 'Return to homepage'></form>");	
			
		}
	}
}