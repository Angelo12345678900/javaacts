public class Main {
    public static void main(String[] args) {
        byte b = 0;
        short s = 2;
        int i = 1;
        char c = 'H';
        float f = 2.0f;
        boolean bool = true;

        String output = "" + c + (b + 3) + (i + 1) + " w" + (s + 1) + "r" + (i + 1) + "d " + f + " " + bool;
        
        System.out.println(output);
    }
}
