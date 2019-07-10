package com.bootcamp.demo.controller;

import com.bootcamp.demo.entity.representation.DemoRepresentation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "api/demo")
public class DemoController {

    @GetMapping(produces = "application/json")
    @ResponseBody
    public DemoRepresentation demo() {
        String unusedVariable = "I am unused";

        return new DemoRepresentation("Hello world!");
    }
}
