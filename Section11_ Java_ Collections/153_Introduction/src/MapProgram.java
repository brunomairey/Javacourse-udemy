import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", " an object oriented language");
        languages.put("Python", "an interpreted high level progrramming language");
        languages.put("Algol", "algorythmique language");
        languages.put("Basic", "Beginners all purpose symbolis");
        languages.put("Lisp", "therein list madness");

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        }
        else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println(languages.get("Java"));
        languages.put("Java","this course is about Java");
        System.out.println(languages.get("Java"));

        System.out.println("===========================");
       // languages.remove("Lisp");
        if(languages.remove("Algol", "algorique language")){
            System.out.println("Algol removed");
        }else {
            System.out.println("Algol not removed, key/pair value pair not found");
        }
        System.out.println(languages.replace("Lisp", " a functionnal programming language with imperative features"));
        System.out.println(languages.replace("Scala", "this will not be executed"));
        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
