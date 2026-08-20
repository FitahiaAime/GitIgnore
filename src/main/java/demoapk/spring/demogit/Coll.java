package demoapk.spring.demogit;

import java.util.ArrayList;
import java.util.List;

public class Coll {
    private List<String> list = new ArrayList<>();

    public void add(String s) { list.add(s); }
    public void remove(String s) { list.remove(s); }
    public List<String> get() { return list; }
    public int size() { return list.size(); }
}
