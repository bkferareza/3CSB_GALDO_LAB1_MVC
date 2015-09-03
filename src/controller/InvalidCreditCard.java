package controller;

public class InvalidCreditCard extends Exception {
	public InvalidCreditCard(){}
	public InvalidCreditCard(String s){
		super(s);
	}
}
