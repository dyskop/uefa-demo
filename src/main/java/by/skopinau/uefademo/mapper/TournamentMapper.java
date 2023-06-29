package by.skopinau.uefademo.mapper;

import by.skopinau.uefademo.dto.TournamentDto;
import by.skopinau.uefademo.model.entity.Tournament;
import org.mapstruct.Mapper;

@Mapper
public interface TournamentMapper extends BaseMapper<Tournament, TournamentDto> {
}
