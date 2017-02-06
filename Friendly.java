import java.util.Random;
/**
 * everything that deals with Friendly's
 * 
 * @ Cameron Parry
 * @ version (1)
 */
public class Friendly
{
     //System Objects
    
    
    //Amount of starting troops
    public int randFriendlyTroops(){
       Random rand2 = new Random();
       friendlyTroops = rand2.nextInt(1500000 - 1250000) + 1250000;
    }
    Enemy enemySoldier1 = new Enemy();
    
    public void attackEnemy100(){
         Random rand3 = new Random();
        int enemySoldiers = enemySoldier1.getETroops() - rand3.nextInt(95 - 50) + 50;
    }
    
    public void attackEnemy100k(){
        Random rand4 = new Random();
        int enemySoldiers = enemySoldier1.getETroops() - rand4.nextInt(99500 - 70000) + 70000;
    }
    
    
    
    
    
}

