package techercise.onerepmaxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText numReps;
    public EditText amtWeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numReps= (EditText) findViewById(R.id.editText2);
        amtWeight= (EditText) findViewById(R.id.editText);
    }

    public void buttonSubmit(View view)
    {
        Toast.makeText(view.getContext(),"Epley Formula: " + (Integer.parseInt(amtWeight.getText().toString()) * (1 + Integer.parseInt(numReps.getText().toString())/30)) + " lbs.", Toast.LENGTH_LONG).show();
    }
}
