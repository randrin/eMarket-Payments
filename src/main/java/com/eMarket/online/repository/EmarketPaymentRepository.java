package com.eMarket.online.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.eMarket.online.model.EmarketPayment;

@RepositoryRestResource
public interface EmarketPaymentRepository extends JpaRepository<EmarketPayment, Integer>{

	EmarketPayment findByOrderId(int orderId);

}
