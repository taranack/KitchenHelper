package com.lexmat.kitchenhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, RecipeActivity.class);
        startActivity(intent);
    }

    protected void onRestart(){
        super.onRestart();
        Intent intent = new Intent(this, RecipeActivity.class);
        startActivity(intent);
    }
}
