package pl.sdacademy;

public class Main {

    public static void main(String[] args) {
        int height = 10;
        int width = 10;

        for(int i=0; i < width; i++) {
            for(int j=0; j < height; j++) {
                if(j <= i) {
                    System.out.print("*");
                }
                continue;
            }
            System.out.println();
        }

    }
}
