
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kanagroo_0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kanagroo extends WorldObject
{
    private int score = 0;
    /**
     * Act - do whatever the Kanagroo_0 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        
        if (isAtEdge() && getY() == 0)
        {
            nextLevel();
        }
    }    
    public void move()
    {
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("w"))y--;
        if(Greenfoot.isKeyDown("a"))x--;
        if(Greenfoot.isKeyDown("d"))x++;
        setLocation(x,y);
    }
    
    public void nextLevel(){
        score++;
        Greenfoot.setWorld(new MyWorld());
    }
}
