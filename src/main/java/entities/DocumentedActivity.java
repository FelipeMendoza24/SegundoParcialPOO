package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DocumentedActivity extends Activity {

    private NormalActivity activity;
    private List<Question> questions;

    public DocumentedActivity(String name, String state, Iteration iteration, NormalActivity activity) {
        super(name, state, iteration);
        this.activity = activity;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    @Override
    public Duration getDuration() throws SabanaResearchException {
            double cont = 0;
            for(NormalActivity n: this.activities){
                n.getDuration();
                cont++;
            }
            return Duration.ofDays((long) cont);
        }
    public void getDedication() throws SabanaResearchException {
        for (Question q:this.questions){
            q.getDedication();
        }
        return;
    }
}
