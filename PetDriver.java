
public class PetDriver
{
    
    public static void main(String[] args) {
        Pet fluffy = new Pet("Fluffy", true, 0);
        System.out.println(fluffy);
        
        
        Pet.example();
        System.out.println("Number of pets: " + Pet.numPets);
        
        
    }
    
}
