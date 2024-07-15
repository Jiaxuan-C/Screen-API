package com.bupt.mapper;

import com.bupt.model.DataItem;
import com.bupt.model.Event;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScreenAPIMapper {
    @Select("select metric, value, threshold_up from metric_messages where metric = #{metric} order by timestamp_unix desc limit 1")
    List<DataItem> getMetric(String metric);


    @Select("select * from event order by timestamp_unix desc limit 20")
    List<Event> getEvent();
}
