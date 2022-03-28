package com.gq.webtech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/greeting")
  public String greeting(@RequestParam(value = "name", defaultValue = "Hello World") String name) {
    return "Name is: " + name;
  }
}
