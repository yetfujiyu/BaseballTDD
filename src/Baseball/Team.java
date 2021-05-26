package Baseball;
public class Team {
    String name;
    int out = 0;
    int score = 0;
    static boolean base[] = {false,false,false};
    Team(String name) {
        this.name = name;
    }

    public static void goFirst(Team team){
        base[0] = true;
    }
    public static void goSecond(Team team){
        base[1] = true;
    }
    public static void goThird(Team team){
        base[2] = true;
    }
    public static void goHome(Team team){
        base[2] = false;
        team.score++;
    }
}
