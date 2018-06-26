package com.sykean;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;
import java.io.PrintStream;

@SpringBootApplication
@EnableAsync
@ComponentScan(basePackages = { "com.sykean"})
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(Application.class);
        application.setBanner(new Banner() {
            public void printBanner(Environment arg0, Class<?> arg1, PrintStream arg2) {
            }
        });
        application.run(args);

    }

}
