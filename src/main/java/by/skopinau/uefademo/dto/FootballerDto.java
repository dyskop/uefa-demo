package by.skopinau.uefademo.dto;

import by.skopinau.uefademo.model.enums.Position;

import java.time.LocalDate;
import java.util.UUID;

public record FootballerDto(
        UUID id,
        String firstName,
        String lastName,
        LocalDate birthdate,
        String teamName,
        Position position) {
}
