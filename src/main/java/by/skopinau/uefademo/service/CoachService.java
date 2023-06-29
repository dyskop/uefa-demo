package by.skopinau.uefademo.service;

import by.skopinau.uefademo.dto.CoachDto;
import by.skopinau.uefademo.dto.TeamDto;
import by.skopinau.uefademo.model.entity.Coach;

public interface CoachService extends BaseCrudService<Coach, CoachDto> {

    Coach getCoachByTeamDto(TeamDto dto);
}
