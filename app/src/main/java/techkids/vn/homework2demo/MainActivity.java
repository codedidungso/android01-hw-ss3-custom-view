package techkids.vn.homework2demo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private LinearLayout rlMain;
    private FloatingActionButton floatingActionButton;
    private ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rlMain = findViewById(R.id.ll_main);
        floatingActionButton = findViewById(R.id.fl);
        scrollView = findViewById(R.id.sv);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomImageView customImageView = new CustomImageView(MainActivity.this);
                customImageView.setLayoutParams(new ViewGroup.LayoutParams
                        (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                customImageView.setPadding(8, 8, 8, 8);
                customImageView.setCropToPadding(true);
                customImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

                int random = new Random().nextInt(5);
                switch (random) {
                    case 0:
                        customImageView.setImageResource(R.drawable.food_1);
                        break;
                    case 1:
                        customImageView.setImageResource(R.drawable.food_2);
                        break;
                    case 2:
                        customImageView.setImageResource(R.drawable.food_3);
                        break;
                    case 3:
                        customImageView.setImageResource(R.drawable.food_4);
                        break;
                    case 4:
                        customImageView.setImageResource(R.drawable.food_5);
                        break;
                }
                rlMain.addView(customImageView);
                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                });
            }
        });


    }
}
