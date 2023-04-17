import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
    List<Laptop> list = new ArrayList<>();

    public DataBase addLaptop(Laptop laptop) {
        list.add(laptop);
        return this;
    }

    public List<Laptop> getList() {
        return list;
    }


    public Laptop chooseLaptop(String string) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getId().equals(string)) {
                return getList().get(i);
            }
        }
        return null;
    }
}
//        if (getList().get(i).getName().equals(string)){
//            return getList().get(i);
//        return this;
//
//    }
//
//    public Laptop ChooseLaptop(String string){
//        for (var item:getDb().entrySet()) {
//            if (getDb().get(item).equals(string)) {
//                return item.getValue();
//            }
//        };
//        return null;
//    }

