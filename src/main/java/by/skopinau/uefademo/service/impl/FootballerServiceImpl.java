package by.skopinau.uefademo.service.impl;

import by.skopinau.uefademo.dto.FootballerDto;
import by.skopinau.uefademo.model.entity.Footballer;
import by.skopinau.uefademo.model.entity.Team;
import by.skopinau.uefademo.service.FootballerService;
import by.skopinau.uefademo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FootballerServiceImpl extends BaseCrudServiceImpl<Footballer, FootballerDto> implements FootballerService {

    @Autowired
    private TeamService teamService;

    @Override
    Footballer buildEntityFromDto(FootballerDto dto) {
        Team team = teamService.getByName(dto.teamName());
        return Footballer.builder()
                .firstName(dto.firstName())
                .lastName(dto.lastName())
                .birthdate(dto.birthdate())
                .team(team)
                .position(dto.position())
                .build();
    }

    @Override
    Footballer updateEntityByDto(Footballer entity, FootballerDto dto) {
        Team team = teamService.getByName(dto.teamName());
        entity.setFirstName(dto.firstName());
        entity.setLastName(dto.lastName());
        entity.setBirthdate(dto.birthdate());
        entity.setTeam(team);
        entity.setPosition(dto.position());
        return entity;
    }
}
