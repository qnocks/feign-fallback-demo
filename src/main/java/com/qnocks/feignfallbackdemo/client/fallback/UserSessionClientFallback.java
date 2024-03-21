package com.qnocks.feignfallbackdemo.client.fallback;

import com.qnocks.feignfallbackdemo.client.UserSessionClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserSessionClientFallback implements UserSessionClient {
    @Override
    public Object validateSession() {
        log.info("[Fallback] validateSession");
        return null;
    }
}
