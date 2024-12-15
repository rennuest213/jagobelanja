package com.jagobelanja.config;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.net.URI;

@Component
public class SwaggerConfig {

    @EventListener(ApplicationReadyEvent.class)
    public void launchSwagger() {
        try {
            String port = System.getenv("PORT");
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
