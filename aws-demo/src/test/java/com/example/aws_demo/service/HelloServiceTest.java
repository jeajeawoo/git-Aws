package com.example.aws_demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloServiceTest {

    @Autowired
    HelloService helloService;

    @Test
    void Sum() {
        int a =helloService.Sum(5,6);
        assertEquals(11,a);
    }
}