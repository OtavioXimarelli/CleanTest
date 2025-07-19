package dev.otavio.cleanarchstudy.infrastructure.mapper;

import dev.otavio.cleanarchstudy.core.entities.Event;
import dev.otavio.cleanarchstudy.infrastructure.dtos.EventDTO;

public class EventMapper {
    public EventDTO toEventDto(Event event) {
        return new EventDTO(
                event.id(),
                event.Name(),
                event.Description(),
                event.Location(),
                event.StartDate(),
                event.EndDate(),
                event.Owner(),
                event.Contact(),
                event.Type(),
                event.Category(),
                event.Capacity(),
                event.Identification()
        );

    }

    public Event toEventEntity(EventDTO eventDTO) {
        return new Event(
                eventDTO.id(),
                eventDTO.Name(),
                eventDTO.Description(),
                eventDTO.Location(),
                eventDTO.StartDate(),
                eventDTO.EndDate(),
                eventDTO.Owner(),
                eventDTO.Contact(),
                eventDTO.Type(),
                eventDTO.Category(),
                eventDTO.Capacity(),
                eventDTO.Identification()
        );
    }

}
