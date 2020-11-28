package com.sab.imageslider;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    RecyclerView imageSliderview;
    FloatingActionButton Left, Right;
    LinearLayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSliderview = findViewById(R.id.rv_imageSlider);
        Left = findViewById(R.id.imageView_left);
        Right = findViewById(R.id.imageView_right);


        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        Model[] sliderData = new Model[]{
                new Model(R.drawable.app_web_dev_logo, "Creative Developers\nInstagram: @app_and_web_developers\nFacebook: App_and_web_developers"),
                new Model(R.drawable.shiv, "Shiv Kumar Sah\nFreelance Android App Developer"),
                new Model(R.drawable.dream, "The dream house where everyone wants to be. Follow your dream and you will surely get it."),
                new Model(R.drawable.baby, "Good night by a baby and his doll. Just a dummy text to wrap it up"),
                new Model(R.drawable.alone, "Walking alone on the way with his dream. Just a dummy text to wrap it up. This needs to be a bit long. Now its okay "),
                new Model(R.drawable.bird, "Depicts the beauty of the nature. Just a dummy text to wrap it up")
        };

        Adapter adapter = new Adapter(sliderData);
        imageSliderview.setHasFixedSize(true);
        imageSliderview.setLayoutManager(mLayoutManager);
        imageSliderview.setAdapter(adapter);

        Left.setOnClickListener(view -> {
            int firstVisible = mLayoutManager.findFirstVisibleItemPosition() - 1;

            if (firstVisible <= adapter.getItemCount()) {
                mLayoutManager.scrollToPosition(firstVisible);
            }
        });
        Right.setOnClickListener(view -> {
            int lastVisible = mLayoutManager.findLastVisibleItemPosition() + 1;

            if (lastVisible <= adapter.getItemCount()) {
                mLayoutManager.scrollToPosition(lastVisible);
            }
        });
    }

    public void moveTo1(View view) {
        mLayoutManager.scrollToPosition(0);
        Toast.makeText(this, "Position Clicked: 1", Toast.LENGTH_SHORT).show();
    }

    public void moveTo2(View view) {
        mLayoutManager.scrollToPosition(1);
        Toast.makeText(this, "Position Clicked: 2", Toast.LENGTH_SHORT).show();
    }

    public void moveTo3(View view) {
        mLayoutManager.scrollToPosition(2);
        Toast.makeText(this, "Position Clicked: 3", Toast.LENGTH_SHORT).show();
    }

    public void moveTo4(View view) {
        mLayoutManager.scrollToPosition(3);
        Toast.makeText(this, "Position Clicked: 4", Toast.LENGTH_SHORT).show();
    }

    public void moveTo5(View view) {
        mLayoutManager.scrollToPosition(4);
        Toast.makeText(this, "Position Clicked: 5", Toast.LENGTH_SHORT).show();
    }

    public void moveTo6(View view) {
        mLayoutManager.scrollToPosition(5);
        Toast.makeText(this, "Position Clicked: 6", Toast.LENGTH_SHORT).show();
    }
}

