package com.company;

public class Game1 {

    static void startGame() {
        int winUser = 0;
        int winComp = 0;
        int draw = 0;
        int round = 0;
        while (round<=6){
            System.out.println("Please Enter 1 to pick Paper");
            System.out.println("Please Enter 2 to pick Rock");
            System.out.println("Please Enter 3 to pick Scissors");
            User.makePick();
            Computer.getPick();
            if (User.makePick().equals(Computer.getPick())) {
                System.out.println("Draw");
                draw++;
            } else if (User.makePick().equals(PickSimple.Rock) && Computer.getPick().equals(PickSimple.Scissors)
                    || User.makePick().equals(PickSimple.Scissors) && Computer.getPick().equals(PickSimple.Paper)
                    || User.makePick().equals(PickSimple.Paper) && Computer.getPick().equals(PickSimple.Rock)) {
                System.out.println("You win!");
                winUser++;
            } else {
                System.out.println("You lose!");
                winComp++;
            }
            round++;
        }
    }
}
