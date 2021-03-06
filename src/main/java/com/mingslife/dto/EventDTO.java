package com.mingslife.dto;

import java.io.Serializable;

import com.mingslife.model.Event;

public class EventDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Event toModel() {
		Event model = new Event();
		model.setId(id);
		return model;
	}
}
