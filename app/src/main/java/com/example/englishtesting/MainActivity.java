package com.example.englishtesting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView question;
    RadioButton v1;
    RadioButton v2;
    RadioButton v3;
    RadioButton v4;


    int numberOfQuestion = 1;
    int rightAnswers = 0;
    int inList = 0;
    boolean setData = false;
    String total;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView result = findViewById(R.id.result);
        final ArrayList<Question> questions = new QuestionRepository().getQuestions();
        final Button beginTesting = findViewById(R.id.begin);
        final RadioGroup radioGroup = findViewById(R.id.question);
        final Button tryAgain = findViewById(R.id.again);
        question = findViewById(R.id.question_text);
        v1 = findViewById(R.id.v1);
        v2 = findViewById(R.id.v2);
        v3 = findViewById(R.id.v3);
        v4 = findViewById(R.id.v4);

        beginTesting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                beginTesting.setVisibility(View.GONE);
                radioGroup.setVisibility(View.VISIBLE);
                question.setText(questions.get(0).getQuestion());
                v1.setText(questions.get(0).getV1());
                v2.setText(questions.get(0).getV2());
                v3.setText(questions.get(0).getV3());
                v4.setText(questions.get(0).getV4());

            }
        });
        tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.finish();
                Intent openMainActivity =
                        new Intent(MainActivity.this, MainActivity.class);
                startActivity(openMainActivity);
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                inList = numberOfQuestion - 1;
                if (i == -1)
                    return;

                RightAnswer rightAnswer = questions.get(inList).getRightAnswer();

                if ((rightAnswer == RightAnswer.Answer1 && i == R.id.v1
                        || rightAnswer == RightAnswer.Answer2 && i == R.id.v2
                        || rightAnswer == RightAnswer.Answer3 && i == R.id.v3
                        || rightAnswer == RightAnswer.Answer4 && i == R.id.v4)
                        && numberOfQuestion <= questions.size()) {
                    questions.get(inList).setRight(true);
                    rightAnswers++;
                    questions.get(numberOfQuestion - 1).setRight(true);
                }

                numberOfQuestion++;
                if (numberOfQuestion == questions.size() + 1) {
                    radioGroup.setVisibility(View.GONE);
                    tryAgain.setVisibility(View.VISIBLE);
                    if (rightAnswers == 1) {
                        total = "Your result: " + rightAnswers + " right answer of " +
                                questions.size() + " questions!";

                    } else if (rightAnswers == questions.size()) {
                        total = "You answered correctly all " + questions.size() +
                                " questions. Perfect!";
                    } else if (rightAnswers == 0)
                        total = "None of the " + questions.size() +
                                " questions were correctly answered.";
                    else {
                        total = "Your result: " + rightAnswers + " right answers of " +
                                questions.size() + " questions.";
                    }
                    result.setText(total);
                    return;
                }

                if (!setData) {
                    question.setText(questions.get(numberOfQuestion - 1).getQuestion());
                    v1.setText(questions.get(numberOfQuestion - 1).getV1());
                    v2.setText(questions.get(numberOfQuestion - 1).getV2());
                    v3.setText(questions.get(numberOfQuestion - 1).getV3());
                    v4.setText(questions.get(numberOfQuestion - 1).getV4());
                }
                setData = false;
                radioGroup.clearCheck();
            }
        });

    }

}
