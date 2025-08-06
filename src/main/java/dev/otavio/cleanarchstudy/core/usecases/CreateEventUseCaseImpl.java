package dev.otavio.cleanarchstudy.core.usecases;

import dev.otavio.cleanarchstudy.core.entities.Event;
import dev.otavio.cleanarchstudy.core.gateway.EventGateway;
import dev.otavio.cleanarchstudy.infrastructure.exceptions.NotUniqueIdentificationException;

public class CreateEventUseCaseImpl implements CreateEventUseCase {

    private final EventGateway eventGateway;

    public CreateEventUseCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }


    @Override
    public Event execute(Event event) {

        if (eventGateway.existByIdentificator(event.Identification())) {
            throw new NotUniqueIdentificationException(" The identification: " + event.Identification() + ", is already exists, try again with a unique one.");
        }

        return eventGateway.createEvent(event);
    }
}
