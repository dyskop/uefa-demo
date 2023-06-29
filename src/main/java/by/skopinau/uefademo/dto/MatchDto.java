package by.skopinau.uefademo.dto;

import by.skopinau.uefademo.model.entity.Referee;
import by.skopinau.uefademo.model.entity.Team;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

public record MatchDto(
        UUID id,
        LocalDateTime startDateTime,
        String stadium,
        Referee referee,
        Set<Team> teams,
        String result) {
}
