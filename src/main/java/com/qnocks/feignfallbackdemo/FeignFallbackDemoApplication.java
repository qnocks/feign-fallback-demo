package com.qnocks.feignfallbackdemo;

import com.qnocks.feignfallbackdemo.client.MyClient;
import com.qnocks.feignfallbackdemo.client.UserSessionClient;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableFeignClients
@SpringBootApplication
@RestController
@RequiredArgsConstructor
public class FeignFallbackDemoApplication {

	private final UserSessionClient userSessionClient;
	private final MyClient myClient;

	@GetMapping("/demo")
	public Object demo() {
		return userSessionClient.validateSession();
	}

	@GetMapping("/demo2")
	public Object demo2() {
		return myClient.myDemo();
	}

	public static void main(String[] args) {
		SpringApplication.run(FeignFallbackDemoApplication.class, args);
	}
}
