package com.example.krasnoyarsk_region_forest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Text_Content_Activity extends AppCompatActivity {
    private TextView text_content;
    private TextView text_naz;
    private TextView text_otdel;
    private TextView text_sem;
    private ImageView iContent;
    private int category = 0;
    private int position = 0;

    private int [] array_derevo = {R.string.derevo_1, R.string.derevo_2,R.string.derevo_3,R.string.derevo_4,R.string.derevo_5,R.string.derevo_6,R.string.derevo_7,R.string.derevo_8};
    private int [] derevo_naz_array = {R.string.Nazderevo1, R.string.Nazderevo2, R.string.Nazderevo3, R.string.Nazderevo4, R.string.Nazderevo5,R.string.Nazderevo6, R.string.Nazderevo7, R.string.Nazderevo8 };
    private int [] Otdelderevo_array = {R.string.Otdelderevo1, R.string.Otdelderevo2, R.string.Otdelderevo3, R.string.Otdelderevo4, R.string.Otdelderevo5,R.string.Otdelderevo6, R.string.Otdelderevo7, R.string.Otdelderevo8 };
    private int [] Nazseme_array = {R.string.Nazseme1, R.string.Nazseme2, R.string.Nazseme3, R.string.Nazseme4, R.string.Nazseme5,R.string.Nazseme6, R.string.Nazseme7, R.string.Nazseme8 };
    private int [] array_image_derevo = {R.drawable.sosna,R.drawable.list,R.drawable.bereza,R.drawable.klen,R.drawable.el,R.drawable.topol,R.drawable.iva,R.drawable.lipa };


    private int [] array_rast = {R.string.rast_1, R.string.rast_2};
    private int [] rastenia_Naz_array = {R.string.rast1, R.string.rast2};
    private int [] Otdelrasten_array = {R.string.Otdelrast1, R.string.Otdelrast2};
    private int [] Nazsemerast_array = {R.string.Nazsemerast1, R.string.Nazsemerast2};
    private int [] array_image_rast = {R.drawable.odevan, R.drawable.pizhma};



    private int [] array_park = {R.string.park_1, R.string.park_2};
    private int [] park_Naz_array = {R.string.park1, R.string.park1};
    private int [] ploshad_array = {R.string.ploshad_array1, R.string.ploshad_array2};
    private int [] data_array = {R.string.data_array1, R.string.data_array2};
    private int [] array_image_park = {R.drawable.ergaki, R.drawable.bolshoi_arkticheskiy_zapovednik};


    private int [] array_uch = {R.string.uch_1, R.string.uch_2};
    private int [] uch_Naz_array = {R.string.uch_Naz_array1, R.string.uch_Naz_array2};
    private int [] dataroh_array = {R.string.dataroh_array1, R.string.dataroh_array2};
    private int [] oblast_array = {R.string.oblast_array1, R.string.oblast_array2};
    private int [] array_image_uch = {R.drawable.begichev, R.drawable.biron};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_content);
        text_content = findViewById(R.id.text_main_content);
        text_naz = findViewById(R.id.Nazderevo1);
        text_otdel = findViewById(R.id.Otdelderevo1);
        text_sem = findViewById(R.id.Nazseme1);
        iContent = findViewById(R.id.imageContent);
        receiveIntent();
    }

    private void receiveIntent() {
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
                text_naz.setText(derevo_naz_array[position]);
                text_otdel.setText(Otdelderevo_array[position]);
                text_sem.setText(Nazseme_array[position]);
                iContent.setImageResource(array_image_derevo[position]);
                break;
            case 1:
                text_content.setText(array_rast[position]);
                text_naz.setText(rastenia_Naz_array[position]);
                text_otdel.setText(Otdelrasten_array[position]);
                text_sem.setText(Nazsemerast_array[position]);
                iContent.setImageResource(array_image_rast[position]);
                break;
            case 2:
                text_content.setText(array_park[position]);
                text_naz.setText(park_Naz_array[position]);
                text_otdel.setText(ploshad_array[position]);
                text_sem.setText(data_array[position]);
                iContent.setImageResource(array_image_park[position]);
                break;
            case 3:
                text_content.setText(array_uch[position]);
                text_naz.setText(uch_Naz_array[position]);
                text_otdel.setText(dataroh_array[position]);
                text_sem.setText(oblast_array[position]);
                iContent.setImageResource(array_image_uch[position]);
                break;
        }
    }




}
