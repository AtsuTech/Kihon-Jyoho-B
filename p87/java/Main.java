package p87.java;

public class Main {
    public static void main(String[] args) {
        String binary = "10010";
        int result = 0;
        for(int i=0;i<binary.length();i++){
            result = result*2 + (binary.charAt(i) - '0');
        }
        System.err.println(result);
    }
}
