package org.gz.workorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableCircuitBreaker
@EnableFeignClients
public class WorkOrderApplication {
	public static void main(String[] args) {
		SpringApplication.run(WorkOrderApplication.class, args);
	}

}
