package com.example.Property;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:restUrls.properties")
public class PropertyReader {
	Properties p;

	public PropertyReader() {
		p =  new Properties();
	}	
	
	public String getProperty(String key) {
		return p.getProperty(key);
	}
}
