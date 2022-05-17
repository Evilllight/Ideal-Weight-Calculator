package serkan.com.idealkilohesaplama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txtIdealKilo,txtKilo;
    int idealkilo,kilo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtIdealKilo=(TextView)findViewById(R.id.textView2);
        txtKilo=(TextView)findViewById(R.id.textView3);

        Intent intent=getIntent();

        idealkilo=(int)intent.getDoubleExtra("ideal",idealkilo);
        kilo=intent.getIntExtra("kilo",kilo);


        txtIdealKilo.setText("İdeal Kilonuz"+String.valueOf(idealkilo));
        txtKilo.setText("Kilonuz"+String.valueOf(kilo));

    }
}
