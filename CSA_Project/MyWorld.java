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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Kanagroo kanagroo = new Kanagroo();
        addObject(kanagroo,300,350);
        int y = 300;
        for (int x = 0; x < 9; x++)
        {
            create((int)(Math.random() * 4), y);
            y -= 35;
        }
    }
    
    private void create(int type, int y)
    {
        
        if (type == 0)
        {
            Car car = new Car();
            addObject(car, 0, y);
        }
    }
}
