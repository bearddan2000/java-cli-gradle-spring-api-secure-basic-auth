package example.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DefaultController {

  @GetMapping("/public")
  public String publicAccess() {
      return "Hello World, publicAccess";
  }

  @GetMapping("/private")
  public String privateAccess() {
      return "Hello World, privateAccess";
  }
}
