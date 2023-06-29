package by.skopinau.uefademo.controller;

import by.skopinau.uefademo.dto.TournamentDto;
import by.skopinau.uefademo.model.entity.Tournament;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tournaments")
public class TournamentController extends BaseCrudController<Tournament, TournamentDto> {
}
