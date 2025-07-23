package dev.otavio.cleanarchstudy.infrastructure.presentation;


import dev.otavio.cleanarchstudy.core.entities.Event;
import dev.otavio.cleanarchstudy.core.usecases.CreateEventCase;
import dev.otavio.cleanarchstudy.infrastructure.dto.EventDTO;
import dev.otavio.cleanarchstudy.infrastructure.mapper.EventDtoMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/events")
public class EventController {

    private final CreateEventCase createEventCase;
    private final EventDtoMapper eventDtoMapper;

    public EventController(CreateEventCase createEventCase, EventDtoMapper eventDtoMapper) {
        this.createEventCase = createEventCase;
        this.eventDtoMapper = eventDtoMapper;
    }

    @PostMapping("/create")
    public ResponseEntity<EventDTO> createEvent(@RequestBody EventDTO eventDTO) {
        Event newEvent = createEventCase.execute(eventDtoMapper.mapToEntity(eventDTO));
        var eventDtoFinal = eventDtoMapper.mapToDto(newEvent);
        return ResponseEntity.ok(eventDtoFinal);

    }
}
