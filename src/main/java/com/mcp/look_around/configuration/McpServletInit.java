/*
package com.mcp.look_around.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.modelcontextprotocol.server.McpServer;
import io.modelcontextprotocol.server.McpServerFeatures;
import io.modelcontextprotocol.server.McpSyncServer;
import io.modelcontextprotocol.server.transport.WebMvcSseServerTransportProvider;
import io.modelcontextprotocol.spec.McpSchema;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

import static io.modelcontextprotocol.spec.McpSchema.*;

@Configuration
public class McpServletInit {

    @Bean
    public McpSyncServer mcpServer(WebMvcSseServerTransportProvider transportProvider) {
        var emptyInputSchema = new JsonSchema(
                "object",
                Map.of(),
                List.of(),
                false,
                Map.of(),
                Map.of()
        );

        // Tool 스펙 정의
        var helloTool = new McpServerFeatures.SyncToolSpecification(
                new Tool("hello", "간단한 인사 툴", emptyInputSchema),
                (exchange, arguments) -> {
                    // arguments: Map<String, Object>
                    return new CallToolResult("Hello, MCP!", false);
                }


        );
        // 3. calculatorTool (AI 샘플링)
        var calculatorTool = new McpServerFeatures.SyncToolSpecification(
                new Tool("ai-calculator", "Performs calculations using AI", emptyInputSchema),
                (exchange, arguments) -> {
                    if (exchange.getClientCapabilities().sampling() == null) {
                        return new CallToolResult("Client does not support AI capabilities", false);
                    }
                    CreateMessageRequest request = CreateMessageRequest.builder()
                            .messages(List.of(new McpSchema.SamplingMessage(
                                    McpSchema.Role.USER,
                                    new McpSchema.TextContent("Calculate: " + arguments.get("expression"))
                            )))
                            .modelPreferences(McpSchema.ModelPreferences.builder()
                                    .hints(List.of(
                                            McpSchema.ModelHint.of("claude-3-sonnet"),
                                            McpSchema.ModelHint.of("claude")
                                    ))
                                    .intelligencePriority(0.8)
                                    .speedPriority(0.5)
                                    .build())
                            .systemPrompt("You are a helpful calculator assistant. Provide only the numerical answer.")
                            .maxTokens(100)
                            .build();
                    McpSchema.CreateMessageResult result = exchange.createMessage(request);
                    String answer = result.content().toString();
                    return new CallToolResult(answer, false);
                }
        );

        // 4. MCP 서버 빌드 및 Tool 등록
        return McpServer.sync(transportProvider)
                .serverInfo("look-around-mcp-server", "0.0.1")
                .capabilities(ServerCapabilities.builder().tools(true).build())
                .tools(helloTool, calculatorTool)
                .build();
    }
}
*/
