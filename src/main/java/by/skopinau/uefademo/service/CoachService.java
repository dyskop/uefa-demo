package by.skopinau.uefademo.service;

import by.skopinau.uefademo.dto.CoachDto;

import java.util.List;
import java.util.UUID;

public interface CoachService {

    List<CoachDto> getAll();
    CoachDto getCoachDtoById(UUID id);
    CoachDto createCoach(CoachDto coachDto);
    CoachDto updateCoach(CoachDto coachDto, UUID id);
    void deleteCoach(UUID id);
}
