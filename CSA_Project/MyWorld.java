import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
            Car1 car1 = new Car1();
            addObject(car1, 0, y);
        }
        if (type == 1)
        {
            Car2 car2 = new Car2();
            addObject(car2, 0, y);
        }
        if (type == 2)
        {
            Car3 car3 = new Car3();
            addObject(car3, 0, y);
        }
        if (type == 3)
        {
            Car4 car4 = new Car4();
            addObject(car4, 0, y);
        }
    }
}
