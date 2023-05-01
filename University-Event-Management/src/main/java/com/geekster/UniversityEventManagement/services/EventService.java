package com.geekster.UniversityEventManagement.services;

import com.geekster.UniversityEventManagement.models.Event;
import com.geekster.UniversityEventManagement.repository.EventDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventService {
    @Autowired
    EventDao eventDao;
    public String postEvents(List<Event> eventList) {
        Iterable<Event> list=eventDao.saveAll(eventList);
        if(list!=null)
            return "Event saved";
        else
            return "Event not saved";
    }

    public List<Event> fetchBydate(String date) {
        return eventDao.findByDate(LocalDate.parse(date));
    }

    public void updateEventById(Integer id,Event event) {
        eventDao.deleteById(id);
        eventDao.save(event);
    }

    public String deleteStudent(Integer id) {
        eventDao.deleteById(id);
        return "deleted";
    }
}
