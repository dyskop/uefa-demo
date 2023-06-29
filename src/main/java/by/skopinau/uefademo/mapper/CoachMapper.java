package by.skopinau.uefademo.mapper;

import by.skopinau.uefademo.dto.CoachDto;
import by.skopinau.uefademo.model.entity.Coach;
import org.mapstruct.Mapper;

@Mapper
public interface CoachMapper extends BaseMapper<Coach, CoachDto> {
}
