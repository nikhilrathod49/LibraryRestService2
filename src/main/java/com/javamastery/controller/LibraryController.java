package com.javamastery.controller;

import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

	HashMap<String, String> getAutherList() {
		HashMap<String, String> autherList = new HashMap<>();
		autherList.put("nikhil", "javaMastery");
		autherList.put("ganesh", "python");
		autherList.put("ramesh", "c");
		autherList.put("pritam", "c++");
		return autherList;
	}

	@GetMapping("/findByAuther/{autherName}")
	public ResponseEntity<String> findByAuther(@PathVariable("autherName") String autherName) {
		String book = getAutherList().get(autherName);
		if (book == null)
			return null;
		else
			return ResponseEntity.ok(book);
	}

}
