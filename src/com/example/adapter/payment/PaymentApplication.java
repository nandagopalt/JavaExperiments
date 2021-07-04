package com.example.adapter.payment;

public class PaymentApplication {
	public String doPayment(int rupees) {
		PaymentAdapter adapter = new PaymentAdapter();
		String message = adapter.managePayment(rupees);
		return message;
	}
	
	public static void main(String args[]) {
		PaymentApplication paymentApplication = new PaymentApplication();
		System.out.println(paymentApplication.doPayment(20));
	}
}
