package com.example.managementporttest.child;

import org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
@ImportAutoConfiguration({
        EmbeddedWebServerFactoryCustomizerAutoConfiguration.class,
        ManagementContextAutoConfiguration.class
})
public class ChildModule {
    public static final String CHILD_PROFILE = "child";
}
