package temperocerto.sistema_tc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main extends AppCompatActivity {

    float static small = 10;
    float static big = 12;
    float static total = 0;
    float static cost = 0;
    float static profit = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperocerto_main);
    }

    public void addProfit(byte size, float small, float big, float total){
        if(size == 1){ //count small size order
            this.total += small;
        }
        if(size == 2){ //count big size order
            this.total += big;
        }
    }
    
    public void calculateProfit(float cost, float total){
            profit = total - cost;
        }

}
