package utility;
import controller.InvalidCreditCard;
import model.StoreBean;



public class Factory {
			public static StoreBean getInstance(String item, double quantity,double price,
							String creditCard) throws InvalidCreditCard
		{
		StoreBean store = new StoreBean();
		store.setitem(item);
		store.setquantity(quantity);
		store.setprice(price);
		store.setcreditCard(creditCard);
		store.setCompute(price, quantity);
		
		return store;
}
}
