package com.qnocks.feignfallbackdemo.client.fallback;


import com.qnocks.feignfallbackdemo.client.MyClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyClientFallback implements MyClient {
    @Override
    public Object myDemo() {
        log.info("[Fallback] myClient");
        return null;
    }
}
