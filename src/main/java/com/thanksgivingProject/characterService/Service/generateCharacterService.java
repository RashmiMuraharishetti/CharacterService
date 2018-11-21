package com.thanksgivingProject.characterService.Service;

import com.thanksgivingProject.characterService.Entity.CharacterProfile;
import com.thanksgivingProject.characterService.Exception.CharacterException;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class generateCharacterService {

    public generateCharacterService() {
    }

    public CharacterProfile generateProfile(String charName, String charClass) throws CharacterException

    {
        CharacterProfile profile = new CharacterProfile();

        profile.setCharName(charName);
        profile.setCharClass(charClass);


        int[] randomArray = new Random().ints(5, 8, 18).sorted().toArray();
        int max = randomArray[4];
        int min = randomArray[0];

        int[] intRandom = new Random().ints(5, min, max).toArray();




        switch(charClass){
            case "Warrior":{
                profile.setCharStr(max);
                profile.setCharInt(min);
                profile.setCharCha(intRandom[0]);
                profile.setCharDex(intRandom[1]);
                break;

            }
            case "Archer":{
                profile.setCharDex(max);
                profile.setCharCha(min);
                profile.setCharInt(intRandom[0]);
                profile.setCharStr(intRandom[1]);
                break;

            }
            case "Wizard":{
                profile.setCharInt(max);
                profile.setCharStr(min);
                profile.setCharCha(intRandom[0]);
                profile.setCharDex(intRandom[1]);
                break;

            }
            case "Rogue":{
                profile.setCharCha(max);
                profile.setCharStr(min);
                profile.setCharInt(intRandom[0]);
                profile.setCharDex(intRandom[1]);
                break;

            }
            default:{
                throw new CharacterException();
            }
        }

        //profile.setInventory(empty);
        profile.setCharWis(intRandom[2]);
        profile.setCharCon(intRandom[3]);
        profile.setLocation(intRandom[4]);
        profile.setHitPoints(profile.getCharCon()*2);

        return profile;
    }
}
