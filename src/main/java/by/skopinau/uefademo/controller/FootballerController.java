package by.skopinau.uefademo.controller;

import by.skopinau.uefademo.dto.FootballerDto;
import by.skopinau.uefademo.model.entity.Footballer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/footballers")
public class FootballerController extends BaseCrudController<Footballer, FootballerDto> {
}
