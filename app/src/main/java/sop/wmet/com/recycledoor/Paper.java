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

public class Paper extends AppCompatActivity {
    String[] name = {
            "GREENOBIN RECYCLING PRIVATE LIMITED",
            "JAAGRUTI Waste Paper Recycling Services",
            "Jwala Plastic",
            "Attero Recycling Pvt. Ltd."

    } ;String[] add = {
            "Shop No. 1 &2, Opp. State Bank of India\n" +
                    "Main Sohna Road, Badshapur\n" +
                    "Sector 48, Gurgaon - 122001\n",
            "F Block, Shopping Centre\n" + "Mayapuri Chowk Flyover, Mansarover Garden\n"+"New Delhi, Delhi 110015\n",
            "Mangal Bazaar Rd, Mundka\n"+" Delhi, 110041\n","173, Village Bhagwanpur\n" +
            "Raipur Industrial Area\n" +
            "Roorkee Distt. Haridwar\n" +
            "Uttarakhand\n"+"Noida Unit:\n" +
            "B-92 Sector 63 \n" +
            "Noida 201 301\n" +
            "Uttar Pradesh\n"

    } ;
    String[] num = {
            "+91-880055-7379","+91-981019-1625","93136-71713","120408-7100"

    } ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        String id = intent.getStringExtra("CLICK");
        setTitle(id);
        GridView gridview = (GridView) findViewById(R.id.grid_google);
        assert gridview != null;
        gridview.setAdapter(new CompanyList(Paper.this, name,add,num));

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

