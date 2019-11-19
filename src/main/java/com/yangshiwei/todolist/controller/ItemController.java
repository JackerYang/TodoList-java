package com.yangshiwei.todolist.controller;

import com.yangshiwei.todolist.model.Item;
import com.yangshiwei.todolist.service.ItemService;
import com.yangshiwei.todolist.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public Result getItem(int id) {
        return Result.ok(itemService.getItem(id));
    }

    @PostMapping
    public Result addItem(@RequestBody Item item) {
        return Result.ok(itemService.addItem(item));
    }

    @PutMapping
    public Result updateItem(@RequestBody Item item) {
        itemService.updateItem(item);
        return Result.ok();
    }

    @DeleteMapping
    public Result delItem(int id) {
        return Result.ok(itemService.delItem(id));
    }

}
