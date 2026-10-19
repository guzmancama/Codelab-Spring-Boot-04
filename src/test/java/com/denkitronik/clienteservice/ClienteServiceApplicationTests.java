package com.denkitronik.clienteservice;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mockStatic;

@SpringBootTest
class ClienteServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void main_arrancaLaAplicacion() {
		// Se simula SpringApplication.run para no levantar un segundo servidor
		try (MockedStatic<SpringApplication> spring = mockStatic(SpringApplication.class)) {
			String[] args = {};
			ClienteServiceApplication.main(args);
			spring.verify(() -> SpringApplication.run(ClienteServiceApplication.class, args));
		}
	}

}
