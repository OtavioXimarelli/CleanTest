package dev.otavio.cleanarchstudy.core.usecases;

import dev.otavio.cleanarchstudy.core.entities.Event;

public interface CreateEventCase {

    public Event execute(Event event);
}
