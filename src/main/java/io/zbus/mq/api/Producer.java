package io.zbus.mq.api;

/**
 * Abstraction of MqClient from the Producer point of view. 
 * 
 * Features:
 * 1) Pooled MqClient to produce message
 * 2) Publish to dynamic target server.
 * 
 * @author Rushmore
 *
 */
public interface Producer extends MqAdmin {
	/**
	 * Publish message, message target decided by the topic field
	 * 
	 * @param message
	 * @return
	 */
	MqFuture<Message> publish(Message message); 
}
