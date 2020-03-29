package com.eMarket.online.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eMarket.online.model.EmarketPayment;
import com.eMarket.online.service.EmarketPaymentService;

@RestController
@CrossOrigin("*")
@RequestMapping("/payment")
public class EmarketPaymentController {

	@Autowired
	private EmarketPaymentService emarketPaymentService;
	
	@PostMapping("/savePayment")
	public EmarketPayment savePayment(@RequestBody EmarketPayment emarketPayment) {
		return emarketPaymentService.saveEmarketPayment(emarketPayment);
	}
	
	@GetMapping("/history/{orderId}")
	public EmarketPayment findEmarketPaymentHistory(@PathVariable int orderId) {
		return emarketPaymentService.findEmarketPaymentHistory(orderId);
	}
}
