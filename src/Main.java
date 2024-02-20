// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] aray = new int[]{1,2,3};
        try {
            System.out.println("Access Element " + aray[3]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}