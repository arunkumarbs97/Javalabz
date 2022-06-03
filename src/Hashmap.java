import java.util.*;
public class Hashmap {
    /***
     *Hash Map Demo
     * @param args
     * Adding, removing and updating elements in hashap
     */
    public static void main(String[]args)
    {

        HashMap<Integer, String>hash_map=new HashMap<Integer, String>();

        hash_map.put(1,"Arun");
        hash_map.put(2,"kumar");
        hash_map.put(3,"Hello");
        hash_map.put(4, "World");
        hash_map.put(5, "5");

        System.out.println("Hash map values are:"+hash_map);

        String updated_value=(String)hash_map.remove(28);
        System.out.println("The values are:"+updated_value);

        System.out.println("Updated map values are:"+hash_map);

        hash_map.put(3, "Raj");
        hash_map.put(4,"John");

        System.out.println("Final updated values are:"+hash_map);

    }
}
