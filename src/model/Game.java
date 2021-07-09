package model;

import constants.Status;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Game {
    Board board=null;
    Player currentPlayer;
    Status status=Status.INPROGRESS;

    Queue<Player> players=new LinkedList<Player>();

    public Game(int cells,int numberOfSnakes,int numberOfLadders,int playerCount,String name,int age,int id){
        initBoard(cells,numberOfSnakes,numberOfLadders);
        initPlayers(playerCount,name,age,id);


    }




    public void initBoard(int cells,int numberOfSnakes,int numberOfLadder){
        Board board=new Board(cells,numberOfSnakes,numberOfLadder);

    }
    public void initPlayers(int playerCount,String name,int age,int id){
        for(int i=0;i<playerCount;i++){
            Player player=new Player(name,age ,id);
            players.add(player);

        }
    }
    public Board getBoard(){
        return board;
    }
    public void setBoard(Board board){
        this.board=board;
    }
    public Player getCurrentPlayer(){
        return currentPlayer;
    }
    public void setCurrentPlayer(Player currentPlayer){
        this.currentPlayer=currentPlayer;
    }
    public Queue<Player> getPlayers(){
        return players;
    }
    public void setPlayers(Queue<Player> players){
        this.players=players;
    }
    public Status getStatus(){
        return status;
    }
    public void setStatus(Status status){
        this.status=status;

    }



}
