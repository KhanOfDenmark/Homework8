import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Task#1
        byte[] byteVariable = new byte[]{1, 2, 3};
        float[] floatVariable = {1.57f, 7.654f, 9.986f};
        short[] shortVariable = new short[10];
        shortVariable[3] = 4;
        System.out.println("***");

        //Task#2
        for (byte i=0;i<byteVariable.length;i++) {
            System.out.print(byteVariable[i]);
            if (i!=byteVariable.length-1) {
                System.out.print(", ");
            }else{
                System.out.println();
            }
        }
        for (byte i=0;i<floatVariable.length;i++) {
            System.out.print(floatVariable[i]);
            if (i!=floatVariable.length-1) {
                System.out.print(", ");
            }else{
                System.out.println();
            }
        }
        for (byte i=0;i<shortVariable.length;i++) {
            System.out.print(shortVariable[i]);
            if (i!=shortVariable.length-1) {
                System.out.print(", ");
            }else{
                System.out.println();
            }
        }
        System.out.println("***");

        //Task#3
        for (int i=byteVariable.length-1;i>=0;i--) {
            System.out.print(byteVariable[i]);
            if (i!=0) {
                System.out.print(", ");
            }else{
                System.out.println();
            }
        }
        for (int i=floatVariable.length-1;i>=0;i--) {
            System.out.print(floatVariable[i]);
            if (i!=0) {
                System.out.print(", ");
            }else{
                System.out.println();
            }
        }
        for (int i=shortVariable.length-1;i>=0;i--) {
            System.out.print(shortVariable[i]);
            if (i!=0) {
                System.out.print(", ");
            }else{
                System.out.println();
            }
        }
        System.out.println("***");

        //Task#4
        for (byte i=0; i<byteVariable.length; i++) {
            if (byteVariable[i]%2!=0) {
                byteVariable[i]+=1;
            }
        }
        System.out.println(Arrays.toString(byteVariable));
        System.out.println("***");
    }
}