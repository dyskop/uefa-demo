package by.skopinau.uefademo.exception.message;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionMessage {

    ENTITY_NOT_FOUND("Failed to retrieve %s: %s");

    private final String message;
}
