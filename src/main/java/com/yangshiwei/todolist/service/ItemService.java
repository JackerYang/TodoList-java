package com.yangshiwei.todolist.service;

import com.yangshiwei.todolist.model.Item;

import java.util.List;

public interface ItemService {
    Item[] getItems();

    Item getItem(int id);

    int addItem(Item item);

    void updateItem(Item item);

    int delItem(int id);

    int delItems(List<Integer> ids);

}
