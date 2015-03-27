import java.util.*;
public class WriteStuff
{
    public static String flip()
    {
        Random gen = new Random();
        int num = gen.nextInt(3);
        if (num == 1){return "heads"; }
        else if (num == 2){return "heads";}
        else {return "tails";}
    }

    public static boolean arePermutations(){return false;}

    public static printCards(ElevensBoard board) 
    { 
        List<Integer> cIndexes = board.cardIndexes();
        /* Your code goes here. */
        for (int i = 0; i < cIndexes.size(); i++)
        {
            String rank = board.cardAt(cIndexes.get(i).rank());
            String suit = board.cardAt(cIndexes.get(i).suit());
            int pV = board.cardAt(cIndexes.get(i).pointValue());
            System.out.println("Rank: " + rank + ", Suit: " + suit + ", Point Value: " + pV);
        }
    }
}