package fr.p10.miage.rps.model;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by arrabeon on 27/09/2016.
 */
public class RockPaperScissors
{
    /**
     * @param p1
     * @param p2
     * @return WIN if p1 beats p2, TIE if both are equals else LOST
     */
    public Result play(RPSEnum p1, RPSEnum p2)
    {
        boolean paperRock = p1 == RPSEnum.PAPER && p2 == RPSEnum.ROCK;
        boolean rockScissors = p1 == RPSEnum.ROCK && p2 == RPSEnum.SCISSORS;
        boolean scissorsPaper = p1 == RPSEnum.SCISSORS && p2 == RPSEnum.PAPER;

        if(paperRock || rockScissors || scissorsPaper)
            return Result.WIN;
        if(p1==p2)
            return Result.TIE;

        return Result.LOST;
    }
}
