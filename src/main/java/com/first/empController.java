package com.first;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class empController {
	
	@Autowired
	private empServiceImpl empser;
	
	@GetMapping("/emp/{name}")
	public List<employ> getEmployWithName(@PathVariable String name) {
		List<employ> list = empser.allemploy();
		System.out.println(list);
		
		List<employ> em =list.stream().filter(x->x.getName().equals(name)).collect(Collectors.toList());
		
		return em;
		
		
		
		
		
	}

}
