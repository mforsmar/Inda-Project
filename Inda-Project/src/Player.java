/**
 * @author jenna
 * @version 2015-05-12
 */
public class Player {
    String name;
    int age;
    double alcoholLVL;
    int t = 0;

    public Player(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    public double getPlayerAlcohol() { return alcoholLVL; }

    public void time() { return t; }

    public void drink(){
        time += 20;
    }

    public void puke(){
        time += 30;
    }

    public void enterRoom(){
        time += 10;
    }

    public void talk(){
        time += 15;
    }
}
