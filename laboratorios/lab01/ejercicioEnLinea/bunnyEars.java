
/**
 * 
 * 
 * @author Diego Munera, Maria Antonia Velasquez
 * Cantidad de orejas de una cantidad dada de conejos.
 */
public class bunnyEars
{
    public int bunnyEars(int bunnies){
        if(bunnies==0) return 0;
        return 2 + bunnyEars(bunnies-1);
    }
}
