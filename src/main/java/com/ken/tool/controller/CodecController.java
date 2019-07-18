package com.ken.tool.controller;

import com.ken.tool.utils.CodecUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/codec")
public class CodecController {

	@GetMapping("/base64/encode")
	public String encodeBase64(String value) {
		return CodecUtils.encodeBase64(value);
	}

	@GetMapping("/base64/decode")
	public String decodeBase64(String value) {
		return CodecUtils.decodeBase64(value);
	}
}
