package sg.edu.rp.c347.classjournal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by 15017171 on 5/5/2017.
 */

public class journalActivity extends AppCompatActivity{
    Button btnInfo;
    Button btnEmail;
    ListView lvWeek;
    ArrayAdapter aa;
    ArrayList<journal> a1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class_journal_info);

        lvWeek = (ListView)findViewById(R.id.listView1);
        btnInfo = (Button)findViewById(R.id.buttonInfo);
        btnEmail = (Button)findViewById(R.id.buttonEmail);
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent rpIntent = new Intent(Intent.ACTION_VIEW);
                //set the URL to be used
                rpIntent.setData(Uri.parse("http://www.rp.edu.sg/Diploma_in_Mobile_Software_Development_(R47).aspx"));
                startActivity(rpIntent);
            }
        });

        a1 = new ArrayList<>();
        a1.add(new journal("week 1", "B"));
        a1.add(new journal("week 2", "C"));
        a1.add(new journal("week 3", "A"));

        aa = new JournalArrayAdapter(this, R.layout.row, a1);
        lvWeek.setAdapter(aa);

        btnEmail.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // The action you want this intent to do;
                // ACTION_SEND is used to indicate sending text
                Intent email = new Intent(Intent.ACTION_SEND);
                // Put essentials like email address, subject & body text
                email.putExtra(Intent.EXTRA_EMAIL,
                        new String[]{"jason_lim@rp.edu.sg"});
                email.putExtra(Intent.EXTRA_TEXT,"Hi Faci,\n I am meow \n Please see my remarks so far, thank you! \n ");
                // This MIME type indicates email
                email.setType("message/rfc822");
                // createChooser shows user a list of app that can handle
                // this MIME type, which is, email
                startActivity(Intent.createChooser(email,
                        "Choose an Email client :"));

            }});


    }
}
