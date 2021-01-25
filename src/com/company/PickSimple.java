package com.company;

public enum PickSimple {
    Rock, Paper, Scissors;

    public static PickSimple getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
