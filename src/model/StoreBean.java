package model;
import controller.InvalidCreditCard;

public class StoreBean{
	private String item;
	private double quantity;
	private double price;
	private String creditCard;
	private double grossAmount;
	private double total;
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getitem() {
		return item;
	}
	public void setitem(String item) {
		this.item = item;
	}
	public double getquantity() {
		return quantity;
	}
	public void setquantity(double quantity) {
		this.quantity = quantity;
	}
	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		this.price = price;
	}
	public String getcreditCard() {
		return creditCard;
	}
	public void setcreditCard(String creditCard) throws InvalidCreditCard {
		if(luhns(creditCard)){
			this.creditCard = creditCard;
			}
			
			else throw new InvalidCreditCard();
	}
	public double getgrossAmount() {
		grossAmount=quantity*price;
		return grossAmount;
	}
	public void setgrossAmount(double grossAmount) {
		this.grossAmount = grossAmount;
	}
	public boolean luhns(String creditCard){
		int sum = 0;
        boolean alternate = false;
        for (int i = creditCard.length() - 1; i >= 0; i--){
                int n = Integer.parseInt(creditCard.substring(i, i + 1));
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
	public void setCompute(double price, double quantity){
		setprice(price);
		setquantity(quantity);
		double vat;
		
		grossAmount = price*quantity;
		vat = grossAmount * 0.12;
		total = grossAmount + vat;
		
	}
}