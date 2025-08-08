package dev.otavio.cleanarchstudy.core.usecases;

import dev.otavio.cleanarchstudy.core.entities.Event;
import dev.otavio.cleanarchstudy.core.gateway.EventGateway;
import dev.otavio.cleanarchstudy.infrastructure.exceptions.NotFoundEventException;

public class FindByIdentificationUseCaseImpl implements  FindByIdentificationUseCase{

    private final EventGateway eventGateway;

    public FindByIdentificationUseCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(String identification) {
        return eventGateway.findByIdentification(identification)
                .orElseThrow(() -> new NotFoundEventException(
                        "Event with identification: " + "|" + identification + "|" + " not found"
                ));
    }

}
