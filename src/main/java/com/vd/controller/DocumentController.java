package com.vd.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/v1/documents")
@Tag(

        name="Document management",
        description = "Endpoint for uploading, listing and managing documents and their vector embedding"
)
public class DocumentController {


    @PostMapping("/")
    public ResponseEntity<String> uploadDocument() {
        return ResponseEntity.ok("uploaded");
    }


}
