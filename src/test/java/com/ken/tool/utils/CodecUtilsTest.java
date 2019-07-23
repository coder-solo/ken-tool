package com.ken.tool.utils;

import org.junit.Test;

public class CodecUtilsTest {

	@Test
	public void testEncodeMd5() {
		System.out.println(CodecUtils.encodeMd5("test"));
	}

	@Test
	public void testEncodeSha1() {
		System.out.println(CodecUtils.encodeSha1("test"));
	}

	@Test
	public void testEncodeSha224() {
		// TODO Error
		System.out.println(CodecUtils.encodeSha224("test"));
	}

	@Test
	public void testEncodeSha256() {
		System.out.println(CodecUtils.encodeSha256("test"));
	}

	@Test
	public void testEncodeSha384() {
		System.out.println(CodecUtils.encodeSha384("test"));
	}

	@Test
	public void testEncodeSha512() {
		System.out.println(CodecUtils.encodeSha512("test"));
	}
}
