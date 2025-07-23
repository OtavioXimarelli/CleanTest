package dev.otavio.cleanarchstudy.core.gateway;

import dev.otavio.cleanarchstudy.core.entities.Event;

public interface EventGateway {

    public Event createEvent (Event event);
}
