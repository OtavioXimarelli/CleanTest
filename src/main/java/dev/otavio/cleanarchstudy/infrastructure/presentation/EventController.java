package dev.otavio.cleanarchstudy.infrastructure.presentation;


import dev.otavio.cleanarchstudy.core.entities.Event;
import dev.otavio.cleanarchstudy.core.usecases.CreateEventCase;
import dev.otavio.cleanarchstudy.infrastructure.dto.EventDTO;
import dev.otavio.cleanarchstudy.infrastructure.mapper.EventMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/events")
public class EventController {

    private final CreateEventCase createEventCase;
    private final EventMapper eventMapper;

    public EventController(CreateEventCase createEventCase, EventMapper eventMapper) {
        this.createEventCase = createEventCase;
        this.eventMapper = eventMapper;
    }

    @PostMapping("/create")
    public ResponseEntity<EventDTO> createEvent(@RequestBody EventDTO eventDTO) {
        Event newEvent = createEventCase.execute(eventMapper.mapToEntity(eventDTO));
        var eventDtoFinal = eventMapper.mapToDto(newEvent);
        return ResponseEntity.ok(eventDtoFinal);

    }
}
