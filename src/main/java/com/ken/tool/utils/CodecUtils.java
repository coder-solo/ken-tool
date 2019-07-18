package com.ken.tool.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

public class CodecUtils {

	/**
	 * Base64加密
	 *
	 * @param value
	 * @return
	 */
	public static String encodeBase64(String value) {
		BASE64Encoder encoder = new BASE64Encoder();
		return encoder.encode(value.getBytes());
	}

	/**
	 * Base64解密
	 *
	 * @param value
	 * @return
	 */
	public static String decodeBase64(String value) {
		BASE64Decoder decoder = new BASE64Decoder();
		String result = value;
		try {
			result = new String(decoder.decodeBuffer(value));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
