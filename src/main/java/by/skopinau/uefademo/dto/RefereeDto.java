package by.skopinau.uefademo.dto;

import java.time.LocalDate;
import java.util.UUID;

public record RefereeDto(
        UUID id,
        String firstName,
        String lastName,
        LocalDate birthdate) {
}
