package by.skopinau.uefademo.controller;

import by.skopinau.uefademo.dto.RefereeDto;
import by.skopinau.uefademo.model.entity.Referee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/referees")
public class RefereeController extends BaseCrudController<Referee, RefereeDto> {
}
