package AdvanceJava.Collections;

import java.util.Hashtable;
import java.util.Map;

public class CollectionMap {

    public static void main(String[] args) {

      Map<String , String> stu = new Hashtable<>();
      stu.put("Sohan", "Hanuman");
      stu.put("Swarnendu", "Shiva");
      stu.put("Anasua", "Krishna");
      System.out.println(stu);
      for (String string : stu.keySet()) {
        System.out.println(stu.get(string));
      }

    }
}
