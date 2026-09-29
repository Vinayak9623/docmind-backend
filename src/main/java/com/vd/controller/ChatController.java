package com.vd.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chat")
@Tag(

        name = "Chat Management",
        description = "All Chat related apis"
)
public class ChatController {


    @PostMapping
    @Operation(
            summary = "here we can give any summery of this endpoint",
            description = "description of endpoints"

    )
    public ResponseEntity<String> chat(){
        return ResponseEntity.ok("This is test Endpoint");
    }
}
