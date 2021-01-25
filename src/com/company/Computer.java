package com.company;

public class Computer {
   private PickSimple pickComp = getPick();



    public PickSimple getPickComp() {
        return pickComp;
    }

    static PickSimple getPick() {
        PickSimple pickComp = PickSimple.getRandom();
        System.out.println("Computer pick: " + pickComp);
        return pickComp;
    }
}
