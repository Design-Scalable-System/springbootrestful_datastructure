/**
 * 
 */
package com.dss.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(value= {"com.dss.*"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
