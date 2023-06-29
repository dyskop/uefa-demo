package by.skopinau.uefademo.exception.message;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionMessage {

    ENTITY_NOT_FOUND("Failed to retrieve entity: %s"),
    ENTITY_ALREADY_EXISTS("Entity already exists: %s"),
    COACH_UNAVAILABLE("The coach already has a team");

    private final String message;
}
