import java.util.Scanner;

public class LogicSim {
    private int intA;
    private int intB;

    private Scanner input;

    public LogicSim() {
        intA = -1;
        intB = -1;
        input = new Scanner(System.in);
        setup();
    }

    public int circuitOne(){
        NOT startA = new NOT(intA);
        NOT startB = new NOT(intB);

        AND notA_B = new AND(startA.getResult(), intB);

        AND notB_A = new AND(startB.getResult(), intA);

        OR finalBit = new OR(notB_A.resultInt(), notA_B.resultInt());


        return finalBit.resultInt();
    }



    public int[] circuitTwo(){
        XOR xorAB = new XOR(intA, intB);

        AND andAB = new AND(intA, intB);

        int[] returnArray = {xorAB.resultInt(), andAB.resultInt()};

        return returnArray;
    }

    public String toString(int[] array){
        String returnString = "[";

        int index = 0;
        for(int i : array){
            String addString = String.valueOf(i);
            if(index == array.length-1){
                returnString += addString;
            } else {
                returnString += addString + ", ";
            }
            index++;
        }
        return returnString + "]";
    }

    public void setup(){
        while(intA < 0 || intA > 1) {
            System.out.print("Enter value for int A : ");
            intA = input.nextInt();
        }

        while(intB < 0 || intB > 1) {
            System.out.print("Enter value for int B : ");
            intB = input.nextInt();
        }
    }
    public static void main(String[] args) {
        LogicSim test = new LogicSim();
        System.out.println(test.circuitOne());
        System.out.println(test.toString(test.circuitTwo()));
        System.out.print(test.intA + " " + test.intB);
    }
}