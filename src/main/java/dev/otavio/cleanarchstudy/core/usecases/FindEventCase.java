package dev.otavio.cleanarchstudy.core.usecases;

import dev.otavio.cleanarchstudy.core.entities.Event;

public interface FindEventCase {

    public Event execute(Event event);
}
