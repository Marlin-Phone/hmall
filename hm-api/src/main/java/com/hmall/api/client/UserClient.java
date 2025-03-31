package com.hmall.api.client;

import com.hmall.api.config.DefaultFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "user-service", configuration = DefaultFeignConfig.class)
public interface UserClient {

}
