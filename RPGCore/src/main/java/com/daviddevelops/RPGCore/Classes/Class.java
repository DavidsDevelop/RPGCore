package com.daviddevelops.RPGCore.Classes;

import com.daviddevelops.RPGCore.Contructs.ClassType;
import com.daviddevelops.RPGCore.Contructs.EquipmentType;
import com.daviddevelops.RPGCore.Items.Equipment;

import java.util.ArrayList;
import java.util.List;

public abstract class Class {

    private List<EquipmentType> ALLOWED_EQUIPMENT = new ArrayList<>();
    private ClassType classType;

    public List<EquipmentType> getAllowedEquipment() {
        return ALLOWED_EQUIPMENT;
    }

    public void setAllowedEquipment(List<EquipmentType> ALLOWED_EQUIPMENT) {
        this.ALLOWED_EQUIPMENT = ALLOWED_EQUIPMENT;
    }

    public void addAllowedEquipment(EquipmentType equipmentType){
        this.ALLOWED_EQUIPMENT.add(equipmentType);
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }


}
