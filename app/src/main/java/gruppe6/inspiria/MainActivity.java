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

       /* Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> minAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));

        minAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(minAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

        @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){


            switch (position){

                case 0 :
                    break;
                case 1 :
                    goToQuiz();
                case 2 :
                    break;
                case 3 :
                    goToOppgave();

                default:
                    break;


            }

        }
        @Override
            public void onNothingSelected(AdapterView<?> parent){

        }


        });

    */
    }


         public void goToMeny (View view) {

            Intent MainActivity = new Intent(this, AppmenyActivity.class);
            startActivity(MainActivity);
        }


}
