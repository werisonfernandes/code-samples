package br.com.werison.jms.api.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.werison.jms.api.consumer.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

   public Person getByName(String name);
      
}