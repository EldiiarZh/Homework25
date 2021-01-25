package com.company;

import java.text.ParseException;
import java.util.Scanner;

public class User {
   private PickSimple pickUser = makePick();



    public PickSimple getPickUser() {
        return pickUser;
    }

    static PickSimple makePick() {
        int pick = 0;
        PickSimple pickUser = null;

        while (pick != 3 && pick != 2 && pick != 1) {
            try {
                Scanner sc = new Scanner(System.in);
                pick = Integer.parseInt(sc.next());
                if (pick != 3 && pick != 2 && pick != 1 ){
                    throw new NumberFormatException();
                }else {
                switch (pick) {
                    case 1:
                        pickUser = PickSimple.Rock;
                        System.out.println("You pick: " + pickUser);

                        break;
                    case 2:
                        pickUser = PickSimple.Paper;
                        System.out.println("You pick: " + pickUser);
                        break;
                    case 3:
                        pickUser = PickSimple.Scissors;
                        System.out.println("You pick: " + pickUser);
                        break;
                }
                }
            } catch (NumberFormatException nfe) {
                System.out.println("You should enter by number from 1 to 3");
            }
        }return pickUser;
    }
}

