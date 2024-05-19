package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;

@RestController
@RequestMapping("/")
public class DemoController {

  @Autowired
  private PersonService personService;

  @GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
  public List<Person> get() {
    return personService.selectAll();
  }
}
