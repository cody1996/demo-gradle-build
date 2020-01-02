package org.example.demo.admin.controller;

import org.example.demo.admin.api.dto.CodeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cody
 */
@RestController
@RequestMapping("/api/codes")
public class CodeController {

    @GetMapping("/{id}")
    public CodeDTO getCode(@PathVariable Long id) {
        return new CodeDTO().setId(id).setKey("key").setValue("value");
    }
}
