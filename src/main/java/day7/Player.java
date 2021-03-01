package day7;

public class Player {
    private int stamina;
    private static int countPlayers = 0;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
        if (countPlayers>6)
            countPlayers--;
    }

    public int getStamina() {
        return stamina;
    }
    public static int getMaxStamina(){  //Постарался реализовать все по максимуму через геттеры,
        return MAX_STAMINA;             //хотя думаю лучше было бы просто указать границы в rand.nextInt() числами
    }
    public static int getMinStamina(){
        return MIN_STAMINA;
    }

    public void run() {
        stamina--;
        if (getStamina() == 0)
            countPlayers--;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }


    public static void info() {
        if (countPlayers < 6)
            System.out.println("Команды неполные. На поле еще есть " + (6 - Player.getCountPlayers()) + " свободных мест");
        else if (countPlayers == 6)
            System.out.println("На поле нет свободных мест");
    }

}
