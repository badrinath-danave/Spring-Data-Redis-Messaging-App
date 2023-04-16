package com.springboot.redis.messaging.app.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.redis.messaging.app.dto.Product;

@RestController
public class PublisherEvent {

	@Autowired
	private RedisTemplate template;
	
	@Autowired
	private ChannelTopic topic;
	
	
	@PostMapping("/publish")
	public String publish(@RequestBody Product product) {
		template.convertAndSend(topic.getTopic(), product.toString());
		return "Event Publish Successfully";
	}
	
}
