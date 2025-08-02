package dev.otavio.cleanarchstudy.infrastructure.config;


import dev.otavio.cleanarchstudy.core.gateway.EventGateway;
import dev.otavio.cleanarchstudy.core.usecases.CreateEventCase;
import dev.otavio.cleanarchstudy.core.usecases.CreateEventImpl;
import dev.otavio.cleanarchstudy.core.usecases.FindEventCase;
import dev.otavio.cleanarchstudy.core.usecases.FindEventImpl;
import dev.otavio.cleanarchstudy.infrastructure.mapper.EventEntityMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeansConfig {
    @Bean
    public CreateEventCase createEventCase(EventGateway eventGateway) {
        return new CreateEventImpl(eventGateway);
    }

    @Bean
    public EventEntityMapper eventEntityMapper() {
        return new EventEntityMapper();
    }

    @Bean
    public FindEventCase findEventCase(EventGateway eventGateway) {
        return new FindEventImpl(eventGateway);
    }


}
