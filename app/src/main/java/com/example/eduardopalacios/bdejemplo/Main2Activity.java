package com.example.eduardopalacios.bdejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Toolbar toolbar;
    SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem searchItem=menu.findItem(R.id.action_search);

        searchView=(SearchView)searchItem.getActionView();
        searchView.setQueryHint("text");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {



                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {


                return false;
            }
        });
        return true;
    }
}
