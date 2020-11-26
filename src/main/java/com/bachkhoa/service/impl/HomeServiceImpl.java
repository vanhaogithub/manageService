package com.bachkhoa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bachkhoa.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Override
	public List<String> loadMenu() {
		List<String> menus = new ArrayList<>();
		menus.add("Blog Java web");
		menus.add("Huong dan hoc Java web");
		menus.add("Lien he");
		menus.add("Thanh toan");
		return menus;
	}

}
