package com.example.erdi_.hearthstone;

import android.app.Activity;

/**
 * Created by Erdi- on 15.5.2016.
 */
public class CasualQuestions extends Activity {
    private int id;
    private int image;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;

    public CasualQuestions(String answer, int id, int image, String option1, String option2, String option3, String option4) {
        this.answer = answer;
        this.id = id;
        this.image = image;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }

    public CasualQuestions() {
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }
}


