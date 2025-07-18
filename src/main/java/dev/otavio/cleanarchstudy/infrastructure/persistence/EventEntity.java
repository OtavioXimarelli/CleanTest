package dev.otavio.cleanarchstudy.infrastructure.persistence;

import dev.otavio.cleanarchstudy.core.enums.EventTypes;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor

public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String location;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String owner;

    private String contact;

    private String type;

    @Enumerated(EnumType.STRING)
    private EventTypes category;

    private Integer capacity;

    private String identification;
}
