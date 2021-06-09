package com.example.redox.quizzapppro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

<<<<<<< HEAD
=======
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

>>>>>>> c4de45d950f221d39d5926d8e3f81ec7732bd476
    /*
    some variables
    */

    private String allQuestions = "all_questions";
    private String sportsQuestions = "sport_questions";
    private String physicsQuestions = "physics_questions";
    private String historyQuestions = "history_questions";
    private String cinemaQuestions = "cinema_questions";
    private String geographyQuestions = "geography_questions";
    private String generalcultureQuestions = "general_culture_questions";
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            boolean get_all_questions = extras.getBoolean(ALL_QUESTIONS_STATE);
            set_question(allQuestions, get_all_questions);

            boolean get_sport_questions = extras.getBoolean(SPORT_QUESTIONS_STATE);
            set_question(sportsQuestions, get_all_questions);

            boolean get_physics_questions = extras.getBoolean(PHYSICS_QUESTIONS_STATE);
            set_question(physicsQuestions, get_physics_questions);

            boolean get_history_questions = extras.getBoolean(HISTORY_QUESTIONS_STATE);
            set_question(historyQuestions, get_history_questions);

            boolean get_cinema_questions = extras.getBoolean(CINEMA_QUESTIONS_STATE);
            set_question(cinemaQuestions, get_cinema_questions);

            boolean get_geography_questions = extras.getBoolean(GEOGRAPHY_QUESTIONS_STATE);
            set_question(geographyQuestions, get_geography_questions);

            boolean get_general_culture_questions = extras.getBoolean(GENERAL_CULTURE_QUESTIONS_STATE);
            set_question(generalcultureQuestions, get_general_culture_questions);

            int get_difficulty = extras.getInt(DIFFICULTY_STATE);
            set_difficulty(get_difficulty);

            int get_number_of_questions = extras.getInt(NUMBER_OF_QUESTIONS_STATE);
            set_number_of_questions(get_number_of_questions);

            int get_number_of_cheats = extras.getInt(CHEATS_STATE);
            set_number_of_cheats(get_number_of_cheats);
        }
        else{

            set_difficulty(1);
            set_number_of_cheats(0);
            setAll_questions(true);

        }


            Button option_button = findViewById(R.id.option_button);
            Button start_button = findViewById(R.id.start_button);


            option_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openOptions(v);
                }
            });
            start_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startGame(v);
                }
            });



            if () {

            }

        }


    public void openOptions (View view){
        Intent intent = new Intent(this, OptionsActivity.class);
        startActivity(intent);
    }

    public void startGame (View view){
        Intent intent = new Intent(this, QuestionActivity.class);
        startActivity(intent);
    }
    public void set_number_of_questions(int number) {

        Intent intent = new Intent(getApplicationContext(), QuestionActivity.class);
        intent.putExtra(NUMBER_OF_QUESTIONS_STATE, number);
    }

    public void set_difficulty(int harness) {

        Intent intent = new Intent(getApplicationContext(), QuestionActivity.class);
        intent.putExtra(DIFFICULTY_STATE, harness);
    }

    public void set_number_of_cheats(int cheats) {
        Intent intent = new Intent(getApplicationContext(), QuestionActivity.class);
        intent.putExtra(NUMBER_OF_QUESTIONS_STATE, cheats);
    }
    public void setAll_questions(boolean state) {

        set_question(sportsQuestions, state);
        set_question(physicsQuestions, state);
        set_question(historyQuestions, state);
        set_question(cinemaQuestions, state);
        set_question(geographyQuestions, state);
        set_question(generalcultureQuestions, state);
    }

    public void set_question(String name, boolean state) {
        switch (name) {
            case "all_questions":
                if (state) {
                    Intent all_questions_intent = new Intent(getApplicationContext(), QuestionActivity.class);
                    all_questions_intent.putExtra(QuestionActivity.ALL_QUESTIONS_STATE, true);
                } else {
                    Intent all_questions_intent = new Intent(getApplicationContext(), QuestionActivity.class);
                    all_questions_intent.putExtra(QuestionActivity.ALL_QUESTIONS_STATE, false);
                }
                break;
            case "sport_questions":
                if (state) {
                    Intent sports_questions_intent = new Intent(getApplicationContext(), QuestionActivity.class);
                    sports_questions_intent.putExtra(QuestionActivity.SPORT_QUESTIONS_STATE, true);
                } else {
                    Intent sports_questions_intent = new Intent(getApplicationContext(), QuestionActivity.class);
                    sports_questions_intent.putExtra(QuestionActivity.SPORT_QUESTIONS_STATE, false);
                }
                break;
            case "physics_questions":
                if (state) {
                    Intent physics_questions_intent = new Intent(getApplicationContext(), QuestionActivity.class);
                    physics_questions_intent.putExtra(QuestionActivity.PHYSICS_QUESTIONS_STATE, true);
                } else {
                    Intent physics_questions_intent = new Intent(getApplicationContext(), QuestionActivity.class);
                    physics_questions_intent.putExtra(QuestionActivity.PHYSICS_QUESTIONS_STATE, false);
                }
                break;
            case "history_questions":
                if (state) {
                    Intent history_questions_intent = new Intent(getApplicationContext(), QuestionActivity.class);
                    history_questions_intent.putExtra(QuestionActivity.HISTORY_QUESTIONS_STATE, true);
                } else {
                    Intent history_questions_intent = new Intent(getApplicationContext(), QuestionActivity.class);
                    history_questions_intent.putExtra(QuestionActivity.HISTORY_QUESTIONS_STATE, false);
                }
                break;
            case "cinema_questions":
                if (state) {
                    Intent cinema_questions_intent = new Intent(getApplicationContext(), QuestionActivity.class);
                    cinema_questions_intent.putExtra(QuestionActivity.CINEMA_QUESTIONS_STATE, true);
                } else {
                    Intent cinema_questions_intent = new Intent(getApplicationContext(), QuestionActivity.class);
                    cinema_questions_intent.putExtra(QuestionActivity.CINEMA_QUESTIONS_STATE, false);
                }
                break;
            case "geography_questions":
                if (state) {
                    Intent geography_questions_intent = new Intent(getApplicationContext(), QuestionActivity.class);
                    geography_questions_intent.putExtra(QuestionActivity.GEOGRAPHY_QUESTIONS_STATE, true);
                } else {
                    Intent geography_questions_intent = new Intent(getApplicationContext(), QuestionActivity.class);
                    geography_questions_intent.putExtra(QuestionActivity.GEOGRAPHY_QUESTIONS_STATE, false);
                }
                break;
            case "general_culture_questions":
                if (state) {
                    Intent general_culture_intent = new Intent(getApplicationContext(), QuestionActivity.class);
                    general_culture_intent.putExtra(QuestionActivity.GENERAL_CULTURE_QUESTIONS_STATE, true);
                } else {
                    Intent general_culture_intent = new Intent(getApplicationContext(), QuestionActivity.class);
                    general_culture_intent.putExtra(QuestionActivity.GENERAL_CULTURE_QUESTIONS_STATE, false);
                }
                break;

        }


    }
}



