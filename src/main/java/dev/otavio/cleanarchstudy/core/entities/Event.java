package dev.otavio.cleanarchstudy.core.entities;

import dev.otavio.cleanarchstudy.core.enums.EventTypes;

import java.time.LocalDateTime;

public record Event(
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
