package msg.com.tstaction;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.fafaldo.fabtoolbar.widget.FABToolbarLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private FABToolbarLayout layout;
    private View three, four;
    TextView itemsTitle,itemsCount;

    private View fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (FABToolbarLayout) findViewById(R.id.fabtoolbar);

        three = findViewById(R.id.three);
        four = findViewById(R.id.four);

        itemsTitle=(TextView)findViewById(R.id.itemstitle);
        itemsCount=(TextView)findViewById(R.id.itemstitle1);


        fab = findViewById(R.id.fabtoolbar_fab);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),"quickbold.otf");
        itemsTitle.setTypeface(custom_font);
        itemsCount.setTypeface(custom_font);


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              // order checkout here
              // put the order bundle here, and intent for the next activity

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.hide();
            }
        });



        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        layout.hide();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Element clicked", Toast.LENGTH_SHORT).show();
    }
}


