package com.boujdi.productService;

import org.axonframework.commandhandling.CommandCallback;
import org.axonframework.commandhandling.CommandMessage;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.common.Registration;
import org.axonframework.messaging.MessageDispatchInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Bean
	public CommandGateway commandGateway() {
		return new CommandGateway() {
			@Override
			public <C, R> void send(C c, CommandCallback<? super C, ? super R> commandCallback) {

			}

			@Override
			public <R> R sendAndWait(Object o) {
				return null;
			}

			@Override
			public <R> R sendAndWait(Object o, long l, TimeUnit timeUnit) {
				return null;
			}

			@Override
			public <R> CompletableFuture<R> send(Object o) {
				return null;
			}

			@Override
			public Registration registerDispatchInterceptor(MessageDispatchInterceptor<? super CommandMessage<?>> messageDispatchInterceptor) {
				return null;
			}
		};
	}
}
