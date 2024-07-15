package com.bupt.constant;


public class ApplicationConstant {
    // 指标类型
    public static final String  METRIC_TEMPERATURE = "temperature";
    public static final String  METRIC_HUMIDITY = "humidity";
    public static final String  METRIC_PRESSURE_LEVEL = "pressure_level";
    public static final String  METRIC_ILLUMINATION = "illumination";
    // 指标阈值
    public static final Double  TEMPERATURE_THRESHOLD_UP = 10.0;
    public static final Double  TEMPERATURE_THRESHOLD_DOWN = 30.0;

    public static final Double  HUMIDITY_THRESHOLD_UP = 10.0;
    public static final Double  HUMIDITY_THRESHOLD_DOWN = 30.0;

    public static final Double  PRESSURE_LEVEL_THRESHOLD_UP = 10.0;
    public static final Double  PRESSURE_LEVEL_THRESHOLD_DOWN = 30.0;

    public static final Double  ILLUMINATION_THRESHOLD_UP = 10.0;
    public static final Double  ILLUMINATION_THRESHOLD_DOWN = 30.0;

    // Kafka topic
    public static final String  KAFKA_METRIC_TOPIC = "metric_yzs";
}
