/**
* Una clase simple que usa Pair.java para calcular el minimo y maximo de un arreglo
* @author Pablo Castro
**/

public class MinMax{

        public static void main(String[] args){
            int[] sample1 = {4,7,3,6,8,1,9,2};
            System.out.println("Result of iterative MaxMin");
            Pair result = minMaxArray(sample1, 0, sample1.length-1);
            System.out.println("Min: "+ result.fst() + " Max: "+ result.snd());
            System.out.println("Result of recursive MaxMin");
            Pair rresult = rMinMaxArray(sample1, 0, sample1.length-1);
            System.out.println("Min: "+ rresult.fst() + " Max: "+ rresult.snd());
        }
    
        /*
        * @param i  the starting of the array
        * @param j  the end of the array
        * @result A pair with the min and max
        * @precondition 0 <= i <a.length & 0 <= j < a.length
        * @postcondition (min, max), in the case of empty array (0,0)
        **/
        public static Pair minMaxArray(int[] a, int i, int j){
            if (i>j){
                Pair result = new Pair(0,0);
                return result;
            }
            else{
                Pair res_sub = new Pair(a[i], a[i]);
                int k = i;
                while (k <= j){
                    if (a[k] < res_sub.fst())
                        res_sub.changeFst(a[k]);
                    if (a[k] > res_sub.snd())
                        res_sub.changeSnd(a[k]);
                    k++;
                }
                return res_sub;
            }
        }// end minMaxArray
    
        /*
        * @param i  the starting of the array
        * @param j  the end of the array
        * @result A pair with the min and max
        * @precondition 0 <= i <a.length & 0 <= j < a.length
        * @postcondition (min, max), in the case of empty array (0,0)
        **/
        public static Pair rMinMaxArray(int[] a, int i, int j){
            if (i>j){
                Pair result = new Pair(0,0);
                return result;
            }
            else{
                if (i == j) // caso base
                    return new Pair(a[i], a[i]);
                else{ // caso recursivo
                    Pair res_sub = rMinMaxArray(a, i+1, j);
                    int min = Math.min(res_sub.fst(), a[i]);
                    int max = Math.max(res_sub.snd(), a[i]);
                    Pair result = new Pair(min, max);
                    return result;
                }
            }
        }// end rMinMaxArray
    
}// end class
