package com.example.englishtesting;

import java.util.ArrayList;


/**
 * Created by Рома on 2/22/2018.
 */

public class QuestionRepository {


    public ArrayList<Question> getQuestions() {
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new Question("1. Henry … play volleyball very well", "Can", "Could",
                "May", "Must", RightAnswer.Answer1, false));
        questions.add(new Question("2. We … help you with house chores yesterday", "Can", "Could",
                "May", "Must", RightAnswer.Answer2, false));
        questions.add(new Question("3. Dolly … look after her little cousin", "Can", "Could",
                "May", "Must", RightAnswer.Answer4, false));
        questions.add(new Question("4. They … go fishing with Bob", "Can", "Could",
                "May", "Must", RightAnswer.Answer3, false));

        questions.add(new Question("5. Alex … return me this disc yesterday", "Can", "Could",
                "May", "Must", RightAnswer.Answer2, false));

        questions.add(new Question("6. He … give you sweets after dinner", "Can", "Could",
                "May", "Must", RightAnswer.Answer3, false));

        questions.add(new Question("7. Mary … translate this text", "Can", "Could",
                "May", "Must", RightAnswer.Answer4, false));

        questions.add(new Question("8. I … make a cup of tea for them", "Can", "Could",
                "May", "Must", RightAnswer.Answer1, false));

        questions.add(new Question("9. You … take care of your sister", "Can", "Could",
                "May", "Must", RightAnswer.Answer4, false));

        questions.add(new Question("10. The doctor … examine you", "Can", "Could",
                "May", "Must", RightAnswer.Answer1, false));

        questions.add(new Question("11. Nick … ski last winter", "Can", "Could",
                "May", "Must", RightAnswer.Answer2, false));
        questions.add(new Question("12. A cat … look at a king", "Must", "May",
                "Can", "Could", RightAnswer.Answer2, false));
        questions.add(new Question("13. Don`t bite off more than you … chew", "Must",
                "May", "Can", "Could", RightAnswer.Answer3, false));
        questions.add(new Question("14. The leopard … change his spots", "Can't",
                "Must not", "May not", "Could not", RightAnswer.Answer1, false));
        questions.add(new Question("15. No man … serve two masters", "Must", "May",
                "Can", "Could", RightAnswer.Answer3, false));
        questions.add(new Question("16. Never put off till tomorrow what you … do today",
                "Must", "May", "Can", "Could", RightAnswer.Answer3, false));
        questions.add(new Question("17. The wolf … lose his teeth but never his nature",
                "Must", "May", "Can", "Could", RightAnswer.Answer2, false));
        questions.add(new Question("18. You … make an omelette without breaking eggs",
                "Must not", "Can't", "May not", "Could not", RightAnswer.Answer2, false));
        questions.add(new Question("19. You never know what you … do till you try", "Must",
                "May", "Can", "Could", RightAnswer.Answer3, false));
        return questions;
    }
}
