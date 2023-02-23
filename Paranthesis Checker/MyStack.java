
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Stack;


public class MyStack{

    private Character[] a; // array of items

    //DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE


    //Creating constructor
    public MyStack() {
        this.a = new Character[4];
    }

    //Creating size method to find the length of the array
    public int size() {
        int counter=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!= null) {
                counter++;
            }
        }
        return counter;
    }

    //Checker function to control whether the array is empty or not
    public boolean isEmpty() {
        if(size()==0) {
            return true;
        }
        return false;
    }


    //If array is full, the double the length of the array to add other elements
    private void resize() {
        Character[] yeniCharacters= new Character[a.length*2];
        for (int i = 0; i < a.length; i++) {
            yeniCharacters[i]= a[i];
        }
        this.a= yeniCharacters;
    }

    //Creating push method to add close and open paranthesis
    public void push(char item) {
        int counter=0;
        for(int m=0; m<a.length; m++) {
            if(a[m]==null) {
                a[m]=item;
                break;
            }
            else {counter++;}
        }
        if(counter==a.length) {
            resize();
            for(int m=0; m<a.length; m++) {
                if(a[m]==null) {
                    a[m]=item;
                    break;
                }
            }
        }

    }

    //Remove the element that we want
    public Character pop() {
        for (int i = 1; i < a.length+1; i++) {
            Character k=a[a.length-i];
            if(a[a.length-i]!= null) {
                a[a.length-i]=null;
                return k;
            }
        }
        return null;
    }

    //Creating peek method to return the last element of an array
    public Character peek() {
        if(size()!=0) {
            return a[size()-1];
        }
        else {
            return ' ';
        }

    }


//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE

}

