package Baseball;

import java.util.Random;
public class Player { //<player1>を書いてた
    int ball = 0;
    int strike = 0;
    int result = 0;
    int daseki = 0;
    Player(int ball, int strike, int hit){
        this.ball = ball;
        this.strike = strike;
    }
    String[] atbatResult = {"ball","strike","out", "hit"};
    public void atbat(Team team, Player player1){

        Random rad = new Random();//0:ball 1:strike 2:out 3:hit
        result = rad.nextInt(4);
        switch (result){
            case 0:
                    ballcount(team);
                break;
            case 1:
                    strilecount(team);
                break;
            case 2:
                team.out++;
                this.ball = 0;
                this.strike = 0;
                break;
            case 3:
                hitcount(team);
                break;
        }
        System.out.println("結果：" + atbatResult[result]);
        System.out.println("塁:" + Team.base[0] + "　" + Team.base[1] + "　" + Team.base[2]);
        System.out.println("ボール：" + this.ball);
        System.out.println("ストライク：" + this.strike);
        System.out.println("アウト：" + team.out);
    }

    public void strilecount(Team team) {
        this.strike ++;
        if(this.strike == 3){
            team.out ++;
        this.strike = 0;
        this.ball = 0;
        }
    }

    public void ballcount(Team team) {
        this.ball++;
        if (this.ball == 4) {
            this.ball = 0;
            this.strike = 0;
            if (Team.base[2] == true && Team.base[1] == true && Team.base[0] == true) {
                Team.goHome(team);
                Team.goThird(team);
                Team.goSecond(team);
                Team.goFirst(team);
            } else if (Team.base[0] == false) {
                Team.goFirst(team);
            } else if (Team.base[0] == true) {
                Team.goSecond(team);
                Team.goFirst(team);
            } else if (Team.base[0] == true && Team.base[1] == true) {
                Team.goThird(team);
                Team.goSecond(team);
                Team.goFirst(team);
            } else if (Team.base[0] == true && Team.base[2] == true) {
                Team.goSecond(team);
                Team.goFirst(team);
            }
        }
    }

    public void hitcount(Team team){
        Random radDaseki = new Random();
        daseki = radDaseki.nextInt(1);
        switch (daseki) {
            case 0:
                if(Team.base[2] == true)
                    Team.goHome(team);

                if(Team.base[1] == true)
                    Team.goThird(team);

                if(Team.base[0] == true)
                    Team.goSecond(team);

                Team.goFirst(team);
                break;
        }
            this.ball = 0;
            this.strike = 0;
    }
}