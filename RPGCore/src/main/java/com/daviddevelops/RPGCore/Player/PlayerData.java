package com.daviddevelops.RPGCore.Player;

import com.daviddevelops.RPGCore.Classes.Warrior;
import com.daviddevelops.RPGCore.Contructs.ClassType;
import com.daviddevelops.RPGCore.Player.Async.CalculateDamage;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class PlayerData {
    private PlayerHandler handler;
    private ClassType classType;
    private Plugin plugin;
    private Player player;
    private int Strength, Dexterity, Constitution, Intelligence, Wisdom;

    private double DamagePerHit, DamageReduction, DodgeChance;

//  --[ Calculations ]--

    public void calculateEverything(){
        calculateDamage();
        calculateDodge();
        calculateReduction();
    }

    public void calculateReduction(){}


    public void calculateDodge(){

    }

    public void calculateDamage(){
        Bukkit.getScheduler().runTaskAsynchronously(plugin, new CalculateDamage(this, handler));
    }


//  --[ Quick Add Methods ]--

    public boolean addStrength(int amt) {
        try {
            setStrength(getStrength() + amt);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean addDexterity(int amt) {
        try {
            setDexterity(getDexterity() + amt);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean addConstitution(int amt) {
        try {
            setConstitution(getConstitution() + amt);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean addIntelligence(int amt) {
        try {
            setIntelligence(getIntelligence() + amt);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean addWisdom(int amt) {
        try {
            setWisdom(getWisdom() + amt);
            return true;
        } catch (Exception e){
            return false;
        }
    }



//    --[ Getters & Setters ]--

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getDexterity() {
        return Dexterity;
    }

    public void setDexterity(int dexterity) {
        Dexterity = dexterity;
    }

    public int getConstitution() {
        return Constitution;
    }

    public void setConstitution(int constitution) {
        Constitution = constitution;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }

    public int getWisdom() {
        return Wisdom;
    }

    public void setWisdom(int wisdom) {
        Wisdom = wisdom;
    }


//    --[ Getters & Setters ]--

    public double getDamagePerHit() {
        return DamagePerHit;
    }

    public void setDamagePerHit(double damagePerHit) {
        DamagePerHit = damagePerHit;
    }

    public double getDamageReduction() {
        return DamageReduction;
    }

    public void setDamageReduction(double damageReduction) {
        DamageReduction = damageReduction;
    }

    public double getDodgeChance() {
        return DodgeChance;
    }

    public void setDodgeChance(double dodgeChance) {
        DodgeChance = dodgeChance;
    }
}
