import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldObject extends Actor
{
    private String[][] obstacles = {{"car01","car02","car03"}, {}};
    /**
     * Act - do whatever the WorldObject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public String getImageName(String name){
       return ("images/"+name+".png");
    }
    
    public int randomInt(int min, int max){
        return ((int)(Math.random()*(max-min+1)+min));
    }
    
    public String pickObstacles(int arrX, int arrY){
        return getImageName(obstacles[arrX][arrY]);
    }
}
