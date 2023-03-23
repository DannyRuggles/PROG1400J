//Author = Danny Ruggles
//Filename = smallestInt.java


public class smallestInt {
    public static void main(String[] args) {
        int n = 0;
        while (n * n <= 12000) {
            n++;
        }
        System.out.println(n);
    }
}
