
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kanagroo_0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kanagroo extends WorldObject
{
    private boolean upPressed = false;
    private boolean downPressed = false;
    private boolean rightPressed = false;
    private boolean leftPressed  = false;
   
    private int points = 1;
    /**
     * Act - do whatever the Kanagroo_0 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        if(isAtEdge() && getY() == 0)
        {
            //change to reset game or go to a launch screen
            points++;
            Greenfoot.setWorld(new Part2MyWorld(this));
        }
    }    
    public int getPoints()
    {
        return points;
    }
    public void move()
    {
        int y = getY();
        int x = getX();
        String key = Greenfoot.getKey();
        if(key != null && key.equals("w")) y -= 30;
        if(key != null && key.equals("a"))x -= 30;
        if(key != null && key.equals("d"))x += 30;
        if(key != null && key.equals("s"))y += 30;
        setLocation(x,y);
    }
}
