package partA.ex01;

public class Player {

    public Object variable;
    public Object name;
    public Object height;
    public Object years;

    public Player(String variable, String name, String height, int years) {
        this.variable = variable;
        this.name = name;
        this.height = height;
        this.years = years;
    }

    public static String player() {
        String response = "";

        /**
         * Your code goes here
         */
        String player1Name = "Stephen Curry";
        String player1Height = "6'2";
        int player1YearsInLeague = 13;

        String player2Name = "Michael Jordan";
        String player2Height = "6'6";
        int player2YearsInLeague = 15;

        System.out.println("player 1:\n");
        System.out.println("variable: " + player1Name + "\n");
        System.out.println("Height: " + player1Height + "\n");
        System.out.println("Years in the league: " + player1YearsInLeague + " years\n");

        System.out.println("player 2:\n");
        System.out.println("variable: " + player2Name + "\n");
        System.out.println("Height: " + player2Height + "\n");
        System.out.println("Years in the league: " + player2YearsInLeague + " years\n");

        return response;
    }

    public static void main(String[] args) {
        String playerOutput = player();
        System.out.print(playerOutput);
    }
}
