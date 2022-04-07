package com.junittestingexam.testjunitmockitofour.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.junittestingexam.testjunitmockitofour.entity.Cart;
import com.junittestingexam.testjunitmockitofour.service.CartService;

@RunWith(MockitoJUnitRunner.class)
public class TestCartController {
	/**
	 * injecting current class also find remaining mocks
	 */
	@InjectMocks
	public CartController cartCon;
	
	/**
	 *invoking current class 
	 */
	@Mock
	public CartService cartServ;
	
	
	@Test
	public void testGetCall() {
		CartService cartServ = mock(CartService.class);
		Cart c1 = new Cart();
		c1.setCartId(101L);
		c1.setRestrorent(null);
		
		List<Cart> listCart = new ArrayList<>();
		listCart.add(c1);
		
		when(cartServ.getCall()).thenReturn(listCart);
		
		
		List<Cart> resultList = cartServ.getCall();
		
		assertEquals(1, resultList.size());
	}
	
	@Test
	public void testSample() {
		assertEquals(10, 10);
	}
}
