package gruppe6.inspiria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AppmenyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appmeny);
    }



    public void goToQuiz(View view){

        Intent AppmenyActivity = new Intent(this, QuizActivity.class);
        startActivity(AppmenyActivity);
    }

    public void goToOppgave(View view){

        Intent AppmenyActivity = new Intent(this, OppgaveActivity.class);
        startActivity(AppmenyActivity);
    }

}
