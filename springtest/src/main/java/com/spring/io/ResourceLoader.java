package com.spring.io;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2018/11/8      Create this file
 * </pre>
 */
public class ResourceLoader {

    public Resource getResourceLoader(String url){

        return new PathResource(url);
    }

}
