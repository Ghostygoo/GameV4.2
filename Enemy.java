import java.util.Random;
/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy
{
    //System Objects
    Random rand1 = new Random();
    
    
    //Amount of Starting Enemy Troops
    
    int enemyTroops = rand1.nextInt(2000000 - 1750000) + 1750000;
    
    
    
    Friendly friendlySoldier1 = new Friendly();
    
    public int getETroops(){
        return enemyTroops;
    
    }
    
    public void attackFriendly100(){
        int friendlyTroops = friendlySoldier1.getFTroops() - rand1.nextInt(75 - 45) + 45;
    
    }
}
