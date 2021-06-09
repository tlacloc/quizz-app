package com.example.redox.quizzapppro;

import android.arch.lifecycle.ViewModel;

public class OptionsActivityModel extends ViewModel {


    private boolean all_questions;
    private boolean sport_questions;
    private boolean physics_questions;
    private boolean history_questions;
    private boolean cinema_questions;
    private boolean geography_questions;
    private boolean general_culture_questions;

    private int difficulty;
    private int number_of_questions;
    private int number_of_cheats;


    public void startSetup() {

        this.all_questions = true;
        this.difficulty = 1;
        this.number_of_questions = 15;
        this.number_of_cheats = 0;

    }

    public boolean isAll_questions() {
        return all_questions;
    }

    public boolean isCinema_questions() {
        return cinema_questions;
    }

    public boolean isGeneral_culture_questions() {
        return general_culture_questions;
    }

    public boolean isGeography_questions() {
        return geography_questions;
    }

    public boolean isHistory_questions() {
        return history_questions;
    }

    public boolean isPhysics_questions() {
        return physics_questions;
    }

    public boolean isSport_questions() {

        return sport_questions;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getNumber_of_cheats() {
        return number_of_cheats;
    }

    public int getNumber_of_questions() {
        return number_of_questions;
    }

    public void setCinema_questions(boolean cinema_questions) {
        this.cinema_questions = cinema_questions;
    }

    public void setAll_questions(boolean all_questions) {
        this.all_questions = all_questions;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void setGeneral_culture_questions(boolean general_culture_questions) {
        this.general_culture_questions = general_culture_questions;
    }

    public void setGeography_questions(boolean geography_questions) {
        this.geography_questions = geography_questions;
    }

    public void setHistory_questions(boolean history_questions) {
        this.history_questions = history_questions;
    }

    public void setNumber_of_cheats(int number_of_cheats) {
        this.number_of_cheats = number_of_cheats;
    }

    public void setNumber_of_questions(int number_of_questions) {
        this.number_of_questions = number_of_questions;
    }

    public void setPhysics_questions(boolean physics_questions) {
        this.physics_questions = physics_questions;
    }

    public void setSport_questions(boolean sport_questions) {
        this.sport_questions = sport_questions;
    }
}
