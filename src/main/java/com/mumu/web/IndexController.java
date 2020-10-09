package com.mumu.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class IndexController {

    @GetMapping("/rest")
    public String rest(@RequestParam String name) {
        return "success";
    }
}
