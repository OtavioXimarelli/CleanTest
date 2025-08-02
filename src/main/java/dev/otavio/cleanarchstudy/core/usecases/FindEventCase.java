package dev.otavio.cleanarchstudy.core.usecases;

import dev.otavio.cleanarchstudy.core.entities.Event;

import java.util.List;

public interface FindEventCase {

    public List<Event> execute(Event event);
}
