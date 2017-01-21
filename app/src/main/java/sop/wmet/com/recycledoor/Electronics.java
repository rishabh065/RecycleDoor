package sop.wmet.com.recycledoor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Electronics extends AppCompatActivity {
    String[] name = {
            "E-Waste Recyclers",
            "OM SAI RAM COMMUNICATION"

    } ;String[] add = {
            "Okhla Phase I\n" +
                    "Okhla Industrial Area\n" +
                    "New Delhi, Delhi 110020\n",
            "PLOT NO-248\n" +
                    "POCKET-B, SECTOR-3, DSIIDC\n" +
                    "BAWANA INDL AREA , DELHI-39\n"

    } ;
    String[] num = {
            "0-99901-33388","96436-33043"


    } ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        String id = intent.getStringExtra("CLICK");
        setTitle(id);
        GridView gridview = (GridView) findViewById(R.id.grid_electronics);
        assert gridview != null;
        gridview.setAdapter(new CompanyList(Electronics.this, name,add,num));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

