import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class DataKey {
    private String name;
    private int id;

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DataKey [name=" + name + ", id=" + id + "]";
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        DataKey dataKey = (DataKey) o;
//        return id == dataKey.id &&
//                Objects.equals(name, dataKey.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, id);
//    }
}


public class HashCodeEquals {

    public static void main(String[] args) {
        Map<DataKey, Integer> hm = getAllData();

        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setName("Pankaj");
        System.out.println(dk.hashCode());

        Integer value = hm.get(dk);

        System.out.println(value);

    }

    private static Map<DataKey, Integer> getAllData() {
        Map<DataKey, Integer> hm = new HashMap<>();

        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setName("Pankaj");
        System.out.println(dk.hashCode());

        hm.put(dk, 10);

        return hm;
    }

}
