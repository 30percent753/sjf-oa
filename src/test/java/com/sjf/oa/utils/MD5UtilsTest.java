package com.sjf.oa.utils;

import junit.framework.TestCase;
import org.junit.Test;

public class MD5UtilsTest extends TestCase {

    @Test
    public void testMd5Digest() {
        System.out.println(MD5Utils.md5Digest("test"));
        System.out.println(MD5Utils.md5Digest("aest"));
        System.out.println(MD5Utils.md5Digest("tese"));
        System.out.println(MD5Utils.md5Digest("tcst"));
    }
}