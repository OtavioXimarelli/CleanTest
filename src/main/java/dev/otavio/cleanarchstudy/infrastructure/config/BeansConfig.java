package dev.otavio.cleanarchstudy.infrastructure.config;


import dev.otavio.cleanarchstudy.core.gateway.EventGateway;
import dev.otavio.cleanarchstudy.core.usecases.*;
import dev.otavio.cleanarchstudy.infrastructure.mapper.EventEntityMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeansConfig {
    @Bean
    public CreateEventUseCase createEventCase(EventGateway eventGateway) {
        return new CreateEventUseCaseImpl(eventGateway);
    }

    @Bean
    public EventEntityMapper eventEntityMapper() {
        return new EventEntityMapper();
    }

    @Bean
    public FindEventUseCase findEventCase(EventGateway eventGateway) {
        return new FindEventUseCaseImpl(eventGateway);
    }

    @Bean
    public FindByIdentificationUseCase findByIdentificationUseCase(EventGateway eventGateway) {
        return new FindByIdentificationUseCaseImpl(eventGateway);
    }

}
