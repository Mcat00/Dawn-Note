package kr.ac.cnu.computer.dawnnote;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class probability_tagnote_1 extends AppCompatActivity{

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.probability_tagnote_1);

        Button back = (Button) findViewById(R.id.probability_1_back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), Main.class);
                startActivity(intent);
            }
        });
    }

}
