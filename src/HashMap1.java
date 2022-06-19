import java.util.HashMap;

public class HashMap1 {

    public static void main(String[] args)
    {
        HashMap<String, Integer> empIds = new HashMap<>();

        //parameters passed to HashMap should be Java Wrapper classess and not primitive data types
        empIds.put("Milton",12345);
        empIds.put("Rodrigues",54321);
        empIds.put("Jerry",86753);
        System.out.println(empIds);
        System.out.println(empIds.get("Milton"));

        System.out.println(empIds.containsKey("Rodrigues"));
        //containsKey checks if the key is present in the HashMap, and returns the value
        //if not present, it returns the key.

        System.out.println(empIds.containsValue((12345)));

        empIds.put("Milton",645866);
        //if same value with a key is put, it will replace the value of previous key with the new one.
        System.out.println(empIds);
        System.out.println(empIds.replace("Kramer",777));


        //kramer doesnot exists, so it returns null
        System.out.println(empIds);

        empIds.putIfAbsent("Steve",222);
        System.out.println(empIds);




    }
}
