package dev.otavio.cleanarchstudy.infrastructure.config;


import dev.otavio.cleanarchstudy.core.usecases.CreateEventCase;
import dev.otavio.cleanarchstudy.core.usecases.CreateEventImpl;
import dev.otavio.cleanarchstudy.infrastructure.mapper.EventEntityMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    @Bean
    public CreateEventCase createEventCase() {
        return new CreateEventImpl();
    }

    @Bean
    public EventEntityMapper eventEntityMapper() {
        return new EventEntityMapper();
    }

}
