/*
 * Copyright 2023 NHN (https://nhn.com) and others.
 * © NHN Corp. All rights reserved.
 */

package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hyunjin-jo
 * @since 1.0
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "hello k8s!";
    }

    @GetMapping("/")
    public String index2() {
        return "hello K8s2!";
    }
}
