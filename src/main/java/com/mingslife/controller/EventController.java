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

import com.mingslife.dto.EventDTO;
import com.mingslife.model.Event;
import com.mingslife.service.IEventService;
import com.mingslife.web.controller.BaseController;

@Controller
@RequestMapping("/event")
public class EventController extends BaseController {
	@Autowired
	private IEventService eventService;

	public String index(@RequestParam(value = "page", required = false) Integer curPage, Model model) {
		return "index";
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute EventDTO eventDTO) {
		eventService.save(eventDTO.toModel());
		return "{}";
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String show(@RequestParam("id") Integer id) {
		Event event = eventService.find(id, new String[] {"id"});
		return gson.toJson(event);
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute EventDTO eventDTO, Model model) {
		eventService.update(eventDTO.toModel());
		return "{}";
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.DELETE)
	public String destory(@RequestParam("id") Integer id) {
		eventService.delete(id);
		return "{}";
	}

	@ResponseBody
	@RequestMapping(value = "/deletes", method = RequestMethod.POST)
	public String deletes(@RequestParam("ids[]") List<Integer> ids) {
		for (Integer id : ids) {
			eventService.delete(id);
		}
		return "{}";
	}
}
