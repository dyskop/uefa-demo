package by.skopinau.uefademo.mapper;

import by.skopinau.uefademo.dto.FootballerDto;
import by.skopinau.uefademo.model.entity.Footballer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface FootballerMapper extends BaseMapper<Footballer, FootballerDto> {

    @Override
    @Mapping(target = "teamName", source = "footballer.team.name")
    FootballerDto entityToDto(Footballer footballer);
}
