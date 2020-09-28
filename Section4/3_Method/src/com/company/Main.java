package com.company;

public class Main {

    public static void main(String[] args) {
        calculateScore(true, 10000,9,200);
        calculateScore(true, 8000,5,1000);
        calculateScore(false, 8000,5,1000);

        int HighScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Bruno", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Julien", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Sophie", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Sylvain", HighScorePosition);

    }
    public static int calculateScore(boolean gameOver, int score, int level, int bonus) {
        if (gameOver) {
            int finalScore = score + level * bonus;
            finalScore +=2000;
            System.out.println(finalScore);
            return finalScore;}
        else {
            int finalScore =-1;
            System.out.println(finalScore);
            return finalScore;
        }
    }

    public static void displayHighScorePosition (String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }
    public static int calculateHighScorePosition(int score) {
        int position;
        if (score >= 1000) {
            return position=1;}
        else if (score >= 500) {
            return position=2;
        }
        else if (score >= 100) {
            return position=3;
        }
        else {
            return position=4;
        }

    }
}
