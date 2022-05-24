package kr.ac.cnu.computer.dawnnote;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ds_tagnote_56 extends AppCompatActivity{

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ds_tagnote_56);

        Button back = (Button) findViewById(R.id.ds_5_back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), tag_list.class);
                startActivity(intent);
                finish();
            }
        });
    }

}