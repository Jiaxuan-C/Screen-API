package com.bupt.controller;

import com.bupt.model.*;
import com.bupt.service.ScreenAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

/**
 * @ Author: Jiaxuan Chen
 * @ Version: v1.0
 */
@RestController
@RequestMapping("/data/api")
public class ScreenAPIController {
    @Autowired
    public ScreenAPIService screenAPIService;

    @GetMapping("/{metric}")
    public Result<List<DataItem>> getMetric(@PathVariable String metric) {
        return Result.success(screenAPIService.getMetric(metric));
    }

    @GetMapping("/elec")
    public Result<List<DataItem>> getMetric() {
        ArrayList<DataItem> dataItems = new ArrayList<>();
        List<DataItem> list = screenAPIService.getMetric("power");
        List<DataItem> list1 = screenAPIService.getMetric("transformer");
        List<DataItem> list2 = screenAPIService.getMetric("ups");

        dataItems.add(list.get(0));
        dataItems.add(list1.get(0));
        dataItems.add(list2.get(0));

        return Result.success(dataItems);
    }

    @GetMapping("/event")
    public Result<List<Event>> getEvent() {
        return Result.success(screenAPIService.getEvent());
    }
}