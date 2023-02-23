

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ParanthesisChecker {


    public boolean isCorrect(String javaCode) {

        //DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE

        //Creating a stack obeject
        MyStack a= new MyStack();

        //Creating a for loop to find the length of the array that I want to create.
        int count=0;
        for (int i = 0; i < javaCode.length(); i++) {
            if(javaCode.charAt(i)=='"') {
                count++;
            }
        }

        //Creating array
        int[] indexArray= new int[count];
        int n=0;
        //Adding the index of '"' to the array
        for (int i = 0; i < javaCode.length(); i++) {
            if(javaCode.charAt(i)=='"') {
                indexArray[n]=i;
                n++;
            }
        }

        //Creating a for loop to find the length of the array that I want to create.
        int count1=0;
        for (int i = 0; i < javaCode.length(); i++) {
            if(javaCode.charAt(i)=='\'') {
                count1++;
            }
        }

        //Creating array
        int[] indexArray2= new int[count1];
        int p=0;
        //Adding the index of '\'' to the array
        for (int i = 0; i < javaCode.length(); i++) {
            if(javaCode.charAt(i)=='\'') {
                indexArray2[p]=i;
                p++;
            }
        }



        //Using 2 for loop to jump on the index that I want
        for(int k=0; k<javaCode.length();k++) {
            for(int m=0; m<indexArray.length;m+=2) {
                if(k==indexArray[m]) {
                    k=indexArray[m+1];
                    break;
                }
            }

            for(int m=0; m<indexArray2.length;m+=2) {
                if(k==indexArray2[m]) {
                    if(indexArray2.length >1){
                    k=indexArray2[m+1];}
                    break;
                }
            }




            //Controlling the open paranthesis. If there is exist, adding them to 'a'
            if(javaCode.charAt(k)==('(')){
                a.push('(');
            }
            if(javaCode.charAt(k)==('{')){
                a.push('{');
            }

            //Controlling the close paranthesis. If there is exist, poping them to 'a'
            if(javaCode.charAt(k)==(')')){
                //Controlling the size of a
                if(a.peek()== ('(') && a.size()!=0) {
                    a.pop();
                }
                else {
                    return false;
                }
            }
            if(javaCode.charAt(k)==('}')){
                //Controlling the size of a
                if(a.peek()== ('{') && a.size()!=0) {
                    a.pop();
                }
                else {
                    return false;
                }
            }
        }


        //At the end, if 'a' is empty, then paranthesis are correct and return true, else return false.
        if(a.isEmpty()) {
            return true;
        }

        else {return false;}


        //DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE

    }

}


