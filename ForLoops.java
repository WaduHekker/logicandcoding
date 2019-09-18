//Java class ForLoops.java
/**
 * Skeleton code for the for loops practice day.
 * @author Roy Chaancellor
 * @version 2/26/2019
 */
public class ForLoops
{
    public static void main (String ags[]){
        int cubed, odd;
        System.out.println();
        System.out.println("i\tcubed");
        
    for (int i = 1; i <= 10; i++){
        cubed = i*i*i;
        System.out.println(i + "\t" + cubed);
    }
    System.out.println();
    for (int j = 99; j >=1; j = j - 2){
        odd = j;
        System.out.println(odd);
    }
    System.out.println();
    String q = "The quick brown fox jumped over the lazy dog.";
    System.out.println (q);
    q.charAt(0);
    for (int k = 0; k < q.length(); k++) {
        System.out.println(q.charAt(k));
    }
}//end main
}   //end ForLoops class