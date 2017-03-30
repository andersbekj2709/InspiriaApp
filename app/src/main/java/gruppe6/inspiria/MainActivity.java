package gruppe6.inspiria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToQuiz (View view){

        Intent QuizActivity = new Intent(this, MainActivity.class);
        startActivity(QuizActivity);
     }
}
//test