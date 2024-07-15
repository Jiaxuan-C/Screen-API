package com.bupt.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.kafka.common.protocol.types.Field;

/**
 * @ Author: Jiaxuan Chen
 * @ Version: v1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    private String metric;
    private String describe;
    private String timestamp;
    private Long timestampUnix;
}