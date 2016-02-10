package Opdracht1;

/**
 * Created by tulip on 08/02/2016.
 */
public class AddUp {

    public int addUp(int A){    //this methode reads the int as a constituent digit.

        int num = 0;
        int sum = 0;
        while(A!=0)
        {
            num = A%10;
            sum = sum + num;
            A = A/10;
        }
        return sum;
    }

}
