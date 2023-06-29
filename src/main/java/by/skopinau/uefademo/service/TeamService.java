package by.skopinau.uefademo.service;

import by.skopinau.uefademo.dto.TeamDto;
import by.skopinau.uefademo.model.entity.Team;

public interface TeamService extends BaseCrudService<Team, TeamDto> {

    Team getByName(String name);
}
