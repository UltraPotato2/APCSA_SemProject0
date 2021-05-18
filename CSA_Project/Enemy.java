import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends WorldObject
{
    /**
     * Act - do whatever the Car2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int moveSpeed = 0;
    public void act() //how the car reacts with world
    {
        move(moveSpeed);
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
    
    public Enemy(int speed){       //initialziation
        setImage(pickObstacles((randomInt(1,10)/10),randomInt(0,2)));  //set image-> pick obstacle in the car section of obstacles array. 1/10 chance of rare enemy
        moveSpeed = speed + 1;
    }
}
