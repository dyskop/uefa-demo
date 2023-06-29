package by.skopinau.uefademo.service.impl;

import by.skopinau.uefademo.dto.RefereeDto;
import by.skopinau.uefademo.model.entity.Referee;
import by.skopinau.uefademo.service.RefereeService;
import org.springframework.stereotype.Service;

@Service
public class RefereeServiceImpl extends BaseCrudServiceImpl<Referee, RefereeDto> implements RefereeService {

    // TODO: implementation
    @Override
    Referee buildEntityFromDto(RefereeDto dto) {
        return null;
    }

    // TODO: implementation
    @Override
    Referee updateEntityByDto(Referee entity, RefereeDto dto) {
        return null;
    }
}
