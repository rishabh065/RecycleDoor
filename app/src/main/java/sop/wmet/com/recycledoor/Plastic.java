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

public class Plastic extends AppCompatActivity {
    String[] name = {
            "DILDAR PLASTIC",
            "SKY SCRAPERS",
            "Sri Banke Bihari Plastic Recyclers",
            "Jwala Plastic",
            "Green-O-Tech India"

    } ;String[] add = {
            "G-139,SECTOR -5\n" +
                    "DSIDC,BAWANA INDUSTRIAL AREA \n" +
                    "DELHI-110039\n",
            "E-196,SEC-2\n" +
                    "BAWANA INDL AREA \n" +
                    "DELHI-39\n",
            "Near Radha swami Satsang bhawan\n" +
                    "Ch Ramdev Marg, Marmurpur\n" +
                    "New Delhi, Delhi 110040\n",
            "Mangal Bazaar Rd\n" +
                    "Mundka, Delhi, 110041\n",
            "Raghu Nagar, Block A\n" +
                    "Raghu Nagar, Dabri\n" +
                    "New Delhi, Delhi 110045\n"

    } ;
    String[] num = {
            "0120-37538","0-92938-12762","0-98189-12399","0-93136-71713","0-78400-24848"

    } ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plastic);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        String id = intent.getStringExtra("CLICK");
        setTitle(id);
        GridView gridview = (GridView) findViewById(R.id.grid_plastic);
        assert gridview != null;
        gridview.setAdapter(new CompanyList(Plastic.this, name,add,num));

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
