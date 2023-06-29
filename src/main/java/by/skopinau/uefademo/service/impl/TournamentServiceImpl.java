package by.skopinau.uefademo.service.impl;

import by.skopinau.uefademo.dto.TournamentDto;
import by.skopinau.uefademo.model.entity.Tournament;
import by.skopinau.uefademo.service.TournamentService;
import org.springframework.stereotype.Service;

@Service
public class TournamentServiceImpl extends BaseCrudServiceImpl<Tournament, TournamentDto> implements TournamentService {
    // TODO: implementation
    @Override
    Tournament buildEntityFromDto(TournamentDto dto) {
        return null;
    }

    // TODO: implementation
    @Override
    Tournament updateEntityByDto(Tournament entity, TournamentDto dto) {
        return null;
    }
}
