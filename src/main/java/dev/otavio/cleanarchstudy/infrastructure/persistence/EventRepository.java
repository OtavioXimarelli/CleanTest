package dev.otavio.cleanarchstudy.infrastructure.persistence;

import dev.otavio.cleanarchstudy.core.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventRepository extends JpaRepository<EventEntity, Long> {

    Optional<Event> findByIdentification(String identification);

}
