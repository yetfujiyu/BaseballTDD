package Baseball;

public class Main {
    public static void main(String[] args){
        playball();
    }

    public static void playball(){
        Team a = new Team("ソフトバンク");
        Team b = new Team("楽天");

        System.out.println(a.name + "　VS　" + a.name);
        String[] inning = {"表","裏"};

        for (int kai = 1; kai < 10; kai++){
            System.out.println(kai + "回" + inning[0]);
            System.out.println("--------------------------");
            Player player1 = new Player(0,0,0);
            Player player2 = new Player(0,0,0);
            a.out = 0;
            b.out = 0;
            while(a.out < 3){
                player1.atbatA(a);
            }
            System.out.println(a.name + "の得点" + a.scoreA);
            System.out.println(kai + "回" + inning[1]);
            System.out.println("-------------------------");
            while(b.out < 3){
                player2.atbatB(b);
            }
            System.out.println(b.name + "の得点" + b.scoreB);
        }
        System.out.println(a.name + a.scoreA + "点　：　" + b.name + b.scoreB +"点" );
        if (a.scoreA > b.scoreB){
            System.out.println(a.name + "の勝利");
        }else if(a.scoreA < b.scoreB){
            System.out.println(b.name + "の勝利");
        }else{
            System.out.println("同点");
        }
    }
}
