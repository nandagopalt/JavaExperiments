package com.example.adapter.payment;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public String processPayment(int dollars) {
		return String.format("%1$s, Payment of %2$s in dollars processed !", "Welcome", dollars);
	}
}
