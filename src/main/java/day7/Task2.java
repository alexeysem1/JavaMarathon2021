package day7;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int stamina = rand.nextInt(Player.getMaxStamina()-89)+90;
        Player player = new Player(stamina);
        int stamina1 = rand.nextInt(Player.getMaxStamina()-89)+90;
        Player player1 = new Player(stamina1);
        int stamina2 = rand.nextInt(Player.getMaxStamina()-89)+90;
        Player player2 = new Player(stamina2);
        int stamina3 = rand.nextInt(Player.getMaxStamina()-89)+90;
        Player player3 = new Player(stamina3);
        int stamina4 = rand.nextInt(Player.getMaxStamina()-89)+90;
        Player player4 = new Player(stamina4);
        int stamina5 = rand.nextInt(Player.getMaxStamina()-89)+90;
        Player player5 = new Player(stamina5);

        while(player2.getStamina()!=Player.getMinStamina()){
            player2.run();
        }
        Player.info();
        System.out.println(Player.getCountPlayers());
    }
}
