package temperocerto.sistema_tc;
import java.util.Date;

public class Order {
    byte size; // size = 1 small size order || size = 2 big size order
    Date date = new Date();
    String notes;

    public void addOrder(byte size, Date date, String notes){
        this.size = size;
        this.date = date;
        this.notes = notes;
    }
}
