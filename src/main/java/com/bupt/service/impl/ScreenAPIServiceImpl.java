package com.bupt.service.impl;

import com.bupt.mapper.ScreenAPIMapper;
import com.bupt.model.DataItem;
import com.bupt.model.Event;
import com.bupt.service.ScreenAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author: Jiaxuan Chen
 * @ Version: v1.0
 */
@Service
public class ScreenAPIServiceImpl implements ScreenAPIService {
    @Autowired
    public ScreenAPIMapper screenAPIMapper;
    @Override
    public List<DataItem> getMetric(String metric) {
        return screenAPIMapper.getMetric(metric);
    }

    @Override
    public List<Event> getEvent() {
        return screenAPIMapper.getEvent();
    }
}