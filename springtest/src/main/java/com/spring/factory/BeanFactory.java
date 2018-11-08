package com.spring.factory;

import com.spring.exception.BeanException;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2018/11/8      Create this file
 * </pre>
 * @author dell
 */
public interface BeanFactory {

    /**
     *
     * 获取bean
     * @param name
     * @return
     */
    Object getBean(String name) throws BeanException;
}
