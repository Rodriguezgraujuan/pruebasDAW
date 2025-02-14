package com.example.demo;

import com.example.demo.controller.UsuarioController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;


import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class UsuarioControllerTest {


    @Autowired
    private UsuarioController usuarioController;


    @Test
    void contextLoads() {
        assertThat(usuarioController).isNotNull();
    }
}
