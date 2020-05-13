package com.nelson.event.demo.publish.impl;

import com.nelson.event.demo.publish.EventPublishService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Service;

/**
 *
 * Spring实现的事件发布
 *
 * @author nelson
 */
@Service("springEventPublishService")
public class SpringEventPublishServiceImpl implements EventPublishService<ApplicationEvent>, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void publishEvent(ApplicationEvent event) {
        applicationContext.publishEvent(event);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
