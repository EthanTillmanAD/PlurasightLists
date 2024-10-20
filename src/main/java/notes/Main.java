package notes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> x = new ArrayList<>();

        //list can store

        x.add("corona");
        x.add("Java");
        x.add("Python");
        x.add("C++");
        x.add("C#");

        String remove = "CoRonA";
        x.remove(remove.toLowerCase());




        for(String i : x){
            System.out.println(i);
        }

        System.out.println("This is the index of C++ -> " + x.indexOf("C++"));
    }

}
