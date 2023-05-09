package maps;
import java.util.HashMap;

public class maps_implement {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Java");
        map.put(2, "JavaScript");
        map.put(3, "Agile methodologies");
        System.out.println("Map: " + map);
    }
}