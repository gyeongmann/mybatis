package com.example.mybatis_test.config;

import org.h2.tools.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;

@Configuration
public class H2ServerConfig {
    @Bean
    public Server h2TcpServer() throws SQLException {
        return Server.createTcpServer("-tcpAllowOthers", "-tcpPort", "9092").start();
    }
}
