package com.sistemadepedidos.sistema_de_pedido.config;

import com.sistemadepedidos.sistema_de_pedido.services.DBTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private DBTestService dbTestService;

    @Bean
    public boolean instantiateDataBase() throws ParseException {
        dbTestService.instantiateTestDataBase();
        return true;
    }

}