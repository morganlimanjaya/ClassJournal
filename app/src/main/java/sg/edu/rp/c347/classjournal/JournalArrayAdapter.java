package sg.edu.rp.c347.classjournal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15017171 on 5/5/2017.
 */

public class JournalArrayAdapter extends ArrayAdapter<journal> {
    // Create ArrayList of objects
    private ArrayList<journal> objects;
    // To hold the context object
    private Context context;
    // Create the UI objects to hold the UI elements in row layout
    private TextView tv1;
    private TextView tv2;

    public JournalArrayAdapter(Context context, int resource,
                               ArrayList<journal> objects) {

        super(context, resource, objects);
        // Store the ArrayList of objects passed to this adapter
        this.objects = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }
    // getView() is called every time for every row

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //  Change R.layout.rowxyz if file is rowxyz.xml .
        View rowView = inflater.inflate(R.layout.row, parent,
                false);

        // Get the TextView object
        tv1 = (TextView) rowView.findViewById(R.id.textViewTitle);
        tv2 = (TextView) rowView.findViewById(R.id.textViewDG);

        // Parameter "pos" is the index of the
        //  row ListView is requesting.
        //  We get back the object at the same index.
        journal object = objects.get(pos);
        // Set the TextView to show the object info
        tv1.setText(object.getWeek());
        tv2.setText(object.getDg());
        // Return this row that is being populated.
        return rowView;
    }
}
