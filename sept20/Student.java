
package sept20;
import java.util.Scanner;
import java.util.*;
public class Student {
   /* public static void main(String[] args)
    {
      ArrayList<String> ar =new ArrayList<String>();// only string type hi data work there there
      // add the element
      ar.add("123");
      ar.add("mohsin");
       // get() is used the get the element at specific index
       //rebember index always start from 0
       //for getting third element that is and 
       // System.out.println("first index values="+ar.get(1));
        // set() method is used(update) the specific index
       // System.out.println("1,ram kumar");
      // ArrayList <Integer> list1=new arrayList<>();
       //List1.add(12);
       */
    // cheak the hetroginious value insert 
public static void main(String[] args) {
ArrayList a1=new ArrayList();
a1.add("mohsin"); 
a1.add(111); //a1.add(Integer.valueOf(111))
a1.add(67.5f); //a1.add(Float.valueOf(66.5f))
a1.add('A'); //a1.add(Character,valueOf('A');
System.out.println("student data are : "+a1);
System.out.println("first index values="+a1.get(1));// values ko show karne ke liye used kiya jata hai ok 
System.out.println("updated insert  values="+a1.set(3,"mohan"));//set() method only used of set the values those value want to update 
System.out.println("updated values ="+a1.get(3));// get() method only showing purpose work 
    System.out.println("updated values="+a1);      
    }
    
}
