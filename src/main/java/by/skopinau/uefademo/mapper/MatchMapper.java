package by.skopinau.uefademo.mapper;

import by.skopinau.uefademo.dto.MatchDto;
import by.skopinau.uefademo.model.entity.Match;
import org.mapstruct.Mapper;

@Mapper
public interface MatchMapper extends BaseMapper<Match, MatchDto> {
}
