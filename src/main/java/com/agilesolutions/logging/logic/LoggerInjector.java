package com.agilesolutions.logging.logic;

import java.lang.reflect.Field;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

@Component
public class LoggerInjector implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	public Object postProcessBeforeInitialization(final Object bean, String name) throws BeansException {
		ReflectionUtils.doWithFields(bean.getClass(), new ReflectionUtils.FieldCallback() {
			public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
				ReflectionUtils.makeAccessible(field);// make sure the field accessible if defined private
				if (field.getAnnotation(bal.class) != null) {
					Logger log = LoggerFactory.getLogger("atl");
					field.set(bean, log);
				}
				if (field.getAnnotation(atl.class) != null) {
					Logger log = LoggerFactory.getLogger("bal");
					field.set(bean, log);
				}
			}
		});
		return bean;
	}
}