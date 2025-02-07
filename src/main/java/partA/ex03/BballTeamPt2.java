package partA.ex03;

public class BballTeamPt2 {
    public static String BballTeam() {
        String response = "";

        /**
         * Your code goes here
         */

        String player1 = new String("Stephen Curry");
        String player2 = new String("Michael Jordan");

        response += (player1 == player2) + "\n";
        player1 = "Stephen Curry";
        player2 = "Michael Jordan";
        response += (player1 == player2) + "\n";

        return response;
    }

    public static void main(String[] args) {
        String teamOutput = BballTeam();
        System.out.print(teamOutput);
    }
}
