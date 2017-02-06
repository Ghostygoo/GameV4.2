  
 
 
 import java.util.Random;
 import java.util.Scanner;
/**
 * Is the game itself. Runs everything the player sees in the terminal prompt.
 * 
 * @ Cameron Parry (Partially William Cape)
 * @version (2)
 */


// hey this is making sure that it uploads changes


public class Main
{
        public static void main(String[] args){
            // System Objects
            Scanner in = new Scanner(System.in);
            Random rand = new Random();
        
            // Game variables
            String[] enemies = {"Droid Soldiers", "Droid Destroyers", "Helicopters", "Automated Turrets"};
        
        
            //Number variables
            
            
            
        
            Friendly friendlySoldier = new Friendly();
            Enemy enemySoldier = new Enemy();
        
            
        
        
           
                String[] wallSide = {"North Wall", "West Wall", "South Wall", "East Wall"}; 
                
                // Boolean Conditionals
                boolean NorthWall = false;
                boolean SouthWall = false;
                boolean EastWall = false;
                boolean WestWall = false;
                
                
                
                // Boolean Conditionals END
            
                System.out.println("This is a test.\n1. start\n2. End game");
                System.out.println("-----------------");
                //String enemy = enemies[rand.nextInt(enemies.length)]; // randomizes the enemies
            
                String input = in.nextLine();
                if(input.equals("1")){
                    
            
                
                System.out.println("You have started the game.");    
                System.out.println("You are mounting the final assault against Citadel 2 in Moscow, Russia. The dictator over the Russian district is expecting you. Make your strategy count, you're given a restricted amount of troops. You may have the chance to be reinforced.");   
                System.out.println("\nAre you ready?\n1. Yes\n2. No\n> ");
                String input2 = in.nextLine();
                    if (input2.equals("1")){
                        System.out.println("You have: " + friendlySoldier.getFTroops() + " soldiers");
                        System.out.println("The enemy has: " + enemySoldier.getETroops() + " droid soldiers");
                        System.out.println("Attack: North, South, West, East");
                        System.out.println("Which side?\n1. North\n2. South\n3. West\n4. East\n> ");
                        String input3 = in.nextLine();
                            if(input3.equals("1")){
                                NorthWall = true;    
                                System.out.println("You wish to attack the Northern Wall");
                                System.out.println("How many troops do you want to send?\n1. 100\n2. 500\n3. 1,000\n4. 5,000\n5. 10,000\n6. 20,000\n7. 50,000\n8. 100,000\n> ");
                                String input4 = in.nextLine();
                                
                        
                            }
                            else if(input3.equals("2")){
                                    System.out.println("You have attacked the South Wall.");
                                    System.out.println("Attack with:\n1. 100\n2. 100000");
                                    String input4 = in.nextLine();
                                    if(input4.equals("1")){
                                        friendlySoldier.attackEnemy100();
                                        enemySoldier.attackFriendly100();
                                        System.out.println("You have: " + friendlySoldier.getFTroops() + " Troops");
                                        System.out.println("The Enemy has: " + enemySoldier.getETroops() + " Troops");
                                    
                                    }
                                    else if(input4.equals("2")){
                                    
                                    
                                    }
                            }
                            else if(input3.equals("3")){
                                    System.out.println("You have attacked the West wall.");
                            }
                            else if(input3.equals("4")){
                                    System.out.println("You have attacked the East Wall.");
                            }
                            else{
                            
                            }
                    }
                    else if(input2.equals("2")){
                      
                    }
                    else{
                    
                    }
                    
                
                
                
                }
                else if(input.equals("2")){
                    
                }
                else{
            
            }
        }
    }
        
        
        
        
        /*Melhor resposta:  Only you know the classes behind your vision. Take time to review and/or learn object oriented concepts. From what I can tell so far, break your classes into what you mentioned already. Have a Parent abstract class called Monster, then have all types of monsters inherit the common variables and functions of all monsters from it. Maybe have an attack method in your Monster class that generates a random attack out of a List of attacks. You can organize your Attacks into a classes too. Health would be an attribute of your monsters, meaning a variable. Make sure you have getHealth and setHealth methods to your private double Health; method in your Monsters class for example. These are getters and setters. You can have a class of Weapons in the same fashion and have the arrow class be a child of it. For every weapon type you can give attributes/variables such as attack damage. Every Monster can have a cash variable too and a life variable. You can have a method called buyLife where you can pass in the money amount you want to spend. This is exciting, use your imagination. Hopefully this stuff will get you going. 

Remember design of any good program is fun and an iterative process. By the end of it all you have two things: 

1. Good time 
2. A whole new understanding and knowledge 

Goodluck youngen!
Caggy · 9 anos atrás*/
        
    
    
    
    
    
 
