package dev.otavio.cleanarchstudy.infrastructure.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.otavio.cleanarchstudy.core.enums.EventTypes;

import java.time.LocalDateTime;

public record EventDTO(
        @JsonProperty("id")
        Long id,
        @JsonProperty("name")
        String Name,
        @JsonProperty("description")
        String Description,
        @JsonProperty("location")
        String Location,
        @JsonProperty("startDate")
        LocalDateTime StartDate,
        @JsonProperty("endDate")
        LocalDateTime EndDate,
        @JsonProperty("owner")
        String Owner,
        @JsonProperty("contact")
        String Contact,
        @JsonProperty("type")
        String Type,
        @JsonProperty("category")
        EventTypes Category,
        @JsonProperty("capacity")
        Integer Capacity,
        @JsonProperty("identification")
        String Identification
) {
}
