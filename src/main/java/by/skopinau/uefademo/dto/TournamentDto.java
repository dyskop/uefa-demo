package by.skopinau.uefademo.dto;

import by.skopinau.uefademo.model.entity.Match;
import by.skopinau.uefademo.model.entity.Team;

import java.util.Set;
import java.util.UUID;

public record TournamentDto(
        UUID id,
        String name,
        String season,
        Set<Team> teams,
        Set<Match> matches) {
}
