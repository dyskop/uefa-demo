package by.skopinau.uefademo.dto;

import by.skopinau.uefademo.model.entity.Match;
import by.skopinau.uefademo.model.enums.Country;

import java.util.Set;
import java.util.UUID;

public record TeamDto(
        UUID id,
        String name,
        Country country,
        String coach,
        Set<FootballerDto> squad,
        Set<Match> matches) {
}
