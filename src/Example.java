import java.util.*;

public class Example {
   private String names;

   public void returnNames(String names){
       HashMap<Integer, String> result = new HashMap<>();
       String[] namesRes = names.split("\\s+");
       for (int i = 0; i < namesRes.length; i ++){
           if (i % 2 != 0){
               result.put(i,namesRes[i]);
           }
       }
       System.out.println(result);
    }
    public void returnNumbers(String[] numbers){
        ArrayList<String> res = new ArrayList<>();
        for (String number:numbers) {
            res.add(number);
            Collections.sort(res);
        }
        System.out.println(res.toString());
    }
}


