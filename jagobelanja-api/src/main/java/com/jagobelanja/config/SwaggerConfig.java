package com.jagobelanja.config;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.net.URI;

@Component
public class SwaggerConfig {
    private final Environment env;

    public SwaggerConfig(Environment env) {
        this.env = env;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void launchSwagger() {
        try {
            String port = env.getProperty("server.port");
            String swaggerUrl = "http://localhost:"+port+"/swagger-ui.html";
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(new URI(swaggerUrl));
            } else {
                System.out.println("Desktop not supported. Open Swagger UI manually: " + swaggerUrl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
