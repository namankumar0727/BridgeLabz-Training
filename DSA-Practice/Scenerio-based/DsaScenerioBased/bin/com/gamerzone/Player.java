package com.gamerzone;
class Player {
    String playerName;
    int score;

    Player(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    @Override
    public String toString() {
        return playerName + " : " + score + " points";
    }
}
