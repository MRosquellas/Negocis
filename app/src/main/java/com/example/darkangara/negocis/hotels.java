package com.example.darkangara.negocis;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.widget.ImageView;

public class hotels extends Activity implements View.OnClickListener {

  /*  private ImageView llamada1;
    private ImageView imgPaper;
    private ImageView imgTissora;
    private ImageView imgPedra2;
    private ImageView imgPaper2;
    private ImageView imgTissora2;
    private ImageView imgPedra;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
    }

    public void infoiris (View v)
    {
        Intent intent = new Intent ("android.intent.action.VIEW", Uri.parse("www.hoteliris.com/"));
        startActivity(intent);
    }
    public void infoatenea (View v)
    {
        Intent intent = new Intent ("android.intent.action.VIEW", Uri.parse("https://www.aparthotelateneavalles.com/es/"));
        startActivity(intent);
    }
    public void infofonda (View v)
    {
        Intent intent = new Intent ("android.intent.action.VIEW", Uri.parse("http://www.hotelfondaeuropa.com/"));
        startActivity(intent);
    }
    public void infohotelgran (View v)
    {
        Intent intent = new Intent ("android.intent.action.VIEW", Uri.parse("http://www.hotelgranollers.com/"));
        startActivity(intent);
    }
    public void infociutatgran (View v)
    {
        Intent intent = new Intent ("android.intent.action.VIEW", Uri.parse("http://www.hotelciutatgranollers.com/"));
        startActivity(intent);
    }
    public void infoibis (View v)
    {
        Intent intent = new Intent ("android.intent.action.VIEW", Uri.parse("http://www.ibis.com/es/hotel-5258-ibis-barcelona-montmelo-granollers/index.shtml"));
        startActivity(intent);
    }
    public void hotelh (View v)
    {
        Intent intent = new Intent ("android.intent.action.VIEW", Uri.parse("http://hotelh.es/"));
        startActivity(intent);
    }



    @Override
    public void onClick(View v) {

        switch (Integer.parseInt(v.getTag().toString()))
        {
            case 1: Intent intent = new Intent ("android.intent.action.VIEW",
                    Uri.parse("tel:938792929"));
                startActivity(intent);
                break;
            case 2:        Intent intent2 = new Intent ("android.intent.action.VIEW",
                    Uri.parse("tel:938794820"));
                startActivity(intent2);
                break;
            case 3:        Intent intent3 = new Intent ("android.intent.action.VIEW",
                    Uri.parse("tel:938700312"));
                startActivity(intent3);
                break;
            case 4:        Intent intent4 = new Intent ("android.intent.action.VIEW",
                    Uri.parse("tel:938795100"));
                startActivity(intent4);
                break;
            case 5:         Intent intent5 = new Intent ("android.intent.action.VIEW",
                    Uri.parse("tel:938796220"));
                startActivity(intent5);
                break;
            case 6:        Intent intent6 = new Intent ("android.intent.action.VIEW",
                    Uri.parse("tel:935689060"));
                startActivity(intent6);
                break;
            case 7:        Intent intent7 = new Intent ("android.intent.action.VIEW",
                    Uri.parse("tel:938606688"));
                startActivity(intent7);
                break;

        }
    }
}
