package dev.otavio.cleanarchstudy.core.gateway;

import dev.otavio.cleanarchstudy.core.entities.Event;

import java.util.List;
import java.util.Optional;

public interface EventGateway {

    Event createEvent(Event event);

    List<Event> listEvent();

    boolean existByIdentificator(String indentificator);

    Optional<Event> findByIdentification(String identification);
}
