package dev.otavio.cleanarchstudy.infrastructure.gateway;

import dev.otavio.cleanarchstudy.core.entities.Event;
import dev.otavio.cleanarchstudy.core.gateway.EventGateway;
import dev.otavio.cleanarchstudy.infrastructure.mapper.EventEntityMapper;
import dev.otavio.cleanarchstudy.infrastructure.persistence.EventEntity;
import dev.otavio.cleanarchstudy.infrastructure.persistence.EventRepository;
import org.springframework.stereotype.Component;

@Component
public class EventRepositoryGateway implements EventGateway {

    private final EventRepository eventRepository;
    private final EventEntityMapper eventEntityMapper;

    public EventRepositoryGateway(EventRepository eventRepository, EventEntityMapper eventEntityMapper) {
        this.eventRepository = eventRepository;
        this.eventEntityMapper = eventEntityMapper;
    }


    @Override
    public Event createEvent(Event event) {
        EventEntity entity = eventEntityMapper.toEventEntity(event);
        EventEntity savedEvent = eventRepository.save(entity);
        return eventEntityMapper.toEventDomain(savedEvent);
    }
}
