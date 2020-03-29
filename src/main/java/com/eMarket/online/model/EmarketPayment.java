package com.eMarket.online.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Payments")
public class EmarketPayment implements Serializable {

	private static final long serialVersionUID = -4402188211314360105L;

	@Id
	@GeneratedValue
	private int idPayment;
	private String paymentStatus;
	private String transactionId;
	private int orderId;
	private double orderTotalPrice;
	
}
