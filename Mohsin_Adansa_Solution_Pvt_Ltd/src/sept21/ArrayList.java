
package sept21;

import java.util.ArrayList;
import java.util.Collections;

class Compare { //classname will be same as filename

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(17);
        list1.add(16);
        Collections.sort(list1); //I dont't want any sorting in this task
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(16);
        list2.add(20);
        list2.add(19);
        list2.add(17);
        Collections.sort(list2);

        System.out.println(list2);
        
        for(int i=0;i<list1.length;i++) //for list or arraylist there is method called size to getting length
        {
            for(int j=0;j<list2.length;j++)
            {
                if
                     list1.get(i)==list2.get(j); //Object always compare by equals methods
                     break;
            }
            
               
        if(list1.equals(list2))
        {
        System.out.println(list1.equals(list2));
            System.out.println("false");
        }
        else if(list1==list2)
        {
            System.out.println("equalls");
        }
        else
        {
            System.out.println("not in list1 element in list2");
        }
        
        }
    }
}
}
