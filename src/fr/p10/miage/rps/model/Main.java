package fr.p10.miage.rps.model;

/**
 * Created by arrabeon on 27/09/2016.
 */
public class Main
{
    public static void main(String[] args)
    {
        RockPaperScissors rps = new RockPaperScissors();
        rps.play(RPSEnum.PAPER, RPSEnum.ROCK);
    }
}
