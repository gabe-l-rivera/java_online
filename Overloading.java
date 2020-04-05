public class Main {
    public static void main(String[] args){
        int newScore = calculateScore("Gabe", 500);
        System.out.println("My new score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    // overloaded methods must have consistent return types
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("Unnamed player scored -> no score");
        return 0;
    }


}
