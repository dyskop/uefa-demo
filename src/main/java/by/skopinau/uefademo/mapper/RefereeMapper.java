package by.skopinau.uefademo.mapper;

import by.skopinau.uefademo.dto.RefereeDto;
import by.skopinau.uefademo.model.entity.Referee;
import org.mapstruct.Mapper;

@Mapper
public interface RefereeMapper extends BaseMapper<Referee, RefereeDto> {
}
