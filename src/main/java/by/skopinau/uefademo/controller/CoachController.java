package by.skopinau.uefademo.controller;

import by.skopinau.uefademo.dto.CoachDto;
import by.skopinau.uefademo.model.entity.Coach;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coaches")
public class CoachController extends BaseCrudController<Coach, CoachDto> {
}
