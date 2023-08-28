/**
* A simple class for pairs with undo
* @author Pablo Castro
*/

public class MemoryPair extends Pair{
    
    private int previousX; // the previous value of x
    private int previousY; // the previous value of y
    
    /**
    * A basic constructor
    */
    public MemoryPair(){
        super(); // it calls to the super constructor
        previousX = 0;
        previousY = 0;
    }
    
    /**
    * Another constructor that takes two parameters
    */
    public MemoryPair(int x, int y){
        super(x, y);
        previousX = 0;
        previousY = 0;
    }

    /**
    * It changes the x
    * @param v  the new value
    */
    @Override
    public void changeFst(int v){
        previousX = fst();
        super.changeFst(v);
    }
    
    /**
    * It changes the y
    * @param v  the new value
    */
    @Override
    public void changeSnd(int v){
        previousY = fst();
        super.changeSnd(v);
    }
    
    /**
    *   It recovers the old values of x and y
    */
    public void recover(){
        changeFst(previousX);
        changeSnd(previousY);
    }
    
}// end of class





