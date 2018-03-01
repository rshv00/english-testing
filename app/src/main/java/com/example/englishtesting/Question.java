package com.example.englishtesting;

/**
 * Created by Рома on 1/25/2018.
 */

public class Question {
    private String question;
    private String v1;
    private String v2;
    private String v3;
    private String v4;
    private RightAnswer rightAnswer;
    private boolean isRight;

    public Question(String question, String v1, String v2, String v3, String v4,
                    RightAnswer rightAnswer, boolean isRight) {
        this.question = question;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
        this.rightAnswer = rightAnswer;
        this.isRight = isRight;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getV1() {
        return v1;
    }

    public void setV1(String v1) {
        this.v1 = v1;
    }

    public String getV2() {
        return v2;
    }

    public void setV2(String v2) {
        this.v2 = v2;
    }

    public String getV3() {
        return v3;
    }

    public void setV3(String v3) {
        this.v3 = v3;
    }

    public String getV4() {
        return v4;
    }

    public void setV4(String v4) {
        this.v4 = v4;
    }

    public RightAnswer getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(RightAnswer rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }


}
