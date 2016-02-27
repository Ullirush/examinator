package com.examinator.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by tr0tt3l on 27.02.16.
 */
@Configuration //definiert Klasse als Spring configuration class
@EnableWebMvc  // aktiviert Empfang von web requests
@ComponentScan(basePackages = {"com.examinator.controller"}) //scant das pack. nach Spring Komponenten
public class AppConfig {
}
