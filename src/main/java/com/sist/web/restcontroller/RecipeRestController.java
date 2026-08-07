package com.sist.web.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import java.util.*;
import com.sist.web.entity.*;
import com.sist.web.service.*;

@RestController
@RequiredArgsConstructor
public class RecipeRestController {
	private final RecipeService rService;
	
	@RequestMapping("/recipe/find_vue")
	// 반드시 비동기 => async
	public ResponseEntity<Map> recipe_find(@RequestParam("page") int page, @RequestParam("fd") String fd) {
		
		Map map=new HashMap();
		try {
			List<Recipe> list=rService.findByTitleContains(fd, page);
			int[] pages=rService.getPageDataFind(1, page, 12, fd);
			map.put("list", list);
			map.put("pages", pages);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok(map);
		
	}
	@RequestMapping("/recipe/chef_recipe_vue")
	// 반드시 비동기 => async
	public ResponseEntity<Map> recipe_chef_recipe(@RequestParam("page") int page, @RequestParam("chef") String chef) {
		
		Map map=new HashMap();
		try {
			List<Recipe> list=rService.findByChefContains(chef, page);
			int[] pages=rService.getPageDataFind(2, page, 12, chef);
			map.put("list", list);
			map.put("pages", pages);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok(map);
		
	}
	
}
