package sg.edu.rp.c347.classjournal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by 15017171 on 5/5/2017.
 */

public class journalActivity extends AppCompatActivity{

    ListView lvWeek;
    ArrayAdapter aa;
    ArrayList<journal> a1;
    Button btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class_journal_info);

        lvWeek = (ListView)findViewById(R.id.listView1);
        btnEmail = (Button)findViewById(R.id.buttonEmail);

        a1 = new ArrayList<>();
        a1.add(new journal("week 1", 'B'));
        a1.add(new journal("week 2", 'C'));
        a1.add(new journal("week 3", 'A'));

    }
}
