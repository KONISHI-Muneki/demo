package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListPagingAndSortingRepository;

import com.example.demo.entity.Person;

public interface PersonRepository extends ListPagingAndSortingRepository<Person, String> {

  Person findById(String id);

  List<Person> findByName(String name);

  List<Person> findByLocation(String location);

  List<Person> findByBirthDate(String birthDate);

  List<Person> findByBirthDateLike(String birthDate);

  @Query("SELECT * FROM Person WHERE birth_date like :year + '%'")
  List<Person> findByBirthDayYear(String year);
}
