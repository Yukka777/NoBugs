package home_work3;

public class GameSettings {
    static int maxPlayers;
    private final String gameName;
    private int currentPlayers;
    public GameSettings(int someMaxPlayers, String someGameName, int someCurrentPlayers){
        maxPlayers = someMaxPlayers;
        gameName =someGameName;
        currentPlayers =someCurrentPlayers;
    }
    static void setMaxPlayers(int newMaxPlayers){
        maxPlayers = newMaxPlayers;
    }
public void addPlayer() {
    if (currentPlayers < maxPlayers) {
        currentPlayers++;
    }
}
    public void printGameStatus(){
       System.out.println("название: " + gameName + ", текущее: " +currentPlayers +" и максимальное количество игроков: " + maxPlayers);
    }
}
