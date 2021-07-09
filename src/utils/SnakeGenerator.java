package utils;


import model.Snake;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SnakeGenerator {
    public static  Map<Integer, Snake>  generateSnakes(int boardSize, int numberOfSnake){
        Map<Integer,Snake> snakePosition=new HashMap<>();
        while(snakePosition.size()<=numberOfSnake){
            int head=new Random().nextInt(boardSize);
            int tail=new Random().nextInt(boardSize);
            if(head>tail){
                snakePosition.put(head,new Snake(head,tail)); //why new snake here
            }
        }
        return snakePosition;






    }

}
