package com.devtalks.spring.session2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ConfigurationProperties
@ImportResource({"classpath:com/devtalks/spring/session2/app-context.xml"})
public class Session2Config {

}
