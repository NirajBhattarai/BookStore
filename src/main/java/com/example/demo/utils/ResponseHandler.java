package com.example.demo.utils;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {

	public static ResponseEntity<Object> response(HttpStatus httpStatus, Boolean isError, String message,
			Object responseObject) {

		Map<String, Object> map = new TreeMap<>();
		map.put("timestamp", new Date().getTime());
		map.put("status", httpStatus.value());
		map.put("isError", isError);

		map.put("message", message);
		map.put("responseObject", responseObject);
		return new ResponseEntity<>(map, httpStatus);

	}

}
