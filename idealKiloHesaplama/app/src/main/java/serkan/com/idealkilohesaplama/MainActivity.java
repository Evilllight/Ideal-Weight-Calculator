package serkan.com.idealkilohesaplama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editBoy,editKilo;
    RadioButton rdbtnKiz,rdbtnErkek;
    int boy,kilo;
    double ideal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editBoy=(EditText)findViewById(R.id.editText3);
        editKilo=(EditText)findViewById(R.id.editText4);

        rdbtnKiz=(RadioButton)findViewById(R.id.radioButton);
        rdbtnErkek=(RadioButton)findViewById(R.id.radioButton2);

    }

    public void hesapla(View view){

        boy=Integer.valueOf(editBoy.getText().toString());
        kilo=Integer.valueOf(editKilo.getText().toString());

        if(rdbtnErkek.isChecked()) {

            ideal=Math.round(Double.valueOf(50+(2.3*(((boy)/2.53)-60))));

        }
        else
        {
            ideal=Math.round(Double.valueOf(45.5+(2.3*(((boy)/2.53)-60))));
        }

        Toast.makeText(this, String.valueOf(ideal), Toast.LENGTH_LONG).show();
        //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

        Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("ideal",ideal);
        intent.putExtra("kilo",kilo);
        startActivity(intent);
    }

}
