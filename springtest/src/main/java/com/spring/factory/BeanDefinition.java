package com.spring.factory;

import java.util.Properties;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2018/11/8      Create this file
 * </pre>
 *
 *
 * xml每个bean对应的属性、bean的类型都存储到BeanDefinition里面
 */
public class BeanDefinition {

    private String beanName;
    private Class beanClass;
    private Object bean;

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(String beanClass) {

        Class cls = null;
        try {
            cls = Class.forName(beanClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        this.beanClass = cls;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }
}
