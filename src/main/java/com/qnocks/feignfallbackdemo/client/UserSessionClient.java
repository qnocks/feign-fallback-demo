package com.qnocks.feignfallbackdemo.client;

import com.qnocks.feignfallbackdemo.client.fallback.UserSessionClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-session-service", url = "https://catfact.ninja/fact0", fallback = UserSessionClientFallback.class)
public interface UserSessionClient {
    @GetMapping
    Object validateSession();
}
