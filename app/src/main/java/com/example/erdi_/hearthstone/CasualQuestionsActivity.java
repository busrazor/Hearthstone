package com.example.erdi_.hearthstone;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Erdi- on 15.5.2016.
 */
public class CasualQuestionsActivity extends Activity {
    ArrayList<CasualQuestions> casualQuestionsArrayList;
    int score = 0;
    int qid = 0;


    CasualQuestions currentQ;
    TextView times, scored;
    ImageView image;
    Button option1, option2, option3, option4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.casual_quiz);


    }
}
