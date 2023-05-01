package com.geekster.UniversityEventManagement.controllers;

import com.geekster.UniversityEventManagement.models.Event;
import com.geekster.UniversityEventManagement.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventService;

    @PostMapping(value="/addevents")
    public String addEvents(@RequestBody List<Event> eventList){
        return eventService.postEvents(eventList);
    }

    @GetMapping(value="/getbydate/{date}")
    public List<Event> getEventByDate(@PathVariable String date){
        return eventService.fetchBydate(date);
    }

    @PutMapping(value="/update/{id}")
    public void updateEvent(@PathVariable Integer id,@RequestBody Event event){
        eventService.updateEventById(id,event);
    }

    @DeleteMapping(value="/delete/event/{id}")
    public String deleteEventById(@PathVariable Integer id){
        return eventService.deleteStudent(id);
    }
}
