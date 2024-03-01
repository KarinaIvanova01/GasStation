package com.example.gasstations.config.FeignConfig;

import com.example.gasstations.models.Dto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "gasStationClient",
        url = "https://wejago.de/assets/data/",
        configuration = FeignClientProperties.FeignClientConfiguration.class)
public interface GasStationClient {

    @RequestMapping(method = RequestMethod.GET,value = "gas-stations-data.json",
            produces = MediaType.APPLICATION_JSON_VALUE)
    Dto getGasStationData();
}
