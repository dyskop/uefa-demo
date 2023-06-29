package by.skopinau.uefademo.controller;

import by.skopinau.uefademo.dto.MatchDto;
import by.skopinau.uefademo.model.entity.Match;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matches")
public class MatchController extends BaseCrudController<Match, MatchDto> {
}
