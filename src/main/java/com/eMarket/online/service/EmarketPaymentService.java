package com.eMarket.online.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eMarket.online.model.EmarketPayment;
import com.eMarket.online.repository.EmarketPaymentRepository;
import com.eMarket.online.utils.EmarketPaymentUtils;

@Service
@Transactional
public class EmarketPaymentService {

	@Autowired
	private EmarketPaymentRepository emarketPaymentRepository;
	
	public EmarketPayment saveEmarketPayment(EmarketPayment emarketPayment) {
		emarketPayment.setPaymentStatus(EmarketPaymentUtils.paymentProcessingResult());
		emarketPayment.setTransactionId(UUID.randomUUID().toString());
		return emarketPaymentRepository.save(emarketPayment);
	}
	
	public EmarketPayment findEmarketPaymentHistory(int orderId) {
		return emarketPaymentRepository.findByOrderId(orderId);
	}
}
