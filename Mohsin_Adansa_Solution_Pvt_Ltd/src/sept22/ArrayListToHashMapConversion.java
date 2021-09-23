// Java program to convert ArrayList
// to HashMap
package sept22;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
//public class ArrayListToHashMapConversion {
class ArrayListExample {
       public static void main(String[] args){
        
        ArrayList<String> studentList
            = new ArrayList<>(Arrays.asList("101", "rohan"));
  
        System.out.println(
            "-------------ArrayList---------------");
          
        // printing purpose used for each loop
        for (String student : studentList) {
  
            System.out.println(student);
        }
  
        System.out.println(
            "--------------HashMap----------------");
         
        // convertArrayList ToHashMap() method directly 
        // arraylist to hashmap me convert ke liye used kiya gya hai 
        HashMap< Integer,String > studentMap = convertArrayListToHashMap(studentList);
  
        
         
       