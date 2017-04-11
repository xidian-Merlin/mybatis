package com.elin4it.ssm.utils;

/**
 * Created by tongho on 2017/4/11.
 */
import org.apache.shiro.crypto.hash.Md5Hash;

public class EncryptUtils {
    public static final String encryptMD5(String source) {
        if (source == null) {
            source = "";
        }
        Md5Hash md5 = new Md5Hash(source);
        return md5.toString();
    }
}
