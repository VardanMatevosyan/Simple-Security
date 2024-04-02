package org.example.simplesecurity.rest;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @GetMapping("/")
  public String hello(@AuthenticationPrincipal User principal) {
    System.out.println("Hello ");
    return "Hello " + principal.getUsername() + "! Your roles: " + principal.getAuthorities();
  }

}
