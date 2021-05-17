import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends WorldObject
{
    /**
     * Act - do whatever the Car2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() //how the car reacts with world
    {
        move(1);
        if (isAtEdge() )
        {
            turn(180);
        }
        
        Actor a = this.getOneIntersectingObject(Kanagroo.class);
        if(a!=null)
        {
            //change to reset game or go to a launch screen
            
            Greenfoot.setWorld(new MyWorld());
        }
    }
    
    public Car(){       //initialziation
        setImage(pickObstacles(0,randomInt(0,2)));  //set image-> pick obstacle in the car section of obstacles array
    }
}
