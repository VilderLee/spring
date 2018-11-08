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
public interface Resource {
    InputStream getInputStream() throws IOException;
}
