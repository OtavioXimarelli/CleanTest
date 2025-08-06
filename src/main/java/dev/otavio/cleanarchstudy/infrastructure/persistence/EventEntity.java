package dev.otavio.cleanarchstudy.infrastructure.persistence;

import dev.otavio.cleanarchstudy.core.enums.EventTypes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;

@Entity
@Table(name = "Events")
@Data
@AllArgsConstructor
@NoArgsConstructor
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


    @JdbcTypeCode(SqlTypes.NAMED_ENUM)
    private EventTypes category;

    private Integer capacity;


    private String identification;

}