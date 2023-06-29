package by.skopinau.uefademo.dto;

import java.time.LocalDate;
import java.util.UUID;

public record CoachDto(
        UUID id,
        String firstName,
        String lastName,
        LocalDate birthdate) {
}
