package by.skopinau.uefademo.service.impl;

import by.skopinau.uefademo.dto.CoachDto;
import by.skopinau.uefademo.dto.TeamDto;
import by.skopinau.uefademo.model.entity.Coach;
import by.skopinau.uefademo.repository.CoachRepository;
import by.skopinau.uefademo.service.CoachService;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

import static by.skopinau.uefademo.exception.message.ExceptionMessage.ENTITY_ALREADY_EXISTS;
import static by.skopinau.uefademo.exception.message.ExceptionMessage.ENTITY_NOT_FOUND;

@Service
public class CoachServiceImpl extends BaseCrudServiceImpl<Coach, CoachDto> implements CoachService {

    @Autowired
    private CoachRepository coachRepository;

    @Override
    Coach buildEntityFromDto(CoachDto dto) {
        checkCoachAlreadyExists(dto);
        return Coach.builder()
                .firstName(dto.firstName())
                .lastName(dto.lastName())
                .birthdate(dto.birthdate())
                .build();
    }

    @Override
    Coach updateEntityByDto(Coach entity, CoachDto dto) {
        if (!Objects.equals(entity.getFirstName(), dto.firstName()) &&
            !Objects.equals(entity.getLastName(), dto.lastName())) {
            checkCoachAlreadyExists(dto);
        }
        entity.setFirstName(dto.firstName());
        entity.setLastName(dto.lastName());
        entity.setBirthdate(dto.birthdate());
        return entity;
    }

    @Override
    public Coach getCoachByTeamDto(TeamDto dto) {
        return getByFullName(dto.coach());
    }

    private Coach getByFullName(String fullName) {
        String[] splitFullName = fullName.split(" ");
        return coachRepository.findByFirstNameAndLastName(splitFullName[0], splitFullName[1])
                .orElseThrow(() -> new EntityNotFoundException(
                        String.format(ENTITY_NOT_FOUND.getMessage(), fullName)
                ));
    }

    private void checkCoachAlreadyExists(CoachDto dto) {
        String firstName = dto.firstName();
        String lastName = dto.lastName();

        if (coachRepository.existsByFirstNameAndLastName(firstName, lastName)) {
            throw new EntityExistsException(
                    String.format(ENTITY_ALREADY_EXISTS.getMessage(), firstName.concat(" ").concat(lastName))
            );
        }
    }
}
