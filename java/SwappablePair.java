/**
* Small example of inheritance
* @author Pablo Castro
**/
public class SwappablePair extends Pair{

    /** 
    * Basic Constructor
    */
    public SwappablePair(){
        super(); // it only calls super's constructor
    }
    
    /**
    * A more interesting constructor
    */
    public SwappablePair(int x, int y){
        super(x, y); // it calls super's constructor
    }
    
    /** 
    * Change X for Y and viceversa
    * 
    * @precondition x=X and y =Y
    * @postcondition x=Y and y=X
    **/
    public void swap(){
	int temp = fst();
	changeFst(snd());
	changeSnd(temp);
    }
	
}

