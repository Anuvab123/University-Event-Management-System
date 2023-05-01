package com.geekster.UniversityEventManagement.repository;

import com.geekster.UniversityEventManagement.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EventDao extends CrudRepository<Event,Integer> {

    public List<Event> findByDate(LocalDate date);
}
