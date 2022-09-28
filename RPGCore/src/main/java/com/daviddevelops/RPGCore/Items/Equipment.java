package com.daviddevelops.RPGCore.Items;

import com.daviddevelops.RPGCore.Contructs.EquipmentType;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class Equipment {

    private ItemStack item;
    private List<EquipmentType> type;


    boolean isEquippable(){
        return false;
    }



}
