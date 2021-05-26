package Baseball;

public class Main {

    public static void main(String[] args){
        playball();
    }
    public static void playball(){
        Team a = new Team("ソフトバンク");
        Team b = new Team("楽天");

        System.out.println(a.name + "　VS　" + b.name);
        String[] inning = {"表","裏"};

        for (int kai = 1; kai < 10; kai++){
            System.out.println("--------------------------");
            System.out.println(kai + "回" + inning[0]);
            Player player1 = new Player(0,0,0);
            Player player2 = new Player(0,0,0);
            a.out = 0;
            b.out = 0;
            while(a.out < 3){
                player1.atbat(a,player1);
            }
            //Team.base[] = {false,false,false};

            Team.base[0] = false;
            Team.base[1] = false;
            Team.base[2] = false;

            System.out.println(a.name + "の得点" + a.score);
            System.out.println("-------------------------");
            System.out.println(kai + "回" + inning[1]);
            while(b.out < 3){
                player2.atbat(b,player2);
            }
            Team.base[0] = false;
            Team.base[1] = false;
            Team.base[2] = false;
            System.out.println(b.name + "の得点" + b.score);
        }
        System.out.println(a.name + a.score + "点　：　" + b.name + b.score +"点" );
        if (a.score > b.score){
            System.out.println(a.name + "の勝利");
        }else if(a.score < b.score){
            System.out.println(b.name + "の勝利");
        }else{
            System.out.println("同点");
        }
    }
}
