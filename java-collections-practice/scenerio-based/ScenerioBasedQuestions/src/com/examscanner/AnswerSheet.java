package com.examscanner;

import java.util.List;

public abstract class AnswerSheet {

    protected String studentName;
    protected List<String> answers;

    public AnswerSheet(String studentName, List<String> answers) {
        this.studentName = studentName;
        this.answers = answers;
    }

    public String getStudentName() {
        return studentName;
    }

    public abstract int evaluate(List<String> answerKey);
}
