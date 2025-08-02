package dev.otavio.cleanarchstudy.infrastructure.presentation;


import dev.otavio.cleanarchstudy.core.entities.Event;
import dev.otavio.cleanarchstudy.core.usecases.CreateEventCase;
import dev.otavio.cleanarchstudy.core.usecases.FindEventCase;
import dev.otavio.cleanarchstudy.infrastructure.dto.EventDTO;
import dev.otavio.cleanarchstudy.infrastructure.mapper.EventDtoMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/events")
public class EventController {

    private final CreateEventCase createEventCase;
    private final EventDtoMapper eventDtoMapper;
    private final FindEventCase findEventCase;

    public EventController(CreateEventCase createEventCase, EventDtoMapper eventDtoMapper, FindEventCase findEventCase) {
        this.createEventCase = createEventCase;
        this.eventDtoMapper = eventDtoMapper;
        this.findEventCase = findEventCase;
    }

    @PostMapping("/create")
    public ResponseEntity<EventDTO> createEvent(@RequestBody EventDTO eventDTO) {
        Event newEvent = createEventCase.execute(eventDtoMapper.mapToEntity(eventDTO));
        var eventDtoFinal = eventDtoMapper.mapToDto(newEvent);
        return ResponseEntity.status(HttpStatus.CREATED).body(eventDtoFinal);

    }

    @GetMapping("/list")
    public ResponseEntity<List<Event>> listEvent (Event events){
        List<Event> list = findEventCase.execute(events);
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }
}
