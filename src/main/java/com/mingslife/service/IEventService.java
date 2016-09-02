package com.mingslife.service;

import java.util.List;

import com.mingslife.model.Event;

public interface IEventService {
	void save(Event event);
	void update(Event event);
	void delete(Event event);
	void delete(Integer id);
	Event find(Integer id);
	Event find(Integer id, String[] parameters);
	List<Event> load();
	List<Event> load(String[] parameters);
	List<Event> load(String condition, Object[] values);
	List<Event> load(String[] parameters, String condition, Object[] values);
	List<Event> load(int curPage, int limit);
	List<Event> load(String[] parameters, int curPage, int limit);
	List<Event> load(String condition, Object[] values, int curPage, int limit);
	List<Event> load(String[] parameters, String condition, Object[] values, int curPage, int limit);
	List<Event> load(String condition, Object[] values, String order, String sort);
	List<Event> load(String[] parameters, String condition, Object[] values, String order, String sort);
	List<Event> load(String order, String sort, int curPage, int limit);
	List<Event> load(String[] parameters, String order, String sort, int curPage, int limit);
	List<Event> load(String condition, Object[] values, String order, String sort, int curPage, int limit);
	List<Event> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit);
	long count();
	long count(String condition, Object[] values);
	long count(String[] parameters, boolean isDistinct);
	long count(String[] parameters, String condition, Object[] values, boolean isDistinct);
	double sum(String parameter);
	double sum(String parameter, String condition, Object[] values);
	double sum(String parameter, String order, String sort, int curPage, int limit);
	double sum(String parameter, String condition, Object[] values, int curPage, int limit);
	double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit);
	double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit, boolean isDistinct);
}
