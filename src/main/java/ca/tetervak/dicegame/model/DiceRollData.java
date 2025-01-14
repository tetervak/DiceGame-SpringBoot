package ca.tetervak.dicegame.model;

import java.util.List;

public interface DiceRollData {
    List<Integer> getValues();

    int getNumberOfDice();

    int getTotal();
}
