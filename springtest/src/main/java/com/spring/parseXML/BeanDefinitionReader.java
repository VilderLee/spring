package com.spring.parseXML;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2018/11/8      Create this file
 * </pre>
 */
public interface BeanDefinitionReader {
    void loadBeanDefinitions(String location) throws Exception;
}
