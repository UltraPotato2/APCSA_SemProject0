import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x800 cells with a cell size of 1x1 pixels.
        super(600, 800, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void prepare()
    {
        Kanagroo kang = new Kanagroo();
        addObject(kang,300, 750);
        String level = "Level: " + kang.getPoints();
        showText(level, 550, 25);
        int y = 700;
        while(y >= 0)
        {
            if(randomInt(0,2) > 0){
                create((int)(Math.random() * kang.getPoints()), y); //speed is random upto the current level
                y-=120;
            }else{
                y -= 60;
            }    
        }
    }
    
    public void create(int speed, int y) //creates a car object
    {
        
            Enemy enemy = new Enemy(speed);
            int leftRight = (int)(Math.random() * 2) * 580;
            addObject(enemy,leftRight, y);
        
    }
    
    public int randomInt(int min, int max){          //choses random int between min and max inclusive
        return ((int)(Math.random()*(max-min+1)+min));
    }
}
