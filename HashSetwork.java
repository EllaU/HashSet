/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05;
import java.util.*;

/**
 *
 * @author HP
 *///Naming the class
public class HashSetwork {

    public static void main(String[]args){
        //Instantiating the hashset class
    HashSet<Integer> hs = new HashSet<Integer>();
    //Adding values to the collection
    hs.add(67);
    hs.add(79);
    hs.add(39);
    hs.add(24);
    hs.add(65);
    //Using the iterator to get the elements
    Iterator i=hs.iterator();
    while(i.hasNext())//a method check if there are  elemnts within the collection
    {
    System.out.println(i.next());//method to retrieve the elements
    System.out.println(hs.size());//getting the size of the elements
    }
    }
}
    
