package sop.wmet.com.recycledoor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView grid;
    Intent intent;
    String[] web = {
                "Paper",
                "Plastic",
                "Electronics",
                "Electrical",
                "Computer Peripherals",
                "Landline Phones",
                "Cellphones",
                "Desktops",
                "Printers",
                "Refrigerators",
                "Metal",
                "Wood",
                "Tiles",
                "About Us"
    } ;
    int[] imageId = {
            R.drawable.paper,
            R.drawable.plastic,R.drawable.electrical,R.drawable.electronics,R.drawable.computer,R.drawable.landline,
            R.drawable.cellphone,R.drawable.desktop,R.drawable.printer,R.drawable.fridge,R.drawable.metal,
            R.drawable.wood,R.drawable.tile,R.drawable.aboutus


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Recycle Door");


        GridView gridview = (GridView) findViewById(R.id.grid);
        assert gridview != null;
        gridview.setAdapter(new CustomGrid(MainActivity.this, web, imageId));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " + web[position], Toast.LENGTH_SHORT).show();
                if(web[position].equals("Paper")) {
                    intent = new Intent(MainActivity.this, Paper.class);
                }
                if(web[position].equals("Plastic"))
                {
                    intent = new Intent(MainActivity.this, Plastic.class);
                }
                if(web[position].equals("Electronics")) {
                    intent = new Intent(MainActivity.this, Electronics.class);
                }
                if(web[position].equals("Electrical")) {
                    intent = new Intent(MainActivity.this, Electrical.class);
                }
                if(web[position].equals("Computer Peripherals")) {
                    intent = new Intent(MainActivity.this, ComputerPeripherals.class);
                }
                if(web[position].equals("Landline Phones")) {
                    intent = new Intent(MainActivity.this, LandlinePhones.class);
                }
                if(web[position].equals("Cellphones")) {
                    intent = new Intent(MainActivity.this, Cellphones.class);
                }
                if(web[position].equals("Desktops")) {
                    intent = new Intent(MainActivity.this, Desktops.class);
                }
                if(web[position].equals("Printers")) {
                    intent = new Intent(MainActivity.this, Printers.class);
                }
                if(web[position].equals("Refrigerators")) {
                    intent = new Intent(MainActivity.this, Refrigerators.class);
                }
                if(web[position].equals("Metal")) {
                    intent = new Intent(MainActivity.this, Metal.class);
                }
                if(web[position].equals("Wood")) {
                    intent = new Intent(MainActivity.this, Wood.class);
                }
                if(web[position].equals("Tiles")) {
                    intent = new Intent(MainActivity.this, Tiles.class);
                }
                if(web[position].equals("About Us")) {
                    intent = new Intent(MainActivity.this, AboutUs.class);
                }
                intent.putExtra("CLICK",web[position]);
                startActivity(intent);
            }
        });

    }

}
