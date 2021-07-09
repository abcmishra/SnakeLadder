package model;

public class Player {
    String name=null;
    int age=0;
    int id=0;

    public Player(String name,int id,int age){
        this.name=name;
        this.age=age;
        this.id=id;

    }
    public String getName(){
        return name;

    }
    public void SetName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age=age;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }

}
