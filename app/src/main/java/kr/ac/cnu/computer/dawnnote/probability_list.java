package kr.ac.cnu.computer.dawnnote;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.animation.ObjectAnimator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class probability_list extends AppCompatActivity {
    // 플로팅버튼 상태
    private boolean fabMain_status = false;

    private FloatingActionButton fabMain;
    private FloatingActionButton fabnote;
    private FloatingActionButton fabfloder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.probability_list);

        fabMain = findViewById(R.id.imageButton2);
        fabnote = findViewById(R.id.note);
        fabfloder = findViewById(R.id.folder);

        Button tag_switch = (Button) findViewById(R.id.probability_list_switch);
        tag_switch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), tag_list.class);
                startActivity(intent);
                overridePendingTransition(0,0);
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

        // 플러스 플로팅 버튼 클릭
        fabMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleFab();

            }
        });
        // 폴더 플로팅 버튼 클릭
        fabnote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        // 노트 플로팅 버튼 클릭
        fabfloder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    // 플로팅 액션 버튼 클릭시 애니메이션 효과
    public void toggleFab() {
        if(fabMain_status) {
            // 플로팅 액션 버튼 닫기
            ObjectAnimator fc_animation = ObjectAnimator.ofFloat(fabnote, "translationY", 0f);
            fc_animation.start();
            ObjectAnimator fe_animation = ObjectAnimator.ofFloat(fabfloder, "translationY", 0f);
            fe_animation.start();

        }else {
            // 플로팅 액션 버튼 열기
            ObjectAnimator fc_animation = ObjectAnimator.ofFloat(fabnote, "translationY", -100f);
            fc_animation.start();
            ObjectAnimator fe_animation = ObjectAnimator.ofFloat(fabfloder, "translationY", -200f);
            fe_animation.start();
        }
        // 플로팅 버튼 상태 변경
        fabMain_status = !fabMain_status;
    }
}
