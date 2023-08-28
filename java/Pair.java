/** 
* Pair: A simple example of class in JAVA.
* @author Pablo Castro
**/
public class Pair{
	private int x;
	private int y;
	
	/** 
	* Constructor of the class
	**/
	public Pair(){
		x = 0;
		y = 0;
	}

	/**
	 * Constructor of the class
	 * @param x the first component
	 * @param y the second component
	 * @precondition true
	 * @postcondition creates the new object
	 **/
	public Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Get the first coordinate
	 * @return the first value of the pair
	 * @precondition true
	 * @postcondition return the first item
	 **/
	public int fst(){
		return this.x;
	}
	
	/**
	 * Get the second coordinate
	 * @return the second value of the pair
	 * @precondition true
	 * @postcondition return the second value.
	 **/
	public int snd(){
		return this.y;
	}
	
	/**
	 * Change the first coordinate
	 * @param x change the first value
	 * @precondition true
	 * @postcondition change x
	 **/
	public void changeFst(int x){
		this.x = x;
	}
	
	/**
	 * Change the second coordinate
	 * @param y change the second value
	 * @precondition true
	 * @postcondition change the second value
	 **/
	public void changeSnd(int y){
		this.y = y;
	}
	 
}