package com.mingslife.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mingslife.dto.UserDTO;
import com.mingslife.model.User;
import com.mingslife.service.IUserService;
import com.mingslife.web.controller.BaseController;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	@Autowired
	private IUserService userService;

	public String index(@RequestParam(value = "page", required = false) Integer curPage, Model model) {
		return "index";
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute UserDTO userDTO) {
		userService.save(userDTO.toModel());
		return "{}";
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String show(@RequestParam("id") Integer id) {
		User user = userService.find(id, new String[] {"id"});
		return gson.toJson(user);
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute UserDTO userDTO, Model model) {
		userService.update(userDTO.toModel());
		return "{}";
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.DELETE)
	public String destory(@RequestParam("id") Integer id) {
		userService.delete(id);
		return "{}";
	}

	@ResponseBody
	@RequestMapping(value = "/deletes", method = RequestMethod.POST)
	public String deletes(@RequestParam("ids[]") List<Integer> ids) {
		for (Integer id : ids) {
			userService.delete(id);
		}
		return "{}";
	}
}
