package sg.edu.rp.c346.id20011280.practical2_zane;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    //DONE BY ZANE TAN 20011280 C346 (5 JUNE)

    TextView desc;
    TextView addr;
    TextView OH;
    TextView PH;
    TextView hyperlink;
    Button bckButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        desc = findViewById(R.id.Desc);
        addr = findViewById(R.id.Addr);
        OH = findViewById(R.id.oh);
        PH = findViewById(R.id.ph);
        hyperlink =findViewById(R.id.url);
        bckButton = findViewById(R.id.bck);

        Intent received = getIntent();

        registerForContextMenu(desc);
        registerForContextMenu(addr);
        registerForContextMenu(OH);
        registerForContextMenu(PH);
        registerForContextMenu(hyperlink);


        String description = received.getStringExtra("Description");
        String addre = received.getStringExtra("Address");
        String oph = received.getStringExtra("Opening Hours");
        int pph = received.getIntExtra("Contact",0);
        String HYPER = received.getStringExtra("URL");

        desc.setText("Description: " + description);
        addr.setText("Address: " + addre);
        OH.setText("Opening Hours: " + oph);
        PH.setText("Contact: " + pph);
        hyperlink.setText("For more information: " + HYPER);

        bckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });
        hyperlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intentURL = new Intent(Intent.ACTION_VIEW, Uri.parse(HYPER));
                startActivity(intentURL);
            }
        });






    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) // context menu makes the menu which entertains long click to display menu
    {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,1,1,"Enlarge size");
        menu.add(0,2,2,"Reduce size");

    }
    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        if(item.getItemId() == 1)
        {
            desc.setTextSize(18);
            addr.setTextSize(18);
            OH.setTextSize(18);
            PH.setTextSize(18);
            hyperlink.setTextSize(18);
        }
        else if(item.getItemId() == 2)
        {
            desc.setTextSize(14);
            addr.setTextSize(14);
            OH.setTextSize(14);
            PH.setTextSize(14);
            hyperlink.setTextSize(14);
        }
        return super.onContextItemSelected(item);
    }





}