package ca.tetervak.dicegame.model;

public interface CookieDataService {

    String encodeRollData(DiceRollData rollData);

    DiceRollData decodeRollData(String cookieValue);
}
