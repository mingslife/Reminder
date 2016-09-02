package com.mingslife.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mingslife.dao.EventMapper;
import com.mingslife.model.Event;
import com.mingslife.service.IEventService;
import com.mingslife.web.util.SQLUtil;

@Service
public class EventService implements IEventService {
	@Autowired
	private EventMapper eventMapper;

	@Override
	public void save(Event event) {
		eventMapper.insert(event);
	}

	@Override
	public void update(Event event) {
		eventMapper.updateByPrimaryKeySelective(event);
	}

	@Override
	public void delete(Event event) {
		eventMapper.deleteByPrimaryKey(event.getId());
	}

	@Override
	public void delete(Integer id) {
		eventMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Event find(Integer id) {
		return eventMapper.selectByPrimaryKey(id);
	}

	@Override
	public Event find(Integer id, String[] parameters) {
		return eventMapper.find(id, SQLUtil.formatParameters(parameters));
	}

	@Override
	public List<Event> load() {
		return eventMapper.select(null, null, null, null, -1, -1);
	}

	@Override
	public List<Event> load(String[] parameters) {
		return eventMapper.select(SQLUtil.formatParameters(parameters), null, null, null, -1, -1);
	}

	@Override
	public List<Event> load(String condition, Object[] values) {
		return eventMapper.select(null, SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}

	@Override
	public List<Event> load(String[] parameters, String condition, Object[] values) {
		return eventMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}

	@Override
	public List<Event> load(int curPage, int limit) {
		return eventMapper.select(null, null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Event> load(String[] parameters, int curPage, int limit) {
		return eventMapper.select(SQLUtil.formatParameters(parameters), null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Event> load(String condition, Object[] values, int curPage, int limit) {
		return eventMapper.select(null, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Event> load(String[] parameters, String condition, Object[] values, int curPage, int limit) {
		return eventMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Event> load(String condition, Object[] values, String order, String sort) {
		return eventMapper.select(null, SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}

	@Override
	public List<Event> load(String[] parameters, String condition, Object[] values, String order, String sort) {
		return eventMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}

	@Override
	public List<Event> load(String order, String sort, int curPage, int limit) {
		return eventMapper.select(null, null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Event> load(String[] parameters, String order, String sort, int curPage, int limit) {
		return eventMapper.select(SQLUtil.formatParameters(parameters), null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Event> load(String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return eventMapper.select(null, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Event> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return eventMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public long count() {
		return eventMapper.count(null, null, false);
	}

	@Override
	public long count(String condition, Object[] values) {
		return eventMapper.count(null, SQLUtil.fillCondition(condition, values), false);
	}

	@Override
	public long count(String[] parameters, boolean isDistinct) {
		return eventMapper.count(SQLUtil.formatParameters(parameters), null, isDistinct);
	}

	@Override
	public long count(String[] parameters, String condition, Object[] values, boolean isDistinct) {
		return eventMapper.count(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), isDistinct);
	}

	@Override
	public double sum(String parameter) {
		return eventMapper.sum(parameter, null, null, null, -1, -1, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values) {
		return eventMapper.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, -1, -1, false);
	}

	@Override
	public double sum(String parameter, String order, String sort, int curPage, int limit) {
		return eventMapper.sum(parameter, null, order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, int curPage, int limit) {
		return eventMapper.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return eventMapper.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit, boolean isDistinct) {
		return eventMapper.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, isDistinct);
	}
}
