package com.mingslife.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mingslife.model.Event;

public interface EventMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Event record);

	int insertSelective(Event record);

	Event selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Event record);

	int updateByPrimaryKey(Event record);

	List<Event> select(@Param("parameters") String parameters, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit);

	long count(@Param("parameters") String parameters, @Param("condition") String condition, @Param("isDistinct") boolean isDistinct);

	double sum(@Param("parameter") String parameter, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit, @Param("isDistinct") boolean isDistinct);

	Event find(@Param("id") Integer id, @Param("parameters") String parameters);
}
