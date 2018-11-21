package com.thanksgivingProject.characterService.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "The character class provided odes not exist")
public class CharacterException extends RuntimeException {
}
