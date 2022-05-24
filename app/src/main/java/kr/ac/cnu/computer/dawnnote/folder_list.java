package kr.ac.cnu.computer.dawnnote;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class folder_list extends AppCompatActivity{
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.folder_list);

        Button tag_switch = (Button) findViewById(R.id.folder_list_switch);
        tag_switch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), tag_list.class);
                startActivity(intent);
            }
        });

        ImageButton probability_folder = findViewById(R.id.probability_folder);
        probability_folder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), probability_list.class);
                startActivity(intent);
            }
        });

        ImageButton c_folder = findViewById(R.id.c_folder);
        c_folder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), c_list.class);
                startActivity(intent);
            }
        });

        ImageButton ds_folder = findViewById(R.id.ds_folder);
        ds_folder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), ds_list.class);
                startActivity(intent);
            }
        });

        ImageButton search = findViewById(R.id.floder_list_search);
        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), search_00.class);
                startActivity(intent);
            }
        });
    }
}
