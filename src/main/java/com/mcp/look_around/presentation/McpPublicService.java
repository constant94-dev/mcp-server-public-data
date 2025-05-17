package com.mcp.look_around.presentation;

import java.util.Map;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
public class McpPublicService {
    // MCP Tool: "hello"
    @Tool(name = "HelloTargetToolsList", description = "Finds the hello.")
    public String helloTool(
            @ToolParam(description = "Name of the hello tool category to search.") String category
    ) {
        if (category.equalsIgnoreCase("hello")) {
            return "Hello, MCP!";
        }

        return "Any Hello";
    }

    // MCP Tool: "echo"
    public Map<String, Object> echo(Map<String, Object> params) {
        return Map.of("echo", params);
    }

    // MCP 표준 서버 정보
    public Map<String, Object> serverInfo() {
        return Map.of(
                "name", "look-around-mcp-server",
                "version", "0.0.1",
                "description", "Spring MVC 기반 MCP 서버 예시"
        );
    }
}
