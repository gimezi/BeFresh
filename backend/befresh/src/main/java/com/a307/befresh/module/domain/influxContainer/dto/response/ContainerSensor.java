package com.a307.befresh.module.domain.influxContainer.dto.response;

import com.influxdb.query.FluxRecord;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Builder;

@Builder
public record ContainerSensor (


    Long foodId,
    String qrId,

    String name,
    LocalDateTime regDttm,
    Integer elapsedTime,
    LocalDate expirationDate,

    String refresh,

    SensorDataList sensorDataList

){

}
