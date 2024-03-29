package com.onlineclass.sysadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminUserController {
	
	@RequestMapping(value = "/adminuser")
	public String userListPage(@RequestParam(value = "page", required = false) String page,
							@RequestParam(value = "col", required = false) String col,
							@RequestParam(value = "sort", required = false) String sort,Model model) {
		return "UserListView";
	}
	
	@RequestMapping(value = "/adminuser/edit")
	public String updateUserPage(@RequestParam(value = "id", required = true) Integer id) {
		return "UpdateUserView";
	}
	
	@RequestMapping(value = "/adminuser/new")
	public String newUserPage(Model model) {
		return "NewUserView";
	}
}
