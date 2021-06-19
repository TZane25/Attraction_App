package sg.edu.rp.c346.id20011280.practical2_zane;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //DONE BY ZANE TAN 20011280 C346 (5 JUNE)

    TextView attraction1;
    TextView attraction2;
    TextView attraction3;
    TextView attraction4;
    TextView attraction5;
    TextView attraction6;
    TextView attraction7;
    TextView attraction8;
    TextView attraction9;
    TextView attraction10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        attraction1 = findViewById(R.id.Atr1);
        attraction2 = findViewById(R.id.Atr2);
        attraction3 = findViewById(R.id.Atr3);
        attraction3 = findViewById(R.id.Atr3);
        attraction4 = findViewById(R.id.Atr4);
        attraction5 = findViewById(R.id.Atr5);
        attraction6 = findViewById(R.id.Atr6);
        attraction7 = findViewById(R.id.Atr7);
        attraction8 = findViewById(R.id.Atr8);
        attraction9 = findViewById(R.id.Atr9);
        attraction10 = findViewById(R.id.Atr10);

        attraction1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);
                i.putExtra("Description","National Gallery Singapore is a leading visual arts institution which oversees the world’s largest public collection of Singapore and Southeast Asian modern art. Situated at the birthplace of modern Singapore, in the heart of the Civic District, the Gallery is housed in two national monuments - City Hall and former Supreme Court - that have been beautifully restored and transformed into this exciting 64,000-square-metre venue");
                i.putExtra("Address","1 St Andrew’s Rd, Singapore 178957");
                i.putExtra("Opening Hours","10am to 7pm");
                i.putExtra("Contact",62717000);
                i.putExtra("URL","https://www.nationalgallery.sg");

                startActivity(i);



            }
        });
        attraction2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);
                i.putExtra("Description","With 21 gallery spaces spanning nearly 5,000 metre volume , we have held large-scale exhibitions by some of the world’s best known artists including Leonardo da Vinci, Salvador Dalí, Andy Warhol, Vincent Van Gogh and M.C. Escher since opening in February 2011");
                i.putExtra("Address","6 Bayfront Ave , Singapore 018974");
                i.putExtra("Opening Hours","10am to 7pm");
                i.putExtra("Contact",66888888);
                i.putExtra("URL","https://www.marinabaysands.com/museum/artscience-friends-order.html");

                startActivity(i);



            }
        });
        attraction3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra("Description","Universal Studios Singapore is a theme park located within Resorts World Sentosa on Sentosa Island, Singapore. It features 28 rides, shows, and attractions in seven themed zones.");
                i.putExtra("Address","8 Sentosa Gateway, 098269");
                i.putExtra("Opening Hours","12 to 7pm");
                i.putExtra("Contact",65778888);
                i.putExtra("URL","https://www.rwsentosa.com/en/attractions/universal-studios-singapore/explore");

                startActivity(i);



            }
        });
        attraction4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra("Description"," Aquatic amusement park with an aquarium, waterslides, a wave pool, tubing, snorkeling & more.");
                i.putExtra("Address","8 Sentosa Gateway, 098269");
                i.putExtra("Opening Hours","10am to 5pm");
                i.putExtra("Contact",65778888);
                i.putExtra("URL","https://www.rwsentosa.com/en/attractions/adventure-cove-waterpark/explore");

                startActivity(i);




            }
        });
        attraction5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra("Description","The idea of a national garden in Singapore started in 1822 when Sir Stamford Raffles, the founder of modern Singapore and a keen naturalist, developed the first ‘Botanical and Experimental Garden’ at Fort Canning.");
                i.putExtra("Address","1 Cluny Road");
                i.putExtra("Opening Hours","24 Hours");
                i.putExtra("Contact",0);
                i.putExtra("URL","https://www.nparks.gov.sg/sbg");

                startActivity(i);




            }
        });
        attraction6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra("Description","Located on a hill in Pasir Panjang, Haw Par Villa was once known as Tiger Balm Gardens...");
                i.putExtra("Address","262 Pasir Panjang Rd, Singapore 118628");
                i.putExtra("Opening Hours","24 hours");
                i.putExtra("Contact",67730103);
                i.putExtra("URL"," https://www.hawparvilla.sg");

                startActivity(i);



            }
        });
        attraction7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra("Description","Esplanade is Singapore's national performing arts centre and one of the busiest arts centres in the world. Since its opening in 2002");
                i.putExtra("Address","1 Esplanade Drive Singapore, 038981");
                i.putExtra("Opening Hours","12pm to 6pm");
                i.putExtra("Contact",68288377);
                i.putExtra("URL","https://www.esplanade.com");

                startActivity(i);



            }
        });
        attraction8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra("Description","Wild Wild Wet is one of Singapore's largest water parks that promises a day of thrills and spills for the whole family. ");
                i.putExtra("Address","1 Pasir Ris Cl, Singapore 519599");
                i.putExtra("Opening Hours","12pm to 6pm");
                i.putExtra("Contact",67730103);
                i.putExtra("URL","https://www.wildwildwet.com");

                startActivity(i);



            }
        });
        attraction9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra("Description","Set in a rainforest environment, Singapore Zoo is renowned for its open concept, which offers visitors from around the world the opportunity to be inspired by the wonders of nature and wildlife.");
                i.putExtra("Address","80 Mandai Lake Rd, 729826");
                i.putExtra("Opening Hours","8.30am to 6pm");
                i.putExtra("Contact",62693411);
                i.putExtra("URL","https://www.wrs.com.sg/en/singapore-zoo.html");

                startActivity(i);



            }
        });
        attraction10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra("Description","The Night Safari is the world's first night zoo that allows visitors to observe nocturnal animals in a natural habitat. Designed to be experienced at night");
                i.putExtra("Address","80 Mandai Lake Rd, 729826");
                i.putExtra("Opening Hours",": 6.30pm to 12am");
                i.putExtra("Contact",62693411);
                i.putExtra("URL","https://www.wrs.com.sg/en/night-safari.html");

                startActivity(i);



            }
        });




























    }
}