package dev.otavio.cleanarchstudy.core.gateway;

import dev.otavio.cleanarchstudy.core.entities.Event;

import java.util.List;

public interface EventGateway {

    public Event createEvent (Event event);

    public List<Event> listEvent (Event event);
}
