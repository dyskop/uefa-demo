package by.skopinau.uefademo.mapper;

import by.skopinau.uefademo.dto.TeamDto;
import by.skopinau.uefademo.model.entity.Team;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface TeamMapper extends BaseMapper<Team, TeamDto> {

    @Override
    @Mapping(target = "coach",
            expression = "java(team.getCoach().getFirstName().concat(\" \").concat(team.getCoach().getLastName()))")
    TeamDto entityToDto(Team team);
}
