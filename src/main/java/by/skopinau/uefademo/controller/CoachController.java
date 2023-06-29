package by.skopinau.uefademo.controller;

import by.skopinau.uefademo.dto.CoachDto;
import by.skopinau.uefademo.service.CoachService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/coaches")
@RequiredArgsConstructor
public class CoachController {

    private final CoachService coachService;

    @GetMapping
    public ResponseEntity<List<CoachDto>> getAllCoaches() {
        return ResponseEntity.ok(coachService.getAll());
    }

    @GetMapping("/{coachId}")
    public ResponseEntity<CoachDto> getCoachDtoById(@PathVariable("coachId") UUID id) {
        return ResponseEntity.ok(coachService.getCoachDtoById(id));
    }

    @PostMapping
    public ResponseEntity<CoachDto> createCoach(@RequestBody CoachDto coachDto) {
        return new ResponseEntity<>(coachService.createCoach(coachDto), HttpStatus.CREATED);
    }

    @PutMapping("/{coachId}")
    public ResponseEntity<CoachDto> updateCoach(
            @RequestBody CoachDto coachDto,
            @PathVariable("coachId") UUID id) {
        return ResponseEntity.ok(coachService.updateCoach(coachDto, id));
    }

    @DeleteMapping("/{coachId}")
    public ResponseEntity<Void> deleteCoach(@PathVariable("coachId") UUID id) {
        coachService.deleteCoach(id);
        return ResponseEntity.noContent().build();
    }
    /*
    @PostMapping
    @PreAuthorize("hasAuthority('MANAGING_RECRUITER')")
    public ResponseEntity<RecruiterDto> createRecruiter(@RequestBody RecruiterDto recruiterDto) {
        return new ResponseEntity<>(recruiterService.createRecruiter(recruiterDto), HttpStatus.CREATED);
    }
    */

    /*
    private final CandidateService candidateService;

    @GetMapping
    public ResponseEntity<List<String>> getAssignedIdsByInput(@RequestParam(defaultValue = "") String input) {
        return ResponseEntity.ok(candidateService.getAssignedIdsByInput(input));
    }
    */
}
