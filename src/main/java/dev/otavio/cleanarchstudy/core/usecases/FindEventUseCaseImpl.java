package dev.otavio.cleanarchstudy.core.usecases;

import dev.otavio.cleanarchstudy.core.entities.Event;
import dev.otavio.cleanarchstudy.core.gateway.EventGateway;

import java.util.List;

public class FindEventUseCaseImpl implements FindEventUseCase {

    private final EventGateway eventGateway;

    public FindEventUseCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public List<Event> execute(Event event) {
       return eventGateway.listEvent(event);
    }
}