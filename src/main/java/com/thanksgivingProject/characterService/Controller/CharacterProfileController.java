package com.thanksgivingProject.characterService.Controller;

import com.thanksgivingProject.characterService.Entity.CharacterProfile;
import com.thanksgivingProject.characterService.Exception.CharacterException;
import com.thanksgivingProject.characterService.Service.CharacterProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/character")
public class CharacterProfileController {

    private final CharacterProfileService characterProfileService;

    public CharacterProfileController(CharacterProfileService characterProfileService) {
        this.characterProfileService = characterProfileService;
    }

    @RequestMapping(value = "/gen/{charName}/{charClass}", method = RequestMethod.POST)
    public CharacterProfile generateCharacter(@PathVariable String charName, @PathVariable String charClass) throws CharacterException {
        return characterProfileService.generateService(charName, charClass);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Optional<CharacterProfile> getCharacter(@PathVariable Integer id) {
        return characterProfileService.getCharacter(id);

    }



}
