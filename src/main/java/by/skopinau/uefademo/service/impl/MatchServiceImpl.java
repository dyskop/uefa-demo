package by.skopinau.uefademo.service.impl;

import by.skopinau.uefademo.dto.MatchDto;
import by.skopinau.uefademo.model.entity.Match;
import by.skopinau.uefademo.service.MatchService;
import org.springframework.stereotype.Service;

@Service
public class MatchServiceImpl extends BaseCrudServiceImpl<Match, MatchDto> implements MatchService {

    // TODO: implementation
    @Override
    Match buildEntityFromDto(MatchDto dto) {
        return null;
    }

    // TODO: implementation
    @Override
    Match updateEntityByDto(Match entity, MatchDto dto) {
        return null;
    }
}
