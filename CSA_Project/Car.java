    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class Car here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Car extends WorldObject
    {
        /**
         * Act - do whatever the Car wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        public Car(){
            final int startY = getY();
            final int startX = getX();
        }
        
        public void act() 
        {
            runAcross();
        }    
        
        public void runAcross()
        {
            move(1);
            if (isAtEdge())
            {
                setLocation(startX,startY);
            }
        }
}
