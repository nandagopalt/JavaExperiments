package com.example.adapter.payment;

public class PaymentAdapter {
	public String managePayment(int rupee) {
		// Method to covert the rupee to dollar and send to PaymentProcessor for processing the payment
		int dollar = convertRupeetoDollar(rupee);
		String message = doPayment(dollar);
		return message;
	}

	private String doPayment(int dollar) {
		PaymentProcessor paymentProcessor = new PaymentProcessorImpl();
		String message = paymentProcessor.processPayment(dollar);
		return message;
	}

	private int convertRupeetoDollar(int rupee) {
		int dollarRate = 74;
		return rupee * dollarRate;
	}
}
