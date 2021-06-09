package com.example.redox.quizzapppro;


import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class OptionsActivity extends AppCompatActivity {

    OptionsActivityModel model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        model = ViewModelProviders.of(this).get(OptionsActivityModel.class);


        /*
        define buttons
         */

        all_questions = findViewById(R.id.all_questions_button);
        sports_questions = findViewById(R.id.sports_questions_button);
        physics_questions = findViewById(R.id.physics_questions_button);
        history_questions = findViewById(R.id.history_questions_button);
        cinema_questions = findViewById(R.id.cinema_questions_button);
        geography_questions = findViewById(R.id.geography_questions_button);
        general_culture_questions = findViewById(R.id.general_culture_questions_button);


        level_ez_button = findViewById(R.id.level_ez_button);
        level_mid_button = findViewById(R.id.level_mid_button);
        level_hard_button = findViewById(R.id.level_hard_button);


        cheat_switch = findViewById(R.id.cheat_switch);
        cheat_spinner = findViewById(R.id.number_cheats_spinner);
        Integer[] items = new Integer[]{1, 2, 3, 4};
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, items);
        cheat_spinner.setAdapter(adapter);


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

}