package by.skopinau.uefademo.mapper;

import by.skopinau.uefademo.dto.CoachDto;
import by.skopinau.uefademo.model.entity.Coach;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CoachMapper {

    CoachDto coachToCoachDto(Coach coach);
    List<CoachDto> coachListToCoachDtoList(List<Coach> coaches);
}
