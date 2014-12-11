package thenewboston.sandmarq.ca.thenewboston;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by sandrine on 2014-12-01.
 */
public class Menu extends ListActivity {

    String classes[] = {"StartingPoint", "TextPlay", "Email", "example3", "example4", "example5", "example6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String cheese = classes[position];
        Class ourClass = null;
        try {
            ourClass = Class.forName("thenewboston.sandmarq.ca.thenewboston." + cheese);
            Intent ourIntent = new Intent(Menu.this, ourClass);
            startActivity(ourIntent);
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
            Log.e("TAG", "Tried to open " + cheese);
        }

    }


}
