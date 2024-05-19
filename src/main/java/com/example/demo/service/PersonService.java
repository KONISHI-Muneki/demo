package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {

  @Autowired
  private PersonRepository personRepository;

  @Transactional
  @PreAuthorize("hasAuthority('USER')")
  public List<Person> selectAll() {
    return personRepository.findAll(Sort.by("id"));
  }
}
