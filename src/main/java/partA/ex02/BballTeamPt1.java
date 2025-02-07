package partA.ex02;
import partA.ex01.Player;

public class BballTeamPt1 {
    public static String BballTeam() {
        String response = "";

        Player player1 = new Player("Stephen Curry", "Stephen Curry", "6'2", 13);
        Player player2 = new Player("Michael Jordan", "Michael Jordan", "6'6", 15);
        response += (player1 == player2) + "\n";

        player1.name = "Michael Jordan";
        player1.height = "6'6";
        player1.years = 15;

        response += (player1 == player2) + "\n";
        player1 = player2;
        response += (player1 == player2) + "\n";

        return response;
    }

    public static void main(String[] args) {
        String teamOutput = BballTeam();
        System.out.print(teamOutput);
    }
}
