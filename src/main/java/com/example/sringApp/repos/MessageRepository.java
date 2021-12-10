package com.example.sringApp.repos;

import com.example.sringApp.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface MessageRepository extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);


}
