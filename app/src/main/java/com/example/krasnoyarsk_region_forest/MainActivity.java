package com.example.krasnoyarsk_region_forest;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private ListView list;
    private String[] array;
    private ArrayAdapter<String> adapter;
    private DrawerLayout drawer;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.ListView);
        array = getResources().getStringArray(R.array.derevo_array);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, new ArrayList<String>(Arrays.asList(array)));list.setAdapter(adapter);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle (this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent intent = new Intent(MainActivity.this,Text_Content_Activity.class);
                startActivity(intent);


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        toolbar.setTitle(R.string.derevo);
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.id_derevo)
        {
            toolbar.setTitle(R.string.derevo);
            array = getResources().getStringArray(R.array.derevo_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        }
        else if
        (id == R.id.id_rastenia)
        {
            toolbar.setTitle(R.string.rastenia);
            array = getResources().getStringArray(R.array.rastenia_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        }
        else if
        (id == R.id.id_park)
        {
            toolbar.setTitle(R.string.park);
            array = getResources().getStringArray(R.array.park_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        }
        else if
        (id == R.id.id_uch)
        {
            toolbar.setTitle(R.string.uch);
            array = getResources().getStringArray(R.array.uch_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        }
        drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}