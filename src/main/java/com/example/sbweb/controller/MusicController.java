package com.example.sbweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {
	@GetMapping
	public String getMusic()
	{
		return "Welcome to the music app";
	}

}
