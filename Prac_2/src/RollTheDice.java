import java.lang.Math;
public class RollTheDice {

    public static void main(String[] args){

        double rand1 = Math.random()*6+1;
        double rand2 = Math.random()*6+1;

        int numb = (int) Math.round(rand1);
        int numb2 = (int) Math.round(rand2);

        System.out.println("The first die comes up " + numb);
        System.out.println("The second die comes up " + numb2);
        System.out.println("Your total roll is " + (numb + numb2));





    }


}
