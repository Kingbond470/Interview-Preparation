package Interview;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
            String str="abc";
            char[] ch=str.toCharArray();
            int idx=0;
            permutations(ch,idx);

    }

    // to calculate and print all the permutations
    public static void permutations(char[] ch, int idx){

        if(idx==ch.length){
            // handle index out of bounds
            System.out.print(ch);
            System.out.println();
            return;
        }

        // swap function
        for(int i=idx; i<ch.length; i++){
            swap(ch,idx,i);
            permutations(ch,idx+1);
            swap(ch,idx,i);
        }

    }

    public static void swap(char[] ch,int first, int second){
        char temp=ch[first];
        ch[first]=ch[second];
        ch[second]=temp;
    }
}

/*
ABc
a
 */
/*
A permutation also called an “arrangement number” or “order,”
is a rearrangement of the elements of an ordered list S into a one-to-one correspondence with S itself.
 A string of length n has n! permutation.

Below are the permutations of string

Input :- ABC.

Output :- ABC ACB BAC BCA CBA CAB
ABCD


 */