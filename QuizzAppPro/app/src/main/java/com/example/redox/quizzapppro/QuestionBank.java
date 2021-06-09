package com.example.redox.quizzapppro;

import java.util.ArrayList;
import java.util.List;

/*
Dummy data
 */
public class QuestionBank {
    private List<Question> questions;

    public List<Question> getAllQuestions() {
        if (questions == null) {
            questions = new ArrayList<>();
            questions.add(new Question(0, "¿La luna es de queso?", false));
            questions.add(new Question(1, "¿Existe Santa Claus?", true));
            questions.add(new Question(2, "¿Ganará AMLO a los huachicoleros?", false));
            questions.add(new Question(3, "¿Realmente se viajó a la luna?", true));
            questions.add(new Question(4, "¿La tierra es plana?", false));
            questions.add(new Question(5, "¿Rayo McQueen tiene un seguro de auto?", true));
            questions.add(new Question(6, "¿México es parte de centroamérica?", false));
        }

        return questions;
    }
}
