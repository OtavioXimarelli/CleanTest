package dev.otavio.cleanarchstudy.core.gateway;

import dev.otavio.cleanarchstudy.core.entities.Event;

import java.util.List;

public interface EventGateway {

    Event createEvent(Event event);

    List<Event> listEvent();

    boolean existByIdentificator(String indentificator);
}
