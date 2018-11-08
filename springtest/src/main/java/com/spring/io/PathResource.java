package com.spring.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2018/11/8      Create this file
 * </pre>
 */
public class PathResource implements Resource{

    private final String path;

    public PathResource(String path) {
        this.path = path;
    }

    public InputStream getInputStream() throws IOException {
        //通过父类的 类加载器去加载文件
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(path);
        return inputStream;
    }
}
