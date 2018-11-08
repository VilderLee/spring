package com.spring.factory;

import com.spring.factory.support.BeanDefinitionRegistry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2018/11/8      Create this file
 * </pre>
 *
 * @author dell
 */
public abstract class AbstractBeanFactory implements BeanFactory, BeanDefinitionRegistry {

    private Map<String, Object> map = new ConcurrentHashMap();

    public Object getBean(String name){
        return map.get(name);
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        map.put(name, beanDefinition);
    }
}
