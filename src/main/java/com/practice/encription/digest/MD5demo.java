package com.practice.encription.digest;

import sun.misc.BASE64Encoder;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Luo Bao Ding
 * @since 2018/8/13
 */
public class MD5demo {

    public String digest(String content) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] utf8s = md5.digest(content.getBytes(StandardCharsets.UTF_8));
            return new BASE64Encoder().encode(utf8s);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        MD5demo md5demo = new MD5demo();
        String digest = md5demo.digest("hello, every one");
        System.out.println("digest = " + digest);
    }
}
