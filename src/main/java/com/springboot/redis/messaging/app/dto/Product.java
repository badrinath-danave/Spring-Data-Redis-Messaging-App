package com.springboot.redis.messaging.app.dto;


import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product{

	@Id
	private int id;
	private String name;
	private int qty;
	private long price;
}