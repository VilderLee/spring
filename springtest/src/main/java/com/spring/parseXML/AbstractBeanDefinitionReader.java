package com.spring.parseXML;

import com.spring.io.ResourceLoader;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2018/11/8      Create this file
 * </pre>
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{

    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
