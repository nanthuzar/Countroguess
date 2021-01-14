package ait.com.nan.countroguest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button playbutton;
    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        TextView textView = (TextView) findViewById(R.id.textView);
        click = (Button) findViewById(R.id.clickme);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(Main2Activity.this,FetchDataAsync.class);
                startActivity(i2);
            }
        });

        textView.setText(getIntent().getStringExtra("Country"));
        imageView.setImageResource(getIntent().getIntExtra("Flag",R.drawable.afghanistan));

        playbutton = findViewById(R.id.button_play);
        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoquizactivity();
            }
        });
    }
    private void gotoquizactivity(){
        Intent i1 = new Intent(Main2Activity.this,QuizActivity.class);
        startActivity(i1);
    }
}
