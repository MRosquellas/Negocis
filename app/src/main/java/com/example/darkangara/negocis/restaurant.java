package com.example.darkangara.negocis;

        import android.content.Intent;
        import android.net.Uri;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ImageView;
        import android.widget.LinearLayout;
        import android.widget.Spinner;

        import java.util.EventListener;

public class restaurant extends AppCompatActivity implements View.OnClickListener{

    public ImageView www1it, gmap1it, www1ent;
    public LinearLayout italia, japones, entrepans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        italia = (LinearLayout) findViewById(R.id.italia);
        japones = (LinearLayout) findViewById(R.id.japones);
        entrepans = (LinearLayout) findViewById(R.id.entrepans);

        www1it = (ImageView) findViewById(R.id.www1it);
        www1it.setOnClickListener(this);
        gmap1it = (ImageView) findViewById(R.id.gmap1it);
        gmap1it.setOnClickListener(this);
        www1ent = (ImageView) findViewById(R.id.www1ent);
        www1ent.setOnClickListener(this);

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1: italia.setVisibility(View.VISIBLE); japones.setVisibility(View.INVISIBLE); entrepans.setVisibility(View.INVISIBLE);
                        break;
                    case 2: italia.setVisibility(View.INVISIBLE); japones
                            .setVisibility(View.VISIBLE); entrepans.setVisibility(View.INVISIBLE);
                        break;
                    case 3: italia.setVisibility(View.INVISIBLE); japones.setVisibility(View.INVISIBLE); entrepans.setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
     }

    public void onClick(View v)
    {

        switch (v.getId())
        {
            case R.id.www1it: Uri uriUrl = Uri.parse("https://www.latagliatella.es/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);
                break;
            case R.id.gmap1it:Uri uritlf = Uri.parse("tel: +34112");
                Intent intentlf = new Intent(Intent.ACTION_VIEW, uritlf);
                startActivity(intentlf);
                break;
            case R.id.www1ent: Uri uriUrlent = Uri.parse("http://www.viena.es/es/");
                Intent intentent = new Intent(Intent.ACTION_VIEW, uriUrlent);
                startActivity(intentent);
                break;
        }
    }
}
