package dev.otavio.cleanarchstudy.infrastructure.gateway;

import dev.otavio.cleanarchstudy.core.entities.Event;
import dev.otavio.cleanarchstudy.core.gateway.EventGateway;
import dev.otavio.cleanarchstudy.infrastructure.mapper.EventEntityMapper;
import dev.otavio.cleanarchstudy.infrastructure.persistence.EventEntity;
import dev.otavio.cleanarchstudy.infrastructure.persistence.EventRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

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


    @Override
    public List<Event> listEvent() {
        return eventRepository.findAll()
                .stream()
                .map(eventEntityMapper::toEventDomain)
                .toList();
    }

    @Override
    public boolean existByIdentificator(String indentificator) {
        return eventRepository.findAll()
                .stream()
                .anyMatch(event -> event.getIdentification().equalsIgnoreCase(indentificator));
    }

    @Override
    public Optional<Event> findByIdentification(String identification) {
        return eventRepository.findByIdentification(identification);

    }

}

