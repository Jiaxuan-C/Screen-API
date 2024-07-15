package com.bupt.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ Author: Jiaxuan Chen
 * @ Version: v1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DataValue {
    private List<Double> value;

    private List<Double> total;
}