package com.thanksgivingProject.characterService.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity(name = "CHARACTER")
public class CharacterProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String charName;
    private String charClass;
    private int charInt;
    private int charWis;
    private int charCha;
    private int charStr;
    private int charDex;
    private int charCon;
    private int location;
    //private List<Object> inventory;
    private int[] inventory;
    private int hitPoints;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public int getCharInt() {
        return charInt;
    }

    public void setCharInt(int charInt) {
        this.charInt = charInt;
    }

    public int getCharWis() {
        return charWis;
    }

    public void setCharWis(int charWis) {
        this.charWis = charWis;
    }

    public int getCharCha() {
        return charCha;
    }

    public void setCharCha(int charCha) {
        this.charCha = charCha;
    }

    public int getCharStr() {
        return charStr;
    }

    public void setCharStr(int charStr) {
        this.charStr = charStr;
    }

    public int getCharDex() {
        return charDex;
    }

    public void setCharDex(int charDex) {
        this.charDex = charDex;
    }

    public int getCharCon() {
        return charCon;
    }

    public void setCharCon(int charCon) {
        this.charCon = charCon;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    /*public List<Object> getInventory() {
        return inventory;
    }

    public void setInventory(List<Object> inventory) {
        this.inventory = inventory;
    }*/

    public int[] getInventory() {
        return inventory;
    }

    public void setInventory(int[] inventory) {
        this.inventory = inventory;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public CharacterProfile() {
    }


    public CharacterProfile(int id, String charName, String charClass, int charInt, int charWis, int charCha, int charStr, int charDex, int charCon, int location, int[] inventory, int hitPoints) {
        this.id = id;
        this.charName = charName;
        this.charClass = charClass;
        this.charInt = charInt;
        this.charWis = charWis;
        this.charCha = charCha;
        this.charStr = charStr;
        this.charDex = charDex;
        this.charCon = charCon;
        this.location = location;
        this.inventory = inventory;
        this.hitPoints = hitPoints;
    }
}
