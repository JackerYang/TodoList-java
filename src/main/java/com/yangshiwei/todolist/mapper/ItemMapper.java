package com.yangshiwei.todolist.mapper;

import com.yangshiwei.todolist.model.Item;

import java.util.List;

public interface ItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);

    Item[] getItems();

    int delItems(List<Integer> ids);
}