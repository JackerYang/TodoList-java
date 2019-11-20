package com.yangshiwei.todolist.controller;

import com.yangshiwei.todolist.service.ItemService;
import com.yangshiwei.todolist.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public Result getItems() {
        return Result.ok(itemService.getItems());
    }

    @DeleteMapping
    public Result delItems(@RequestParam ArrayList<Integer> ids) {
        return Result.ok(itemService.delItems(ids));
    }

}
