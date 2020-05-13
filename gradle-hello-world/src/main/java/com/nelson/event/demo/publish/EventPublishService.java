package com.nelson.event.demo.publish;

/**
 * nelson
 *
 * @param <T>
 */
public interface EventPublishService<T> {

    void publishEvent(T event);
}
