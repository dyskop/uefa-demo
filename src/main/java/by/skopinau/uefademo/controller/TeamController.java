package by.skopinau.uefademo.controller;

import by.skopinau.uefademo.dto.TeamDto;
import by.skopinau.uefademo.model.entity.Team;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teams")
public class TeamController extends BaseCrudController<Team, TeamDto> {
}
