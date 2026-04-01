package com.hmall.api.client;

import com.hmall.api.config.DefaultFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "trade-service", configuration = DefaultFeignConfig.class)
public interface tradeClient {



}
