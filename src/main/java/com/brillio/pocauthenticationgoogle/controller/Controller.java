package com.brillio.pocauthenticationgoogle.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

	String name;
	String picture;

	@RequestMapping("/index")
	public String index(@AuthenticationPrincipal OAuth2User oAuth2User, Model model){
		name=oAuth2User.getAttribute("name").toString();
		picture=oAuth2User.getAttribute("picture").toString();
		model.addAttribute("name",name);
		model.addAttribute("picture",picture);
		return "index.jsp";
	}
}
