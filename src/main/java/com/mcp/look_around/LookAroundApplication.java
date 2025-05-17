package com.mcp.look_around;

import com.mcp.look_around.presentation.McpPublicService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LookAroundApplication {

    @Bean
    public ToolCallbackProvider helloTools(McpPublicService mcpPublicService) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(mcpPublicService)
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(LookAroundApplication.class, args);
    }

}
