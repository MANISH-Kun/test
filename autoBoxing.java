
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class autoBoxing {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("rawr");
        al.add(null);
        al.add(true);
        al.add(28.453);
        al.add(new Student("goat", 2, 'm', null));
        System.out.println(al);

        ArrayList<String> name = new ArrayList<String>();
        name.add("manish");
        name.add("1");
        System.out.println(name);

        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        // hs.add("e");
        hs.add(2);
        hs.add(6);
        hs.add(1);
        hs.add(3);
        System.out.println(hs);


        HashMap hm = new HashMap<>();
        hm.put(12, "ground");
        hm.put(1, "ground");
        hm.put(65, "ground");
        hm.put(5, "ground");
        hm.put(70, "tth");
        System.out.println(hm);
        
        
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(12, "yoga");
        lhm.put(45,"jog");
        lhm.put(32, "good");
        lhm.put(65, "ground");
        lhm.put(5, "ground");
        lhm.put(70, "tth");
       


        lhm.putIfAbsent(12, "groo");
         System.out.println(lhm);
         lhm.remove(12);
         System.out.println(lhm);
         System.out.println(lhm.get(344));
       
         System.out.println(lhm.getOrDefault(3244, "nah not there"));
         
         System.out.println(lhm.containsKey(12));
         System.out.println(lhm.containsValue("ground"));
           lhm.clear();
         System.out.println(lhm);
         System.out.println(lhm.isEmpty());
         System.out.println(lhm.size());

        //  5-"Ab",68-"De",36-"EF",18-"HI",20-"AB",5-"BI"
        HashSet h = new HashSet<>();
        h.add(5);
        h.add(68);
        h.add(36);
        h.add(18);
        h.add(20);
        h.add(5);
        System.out.println("yoooo: "+h);

        HashMap hmm= new HashMap<>();
        hmm.put(5, "Ab");
        hmm.put(68, "De");
        hmm.put(36, "eF");
        hmm.put(18, "HF");
        hmm.put(20, "AB");
        hmm.put(5, "BI");
        System.out.println("yoooo: "+hmm);

        // for (Object a : al) {
        //     System.out.println(a);

            
        // }

        for(int i=0 ; i<al.size();i++){
            System.out.println("index"+i+" val: " +al.get(i));

        }
        // for(int i=0 ; i<h.size();i++){
        //     System.out.println("index"+i+" val: " +h.get());

        // }
        Iterator<Integer> it = al.iterator();

        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        
        
        // for(Object o : al){
        //    while(it.hasNext()){
        //     if(o.equals(True)){
        //             it.remove();        
        //             }
        //    }
        //    it.next();
                
                
             

        //     }
        //        System.out.println(" huuuh? "+o);
            
        }


    }

