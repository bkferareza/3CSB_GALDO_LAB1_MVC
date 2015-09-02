package utility;
import model.StoreBean;

public class Factory {
	public static StoreBean getInstance(double _price, double _netPrice, double _grossAmount, double _evatPrice, String _item, String _creditCard, int _quantity)
	{
		StoreBean store = new StoreBean();
		store.set_price(_price);
		store.set_netPrice(_netPrice);
		store.set_grossAmount(_grossAmount);
		store.set_evatPrice(_evatPrice);
		store.set_item(_item);
		store.set_creditCard(_creditCard);
		store.set_quantity(_quantity);
		
		return store;
	}
}
