package com.example.krasnoyarsk_region_forest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Text_Content_Activity extends AppCompatActivity {
    private TextView text_content;
    private ImageView iContent;
    private int category = 0;
    private int position = 0;
    private int [] array_derevo = {R.string.derevo_1, R.string.derevo_2,R.string.derevo_3,R.string.derevo_4,R.string.derevo_5,R.string.derevo_6,R.string.derevo_7,R.string.derevo_8};
    private int [] array_rast = {R.string.rast_1, R.string.rast_2,R.string.rast_3,R.string.rast_4,R.string.rast_5,R.string.rast_6,R.string.rast_7,R.string.rast_8};
    private int [] array_park = {R.string.park_1, R.string.park_2,R.string.park_3,R.string.park_4,R.string.park_5,R.string.park_6,R.string.park_7};
    private int [] array_uch = {R.string.uch_1, R.string.uch_2,R.string.uch_3,R.string.uch_4,R.string.uch_5,R.string.uch_6};
    private int [] array_image_derevo = {R.drawable.sosna,R.drawable.list,R.drawable.bereza,R.drawable.klen,R.drawable.el,R.drawable.topol,R.drawable.iva,R.drawable.lipa }; //Сделать аналогично для Растений, Парков, Ученых
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_content);
        text_content = findViewById(R.id.text_main_content);
        iContent = findViewById(R.id.imageContent);
        reciveIntent();
    }

    private void reciveIntent() {
        Intent i =getIntent();
        if ( i != null);
        {
            category = i.getIntExtra("category",0);
            position = i.getIntExtra("position",0);
        }
        switch (category)
        {
            case 0:
                text_content.setText(array_derevo[position]);
                iContent.setImageResource(array_image_derevo[position]); //Сделать аналогично для Растений, Парков, Ученых
                break;
            case 1:
                text_content.setText(array_rast[position]);
                break;
            case 2:
                text_content.setText(array_park[position]);
                break;
            case 3:
                text_content.setText(array_uch[position]);
                break;
        }
    }




}
