package utils;

import model.Ladder;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LadderGenerator {
    Map<Integer, Ladder> ladderPosition=new HashMap<>();
    public Map<Integer,Ladder> generateLadders(int cells,int  numberOfLadder){
        while(ladderPosition.size()<=numberOfLadder){
            int top=new Random().nextInt(cells);
            int bottom=new Random().nextInt(cells);
            if(top<bottom){
                ladderPosition.put(top,new Ladder(top,bottom));
            }

        }
        return ladderPosition;
    }
}
