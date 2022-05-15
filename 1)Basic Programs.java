//printing hello world

import java.io.*;
class sample{
    public static void main(String args[]){
        System.out.println("hello world!");
    }
}

//Arithmetic operations

import java.util.Scanner;
class ArithmeticOperations{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in); //to take input from the user
        int a,b;
        a=sc.nextInt(); //taking input a
        b=sc.nextInt(); //taking input b
        System.out.println("Addition of two numbers"+" "+(a+b));
        System.out.println("Subtraction of two numbers"+" "+Math.abs(a-b));//prints the absolute difference
        System.out.println("multiplication of two numbers"+" "+(a*b));
        sc.close();
    }
}

//count the numbers in array which are not divisible by k 

import java.util.Scanner;
class divisible{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[],n,k,i,count=0;
        n=sc.nextInt();
        k=sc.nextInt();
        arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%k!=0){
                count++;
            }
            
        }
        System.out.println(count);
    }
}

//sum of elements in the array

import java.util.Scanner;
class SumOfElementsInArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[],n,sum=0;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
