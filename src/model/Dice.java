package model;

import java.util.Random;

public class Dice {

    public int rollDice(int numberOfFaces){
        int faceValue=new Random().nextInt(numberOfFaces);
        while(faceValue>numberOfFaces){
            faceValue=new Random().nextInt(numberOfFaces);

        }
        return faceValue;


    }

}
