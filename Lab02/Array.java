package oolt_lab02;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int A[] = new int[1000];
        for (int i = 0; i<1000; i++){
            A[i] = r.nextInt(100);
        }
        int n;
        System.out.println("Enter n(<1000): ");
        n = input.nextInt();
        char B[]= new char[n];
        int C[] = new int[n];
        System.out.println("Enter array: ");
        for (int j =0; j<n; j++) {
            B[j] = input.next().charAt(0);
        }
        for (int j =0; j<n; j++) {
            if(B[j] == '$') {
                C[j] = A[j];
            }else {
                C[j] =Integer.parseInt(String.valueOf(B[j])) ;

            }
        }
        System.out.println("Array: ");
        Arrays.sort(C);
        int sum=0;
        for (int j =0; j<n; j++){
            sum += C[j];
            System.out.println(C[j]);
        }
        System.out.println("Sum : "+ sum );
        System.out.println("Average: "+ (double)sum/n);
    }
}
