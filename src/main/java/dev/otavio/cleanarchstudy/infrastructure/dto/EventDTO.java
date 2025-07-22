package dev.otavio.cleanarchstudy.infrastructure.dto;

import dev.otavio.cleanarchstudy.core.enums.EventTypes;

import java.time.LocalDateTime;

public record EventDTO(
        Long id,
        String Name,
        String Description,
        String Location,
        LocalDateTime StartDate,
        LocalDateTime EndDate,
        String Owner,
        String Contact,
        String Type,
        EventTypes Category,
        Integer Capacity,
        String Identification
) {
}
