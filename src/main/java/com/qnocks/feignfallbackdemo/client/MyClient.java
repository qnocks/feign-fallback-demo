package com.qnocks.feignfallbackdemo.client;

import com.qnocks.feignfallbackdemo.client.fallback.MyClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "my-client", url = "https://www0.boredapi.com/api/activity", fallback = MyClientFallback.class)
public interface MyClient {

    @GetMapping
    Object myDemo();
}
