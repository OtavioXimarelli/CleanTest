package dev.otavio.cleanarchstudy.core.usecases;

import dev.otavio.cleanarchstudy.core.entities.Event;

public interface CreateEventUseCase {

    public Event execute(Event event);
}
