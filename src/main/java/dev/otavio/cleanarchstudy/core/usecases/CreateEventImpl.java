package dev.otavio.cleanarchstudy.core.usecases;

import dev.otavio.cleanarchstudy.core.entities.Event;
import dev.otavio.cleanarchstudy.core.gateway.EventGateway;

public class CreateEventImpl implements CreateEventCase {

    private final EventGateway eventGateway;

    public CreateEventImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }


    @Override
    public Event execute(Event event) {
         return eventGateway.createEvent(event);
    }
}
