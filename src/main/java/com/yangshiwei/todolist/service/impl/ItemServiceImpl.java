package com.yangshiwei.todolist.service.impl;

import com.yangshiwei.todolist.mapper.ItemMapper;
import com.yangshiwei.todolist.model.Item;
import com.yangshiwei.todolist.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public Item[] getItems() {
        return itemMapper.getItems();
    }

    @Override
    public Item getItem(int id) {
        return itemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addItem(Item item) {
        return itemMapper.insert(item);
    }

    @Override
    public void updateItem(Item item) {
        itemMapper.updateByPrimaryKeySelective(item);
    }

    @Override
    public int delItem(int id) {
        return itemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int delItems(List<Integer> ids) {
        return itemMapper.delItems(ids);
    }
}
