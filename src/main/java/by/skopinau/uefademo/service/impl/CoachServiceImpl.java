package by.skopinau.uefademo.service.impl;

import by.skopinau.uefademo.dto.CoachDto;
import by.skopinau.uefademo.mapper.CoachMapper;
import by.skopinau.uefademo.model.entity.Coach;
import by.skopinau.uefademo.repository.CoachRepository;
import by.skopinau.uefademo.service.CoachService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

import static by.skopinau.uefademo.exception.message.ExceptionMessage.ENTITY_NOT_FOUND;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CoachServiceImpl implements CoachService {

    private final CoachRepository coachRepository;
    private final CoachMapper coachMapper;

    @Override
    public List<CoachDto> getAll() {
        List<Coach> coaches = coachRepository.findAll();
        return coachMapper.coachListToCoachDtoList(coaches);
    }

    @Override
    public CoachDto getCoachDtoById(UUID id) {
        Coach coach = getCoachById(id);
        return coachMapper.coachToCoachDto(coach);
    }

    @Override
    @Transactional
    public CoachDto createCoach(CoachDto coachDto) {
        Coach coach = buildCoachFromDto(coachDto);
        Coach savedCoach = coachRepository.save(coach);
        return coachMapper.coachToCoachDto(savedCoach);
    }

    @Override
    @Transactional
    public CoachDto updateCoach(CoachDto coachDto, UUID id) {
        Coach coach = getCoachById(id);
        Coach updated = updateCoachByCoachDto(coach, coachDto);
        Coach savedCoach = coachRepository.save(updated);
        return coachMapper.coachToCoachDto(savedCoach);
    }

    @Override
    @Transactional
    public void deleteCoach(UUID id) {
        coachRepository.deleteById(id);
    }

    private Coach getCoachById(UUID id) {
        return coachRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(
                        String.format(ENTITY_NOT_FOUND.getMessage(), "coach", id)
                ));
    }

    private Coach buildCoachFromDto(CoachDto coachDto) {
        return Coach.builder()
                .firstName(coachDto.firstName())
                .lastName(coachDto.lastName())
                .birthdate(coachDto.birthdate())
                .build();
    }

    private Coach updateCoachByCoachDto(Coach coach, CoachDto coachDto) {
        coach.setFirstName(coachDto.firstName());
        coach.setLastName(coachDto.lastName());
        coach.setBirthdate(coachDto.birthdate());
        return coach;
    }
}
