package model;



import java.util.Map;

public class Board {
    int size=0;

    Map<Integer,Snake> snakes=null;
    Map<Integer,Ladder> ladders=null;
    public Board(int cells,int numberOfSnakes,int numberOfLadders){
        this.size=cells*cells;


    }
    public Map<Integer,Snake> getSnakes(){
        return snakes;
    }
    public void setSnakes(Map<Integer,Snake> snakes){
        this.snakes=snakes;
    }
    public Map<Integer,Ladder> getLadder(){
        return ladders;
    }
    public void setLadder(Map<Integer,Ladder> ladders){
        this.ladders=ladders;

    }
    public int getSize(){
        return size;

    }

}
