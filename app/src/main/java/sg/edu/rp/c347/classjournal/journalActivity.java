package sg.edu.rp.c347.classjournal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by 15017171 on 5/5/2017.
 */

public class journalActivity extends AppCompatActivity {

    ListView lvWeek;
    ArrayAdapter aa;
    ArrayList<journal> a1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class_journal_info);

        //connect to ui layout
        lvWeek = (ListView) findViewById(R.id.listView1);

        a1 = new ArrayList<>();
        a1.add(new journal("week 1", 'B'));
        a1.add(new journal("week 2", 'C'));
        a1.add(new journal("week 3", 'A'));

        // Create the ArrayAdapter object.
        JournalArrayAdapter adapter = new JournalArrayAdapter(this, R.layout.row, a1);
        ListView lv = (ListView) findViewById(R.id.listView1);
        lv.setAdapter(aa);

        //assign the arrayAdapter to listview
        


    }
}
