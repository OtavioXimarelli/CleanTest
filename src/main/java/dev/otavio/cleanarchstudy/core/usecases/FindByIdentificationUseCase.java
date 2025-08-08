package dev.otavio.cleanarchstudy.core.usecases;

import dev.otavio.cleanarchstudy.core.entities.Event;

public interface FindByIdentificationUseCase {

    Event execute(String identification);

}
