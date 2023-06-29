package by.skopinau.uefademo.service.impl;

import by.skopinau.uefademo.dto.TeamDto;
import by.skopinau.uefademo.exception.CoachUnavailableException;
import by.skopinau.uefademo.model.entity.Coach;
import by.skopinau.uefademo.model.entity.Team;
import by.skopinau.uefademo.repository.TeamRepository;
import by.skopinau.uefademo.service.CoachService;
import by.skopinau.uefademo.service.TeamService;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

import static by.skopinau.uefademo.exception.message.ExceptionMessage.COACH_UNAVAILABLE;
import static by.skopinau.uefademo.exception.message.ExceptionMessage.ENTITY_ALREADY_EXISTS;
import static by.skopinau.uefademo.exception.message.ExceptionMessage.ENTITY_NOT_FOUND;

@Service
public class TeamServiceImpl extends BaseCrudServiceImpl<Team, TeamDto> implements TeamService {

    @Autowired
    private CoachService coachService;

    @Autowired
    private TeamRepository teamRepository;

    @Override
    Team buildEntityFromDto(TeamDto dto) {
        String name = dto.name();
        checkNameAvailable(name);

        Coach coach = coachService.getCoachByTeamDto(dto);
        checkCoachAvailable(coach);

        return Team.builder()
                .name(name)
                .country(dto.country())
                .coach(coach)
                .build();
    }

    @Override
    Team updateEntityByDto(Team entity, TeamDto dto) {
        String name = dto.name();
        Coach coach = coachService.getCoachByTeamDto(dto);
        if (!Objects.equals(entity.getName(), name)) {
            checkNameAvailable(name);
        }
        if (!Objects.equals(entity.getCoach(), coach)) {
            checkCoachAvailable(coach);
        }
        entity.setName(name);
        entity.setCountry(dto.country());
        entity.setCoach(coach);
        return entity;
    }

    @Override
    public Team getByName(String name) {
        return teamRepository.findByName(name)
                .orElseThrow(() -> new EntityNotFoundException(
                        String.format(ENTITY_NOT_FOUND.getMessage(), name)
                ));
    }

    private void checkNameAvailable(String name) {
        if (teamRepository.existsByName(name)) {
            throw new EntityExistsException(String.format(ENTITY_ALREADY_EXISTS.getMessage(), name));
        }
    }

    private void checkCoachAvailable(Coach coach) {
        if (teamRepository.existsByCoach(coach)) {
            throw new CoachUnavailableException(COACH_UNAVAILABLE.getMessage());
        }
    }
}
