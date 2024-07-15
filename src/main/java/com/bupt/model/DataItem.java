package com.bupt.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ Author: Jiaxuan Chen
 * @ Version: v1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DataItem {
    private String metric;

    private Double value;

    private Double thresholdUp;
}