package sg.edu.rp.c347.classjournal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int requestCode1 = 1;

    TextView tvClass;

    ListView lvWeek;
    ArrayAdapter aa;
    ArrayList<journal>a1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvWeek = (ListView)findViewById(R.id.listView1);
        tvClass = (TextView)findViewById(R.id.textViewClass);

        a1 = new ArrayList<>();
        a1.add(new journal("week 1", 'B'));
        a1.add(new journal("week 2", 'C'));
        a1.add(new journal("week 3", 'A'));

        // Set listener to handle the clicking of Superman TextView
        tvClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {


                Intent i = new Intent(MainActivity.this,
                        journalActivity.class);

                // Start activity with requestCodeForSupermanStats to
                // identify it was started by clicking on Superman
                startActivityForResult(i, requestCode1);

            }
        });

    }
}
