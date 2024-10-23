package com.redgogh.common.crypto.codec;

import com.redgogh.common.crypto.Base64;

import static com.redgogh.common.BasicConverter.atos;

/**
 * @author RedGogh
 */
public class Base64Codec implements Base64 {
    @Override
    public String encode(String source) {
        return encodeBytes(source.getBytes());
    }

    @Override
    public String encodeBytes(byte[] b) {
        return java.util.Base64.getUrlEncoder().encodeToString(b);
    }

    @Override
    public String decode(String src) {
        return atos(decodeBytes(src));
    }

    @Override
    public byte[] decodeBytes(String src) {
        return java.util.Base64.getUrlDecoder().decode(src);
    }

}
