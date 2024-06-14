package com.duckrace;

import java.util.Scanner;

class DuckRaceApp {

    private final Board board = new Board();
    private final Scanner scanner = new Scanner(System.in);

    public void execute() {
        welcome();
        showBoard();
        int id = promptForId();
        Reward reward = promptForReward();
        updateBoard(id, reward);
        showBOard();
    }

    public void updateBoard(int id, Reward reward) {
    }

    private Reward promptForReward() {
        Reward reward = null;

        return reward;
    }
}


