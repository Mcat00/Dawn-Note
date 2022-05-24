package kr.ac.cnu.computer.dawnnote;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class probability_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.probability_list);

        Button tag_switch = (Button) findViewById(R.id.probability_list_switch);
        tag_switch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), tag_list.class);
                startActivity(intent);
            }
        });

        ImageButton search = findViewById(R.id.probability_list_search);
        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), search_00.class);
                startActivity(intent);
            }
        });

        ImageButton back = findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), folder_list.class);
                startActivity(intent);
            }
        });

        ImageButton note_probability_01 = findViewById(R.id.note_probability_01);
        note_probability_01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), probability01.class);
                startActivity(intent);
            }
        });

        ImageButton note_probability_02 = findViewById(R.id.note_probability_02);
        note_probability_02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), probability02.class);
                startActivity(intent);
            }
        });

        ImageButton note_probability_03 = findViewById(R.id.note_probability_03);
        note_probability_03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), probability03.class);
                startActivity(intent);
            }
        });
    }
}
