
/**
 * Write a description of class Pet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pet
{
    private Hat h;
    private boolean alive;
    private String name;
    private static int numPets;
    
    
    
    /**
     * Constructor for objects of class Pet
     */
    public Pet(String nm, boolean alv)
    {
        // initialise instance variables
        numPets++;
        
    }
    
    
    public boolean equals(Pet other) {
        if (this.name.equals(other.name)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void example(){
        System.out.print("This is a static method!");
    }

}