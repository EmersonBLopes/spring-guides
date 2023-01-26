package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoController {
	
	private static final String template = "Olá, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/saudacao")
	public Saudacao digaOla(@RequestParam(value = "nome", defaultValue = "mundo")String nome) {
		return new Saudacao(counter.incrementAndGet(),String.format(template, nome));
	}
}
