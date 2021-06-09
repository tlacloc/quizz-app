package com.example.redox.quizzapppro;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity {


    public static String ALL_QUESTIONS_STATE = "ALL_QUESTIONS_STATE";
    public static String SPORT_QUESTIONS_STATE = "SPORT_QUESTIONS_STATE";
    public static String PHYSICS_QUESTIONS_STATE = "PHYSICS_QUESTIONS_STATE";
    public static String HISTORY_QUESTIONS_STATE = "HISTORY_QUESTIONS_STATE";
    public static String CINEMA_QUESTIONS_STATE = "CINEMA_QUESTIONS_STATE";
    public static String GEOGRAPHY_QUESTIONS_STATE = "GEOGRAPHY_QUESTIONS_STATE";
    public static String GENERAL_CULTURE_QUESTIONS_STATE = "GENERAL_CULTURE_QUESTIONS_STATE";
    public static String DIFFICULTY_STATE = "DIFFICULTY_STATE";
    public static String CHEATS_STATE = "CHEATS_STATE";
    public static String NUMBER_OF_QUESTIONS_STATE = "NUMBER_OF_QUESTIONS_STATE";

    private Button previous_button;
    private Button next_button;
    private Button true_button;
    private Button false_button;
    private Button cheat_button;
    private TextView question_text;


    private boolean all_questions;
    private boolean sport_questions;
    private boolean physics_questions;
    private boolean history_questions;
    private boolean cinema_questions;
    private boolean geography_questions;
    private boolean general_culture_questions;

    int difficulty;
    int number_of_questions;
    int number_of_cheats;


    QuestionActivityModel model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        model = ViewModelProviders.of(this).get(QuestionActivityModel.class);
        model.loadGameQuestions();


        /*
        Buttons
         */

        cheat_button = findViewById(R.id.cheat_button);

        previous_button = findViewById(R.id.prev_button);
        next_button = findViewById(R.id.next_button);

        true_button = findViewById(R.id.true_button);
        false_button = findViewById(R.id.false_button);

        question_text = findViewById(R.id.question_text);



        cheat_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cheated(v);
            }
        });

        Bundle extras = getIntent().getExtras();
        if (extras != null){

        boolean get_all_questions = extras.getBoolean(ALL_QUESTIONS_STATE);
        all_questions = get_all_questions;

        boolean get_sport_questions = extras.getBoolean(SPORT_QUESTIONS_STATE);
        sport_questions = get_sport_questions;

        boolean get_physics_questions = extras.getBoolean(PHYSICS_QUESTIONS_STATE);
        physics_questions = get_physics_questions;

        boolean get_history_questions = extras.getBoolean(HISTORY_QUESTIONS_STATE);
        history_questions = get_history_questions;

        boolean get_cinema_questions = extras.getBoolean(CINEMA_QUESTIONS_STATE);
        cinema_questions = get_cinema_questions;

        boolean get_geography_questions = extras.getBoolean(GEOGRAPHY_QUESTIONS_STATE);
        geography_questions=get_geography_questions;

        boolean get_general_culture_questions = extras.getBoolean(GENERAL_CULTURE_QUESTIONS_STATE);
        general_culture_questions = get_general_culture_questions;



        int get_difficulty = extras.getInt(DIFFICULTY_STATE);
        difficulty = get_difficulty;

        int get_number_of_questions = extras.getInt(NUMBER_OF_QUESTIONS_STATE);
        number_of_cheats = get_number_of_questions;

        int get_number_of_cheats = extras.getInt(NUMBER_OF_QUESTIONS_STATE);
        number_of_cheats = get_number_of_cheats;

        }


        if (all_questions){
            question_text.setText("tru");
        }


        ;



    }

    public void cheated(View view){
        Intent intent = new Intent(this, CheatActivity.class);
        startActivity(intent);
    }
}