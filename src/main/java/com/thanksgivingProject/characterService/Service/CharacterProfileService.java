package com.thanksgivingProject.characterService.Service;

import com.thanksgivingProject.characterService.Entity.CharacterProfile;
import com.thanksgivingProject.characterService.Exception.CharacterException;
import com.thanksgivingProject.characterService.Repository.CharacterRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CharacterProfileService {

    private final CharacterRepository characterRepository;
    private final generateCharacterService genChar;

    public CharacterProfileService(CharacterRepository characterRepository, generateCharacterService genChar) {
        this.characterRepository = characterRepository;
        this.genChar = genChar;
    }

    public CharacterProfile generateService(String charName, String charClass) throws CharacterException {
        CharacterProfile cProfile = genChar.generateProfile(charName, charClass);

        return characterRepository.save(cProfile);
    }

    public Optional<CharacterProfile> getCharacter(Integer id){
        return characterRepository.findById(id);
    }

}
