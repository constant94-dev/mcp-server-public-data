/*
package com.mcp.look_around.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.modelcontextprotocol.server.transport.WebMvcSseServerTransportProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class McpConfig {
    private static final String MESSAGE_ENDPOINT = "/mcp/message";

    @Bean
    public WebMvcSseServerTransportProvider webMvcSseServerTransport(ObjectMapper mapper) {
        return new WebMvcSseServerTransportProvider(mapper, MESSAGE_ENDPOINT);
    }

    @Bean
    public RouterFunction<ServerResponse> mcpRouterFunction(WebMvcSseServerTransportProvider transportProvider) {
        return transportProvider.getRouterFunction();
    }
}
*/
