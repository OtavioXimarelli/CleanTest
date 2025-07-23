package dev.otavio.cleanarchstudy.infrastructure.mapper;

import dev.otavio.cleanarchstudy.core.entities.Event;
import dev.otavio.cleanarchstudy.infrastructure.persistence.EventEntity;

public class EventEntityMapper {

    public EventEntity toEntity (Event event) {
        return new EventEntity(
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

    public Event toEvent (EventEntity eventEntity) {
        return new Event(
                eventEntity.getId(),
                eventEntity.getName(),
                eventEntity.getDescription(),
                eventEntity.getLocation(),
                eventEntity.getStartDate(),
                eventEntity.getEndDate(),
                eventEntity.getOwner(),
                eventEntity.getContact(),
                eventEntity.getType(),
                eventEntity.getCategory(),
                eventEntity.getCapacity(),
                eventEntity.getIdentification()
        );

    }

}
