package com.ken.tool.utils;

import org.apache.commons.codec.digest.DigestUtils;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

public class CodecUtils {

	/**
	 * SHA-1加密
	 *
	 * @param value
	 * @return
	 */
	public static String encodeSha1(String value) {
		return DigestUtils.sha1Hex(value);
	}

	/**
	 * SHA-224加密
	 *
	 * @param value
	 * @return
	 */
	public static String encodeSha224(String value) {
		return DigestUtils.sha3_224Hex(value);
	}

	/**
	 * SHA-256加密
	 *
	 * @param value
	 * @return
	 */
	public static String encodeSha256(String value) {
		return DigestUtils.sha256Hex(value);
	}

	/**
	 * SHA-384加密
	 *
	 * @param value
	 * @return
	 */
	public static String encodeSha384(String value) {
		return DigestUtils.sha384Hex(value);
	}

	/**
	 * SHA-512加密
	 *
	 * @param value
	 * @return
	 */
	public static String encodeSha512(String value) {
		return DigestUtils.sha512Hex(value);
	}

	/**
	 * MD5加密
	 *
	 * @param value
	 * @return
	 */
	public static String encodeMd5(String value) {
		return DigestUtils.md5Hex(value);
	}

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
