package dev.otavio.cleanarchstudy.infrastructure.presentation;


import dev.otavio.cleanarchstudy.core.entities.Event;
import dev.otavio.cleanarchstudy.core.usecases.CreateEventUseCase;
import dev.otavio.cleanarchstudy.core.usecases.FindEventUseCase;
import dev.otavio.cleanarchstudy.infrastructure.dto.EventDTO;
import dev.otavio.cleanarchstudy.infrastructure.mapper.EventDtoMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/events")
public class EventController {

    private final CreateEventUseCase createEventUseCase;
    private final EventDtoMapper eventDtoMapper;
    private final FindEventUseCase findEventUseCase;

    public EventController(CreateEventUseCase createEventUseCase, EventDtoMapper eventDtoMapper, FindEventUseCase findEventUseCase) {
        this.createEventUseCase = createEventUseCase;
        this.eventDtoMapper = eventDtoMapper;
        this.findEventUseCase = findEventUseCase;
    }

    @PostMapping("/create")
    public ResponseEntity<EventDTO> createEvent(@RequestBody EventDTO eventDTO) {
        Event newEvent = createEventUseCase.execute(eventDtoMapper.mapToEntity(eventDTO));
        var eventDtoFinal = eventDtoMapper.mapToDto(newEvent);
        return ResponseEntity.status(HttpStatus.CREATED).body(eventDtoFinal);

    }

    @GetMapping("/list")
    public List<EventDTO> listEvent (){
        return findEventUseCase.execute()
                .stream()
                .map(eventDtoMapper::mapToDto)
                .collect(Collectors.toList());


    }
}
