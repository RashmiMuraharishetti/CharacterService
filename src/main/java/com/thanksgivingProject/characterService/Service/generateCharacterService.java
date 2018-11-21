package com.thanksgivingProject.characterService.Service;

import com.thanksgivingProject.characterService.Entity.CharacterProfile;
import com.thanksgivingProject.characterService.Exception.CharacterException;

import java.util.Random;

public class generateCharacterService {

    public generateCharacterService() {
    }

    public CharacterProfile generateProfile(String charName, String charClass) throws CharacterException

    {
        CharacterProfile profile = new CharacterProfile();

        profile.setCharName(charName);
        profile.setCharClass(charClass);

        //Generate and sort array of random numbers between 8 to 18
        int[] randomArray = new Random().ints(5, 8, 18).sorted().toArray();
        int max = randomArray[4];
        int min = randomArray[0];

        int[] intRandom = new Random().ints(5, min, max).toArray();



        //switch case for each character class
        switch(charClass){
            case "Warrior":{
                profile.setCharStr(max);
                profile.setCharInt(min);
                profile.setCharWis(intRandom[0]);
                profile.setCharCha(intRandom[1]);
                profile.setCharDex(intRandom[2]);
                profile.setCharCon(intRandom[3]);
                profile.setLocation(intRandom[4]);
                break;

            }
            case "Archer":{
                profile.setCharDex(max);
                profile.setCharCha(min);
                profile.setCharInt(intRandom[0]);
                profile.setCharWis(intRandom[1]);
                profile.setCharStr(intRandom[2]);
                profile.setCharCon(intRandom[3]);
                profile.setLocation(intRandom[4]);
                break;

            }
            case "Wizard":{
                profile.setCharInt(max);
                profile.setCharStr(min);
                profile.setCharWis(intRandom[0]);
                profile.setCharCha(intRandom[1]);
                profile.setCharDex(intRandom[2]);
                profile.setCharCon(intRandom[3]);
                profile.setLocation(intRandom[4]);
                break;

            }
            case "Rogue":{
                profile.setCharCha(max);
                profile.setCharStr(min);
                profile.setCharInt(intRandom[0]);
                profile.setCharWis(intRandom[1]);
                profile.setCharDex(intRandom[2]);
                profile.setCharCon(intRandom[3]);
                profile.setLocation(intRandom[4]);
                break;

            }
            default:{
                //any other class, throw exception
                throw new CharacterException();
            }
        }

        //profile.setInventory(empty);
        profile.setHitPoints(profile.getCharCon()*2);

        return profile;
    }
}
