package model;



public class StoreBean {
	private String _item;
	private int _quantity;
	private double _price;
	private String _creditCard;
	private double _grossAmount;
	private double _evatPrice;
	private double _netPrice;
	public String get_item() {
		return _item;
	}
	public void set_item(String _item) {
		this._item = _item;
	}
	public int get_quantity() {
		return _quantity;
	}
	public void set_quantity(int _quantity) {
		this._quantity = _quantity;
	}
	public double get_price() {
		return _price;
	}
	public void set_price(double _price) {
		this._price = _price;
	}
	public String get_creditCard() {
		return _creditCard;
	}
	public void set_creditCard(String _creditCard) {
		this._creditCard = _creditCard;
	}
	public double get_grossAmount() {
		_grossAmount=_quantity*_price;
		return _grossAmount;
	}
	public void set_grossAmount(double _grossAmount) {
		this._grossAmount = _grossAmount;
	}
	public double get_evatPrice() {
		_evatPrice=_grossAmount*.12;
		return _evatPrice;
	}
	public void set_evatPrice(double _evatPrice) {
		this._evatPrice = _evatPrice;
	}
	public double get_netPrice() {
		_netPrice=_grossAmount + _evatPrice;
		return _netPrice;
	}
	public void set_netPrice(double _netPrice) {
		this._netPrice = _netPrice;
	}
	public static boolean luhns(String cc){
		int sum = 0;
        boolean alternate = false;
        for (int i = cc.length() - 1; i >= 0; i--){
                int n = Integer.parseInt(cc.substring(i, i + 1));
                if (alternate){
                        n *= 2;
                        if (n > 9){
                                n = (n % 10) + 1;
                        }
                }
                sum += n;
                alternate = !alternate;
        }
        return (sum % 10 == 0);
	}
}