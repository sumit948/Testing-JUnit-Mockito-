package com.junittestingexam.testjunitmockitofour.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 100000L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long cartId;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name= "restId")
	private Restrorent restrorent;

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public Restrorent getRestrorent() {
		return restrorent;
	}

	public void setRestrorent(Restrorent restrorent) {
		this.restrorent = restrorent;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", restrorent=" + restrorent + "]";
	}

	
	

		

	
		
	

}
