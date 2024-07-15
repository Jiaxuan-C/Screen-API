package com.bupt.service;

import com.bupt.model.DataItem;
import com.bupt.model.Event;

import java.util.List;

/**
 * @ Author: Jiaxuan Chen
 * @ Version: v1.0
 */
public interface ScreenAPIService {
    List<DataItem> getMetric(String metric);

    List<Event> getEvent();
}
