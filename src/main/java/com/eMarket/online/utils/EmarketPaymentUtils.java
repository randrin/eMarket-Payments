package com.eMarket.online.utils;

import java.util.Random;

public class EmarketPaymentUtils {

	// Call API thirds party gateway payment (for example Paypal, Stripe, PayAtm, .....)
	public static String paymentProcessingResult() {
		return new Random().nextBoolean() ? "success" : "false";
	}
}
