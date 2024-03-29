package cn.itcast.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
// 开启网关功能
@EnableZuulProxy
@EnableDiscoveryClient
public class ItcastZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItcastZuulApplication.class, args);
	}

}
