package com.example.redox.quizzapppro;

import android.arch.lifecycle.ViewModel;

import java.util.List;

public class QuestionActivityModel extends ViewModel {

    private QuestionBank questionBank;
    private List<Question> gameQuestions;
    private int currentQuestionIndex;

    public int getCurrentQuestionIndex() {
        return currentQuestionIndex;
    }

    public void incrementCurrentQuestionIndex() {
        currentQuestionIndex = (currentQuestionIndex + 1) % gameQuestions .size();
    }

    public void decrementCurrentQuestionIndex() {
        currentQuestionIndex = (currentQuestionIndex == 0) ? gameQuestions.size() - 1 : currentQuestionIndex - 1;
    }

    public void loadGameQuestions() {
        if (questionBank == null) {
            currentQuestionIndex = 0;
            questionBank = new QuestionBank();
            gameQuestions = questionBank.getAllQuestions();
        }
    }

    public Question getCurrentQuestion() {
        return gameQuestions.get(currentQuestionIndex);
    }

    public Question getNextQuestion() {
        incrementCurrentQuestionIndex();
        return gameQuestions.get(currentQuestionIndex);
    }

    public Question getPreviousQuestion() {
        decrementCurrentQuestionIndex();
        return gameQuestions.get(currentQuestionIndex);
    }


}
