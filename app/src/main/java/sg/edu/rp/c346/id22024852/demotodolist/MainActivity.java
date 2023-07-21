package sg.edu.rp.c346.id22024852.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<TodoItem> al;
    //ArrayAdapter<String> aa;
    CustomAdapter aa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listView);
        al = new ArrayList<>();

        Calendar date = Calendar.getInstance();
        date.set(2020,9,1);
        TodoItem item1 = new TodoItem("Go for Movie",date);
        Calendar date1 = Calendar.getInstance();
        date1.set(2020,9,2);
        TodoItem item2 = new TodoItem("Go for haircut",date1);
        al.add(item1);
        al.add(item2);



        // aa = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,al);
        aa = new CustomAdapter(this, R.layout.row, al);
        lv.setAdapter(aa);


    }
}