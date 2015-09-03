package controller;

import model.StoreBean;
import utility.Factory;

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
	double _grossAmount;
	String _item;
	int _quantity;
	double _evatPrice;
	double _netPrice;
	double _price;
	String _creditCard;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
	}

	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		double price = Double.parseDouble(request.getParameter("_price"));
		String item = request.getParameter("_item");
		String creditCard = request.getParameter("_creditCard");
		int quantity = Integer.parseInt(request.getParameter("_quantity"));

		StoreBean store = Factory.getInstance(_price, _grossAmount, _evatPrice,
				_netPrice, _item, _creditCard, _quantity);

		request.setAttribute("outStoreBean", store);
		
		try {
			if(StoreBean.luhns(_creditCard)==false){
				throw new Exception();
			}
			
			request.setAttribute("outStoreBean", store);
			
			RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
			rd.forward(request, response);
		}catch(Exception e){
			RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
		
	}
}