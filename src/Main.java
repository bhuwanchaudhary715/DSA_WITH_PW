import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Main{

    public static void main(String[] args) {


        HashMap<String,Integer> m = new HashMap<String,Integer>();

        System.out.println(m);

        m.put("gfg",10);
        m.put("ide",15);
        m.put("Course",25);
        System.out.println(m);

        for(HashMap.Entry<String,Integer> e : m.entrySet()){

            System.out.println(e.getKey()+":"+e.getValue());
        }

        if(m.containsKey("gfg")){

            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        m.remove("gfg");
        System.out.println(m.size());

        System.out.println(m.get("Course"));
        System.out.println(m.get("id"));





    }
}