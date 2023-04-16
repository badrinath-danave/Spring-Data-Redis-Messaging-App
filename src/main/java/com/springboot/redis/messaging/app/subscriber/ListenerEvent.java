package com.springboot.redis.messaging.app.subscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

public class ListenerEvent implements MessageListener{

	Logger logger = LoggerFactory.getLogger(ListenerEvent.class);
	
	@Override
	public void onMessage(Message message, byte[] pattern) {
		logger.info("Consumed event successfully {}", message);
	}

}
