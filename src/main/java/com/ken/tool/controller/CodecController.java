package com.ken.tool.controller;

import com.ken.tool.utils.CodecUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/codec")
public class CodecController {

	@GetMapping("/sha1/encode")
	public String encodeSha1(String value) {
		return CodecUtils.encodeSha1(value);
	}

	@GetMapping("/sha256/encode")
	public String encodeSha256(String value) {
		return CodecUtils.encodeSha256(value);
	}

	@GetMapping("/sha384/encode")
	public String encodeSha384(String value) {
		return CodecUtils.encodeSha384(value);
	}

	@GetMapping("/sha512/encode")
	public String encodeSha512(String value) {
		return CodecUtils.encodeSha512(value);
	}

	@GetMapping("/md5/encode")
	public String encodeMd5(String value) {
		return CodecUtils.encodeMd5(value);
	}

	@GetMapping("/base64/encode")
	public String encodeBase64(String value) {
		return CodecUtils.encodeBase64(value);
	}

	@GetMapping("/base64/decode")
	public String decodeBase64(String value) {
		return CodecUtils.decodeBase64(value);
	}
}
