package techercise.onerepmaxcalculator;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public TextView results;
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
        int weight = (Integer.parseInt(amtWeight.getText().toString()));
        int reps = Integer.parseInt(numReps.getText().toString());
        //results of Epley formula
        double epRes = (weight * (1 + reps/30));
        //results of Brzycki formula
        double brzyRes = weight * (36/(37 - reps));
        //results of McGlothlin formula
        double mcRes = (100 * weight)/(101.3 - (2.67123 - reps));
        //results of Lombardi formula
        double lomRes = weight * Math.pow(reps,0.1);
        //results of Mayhew formula
        double mayRes = (100 * weight)/(52.2 + (41.9 * Math.pow(Math.E, (-0.055 * reps))));
        //results of O'Conner formula
        double oconRes = weight * (1 + (reps/40));
        //reps of Wathan formula
        double wathRes = (100 * weight)/(48.8 + (Math.pow((53.8*Math.E), (-0.075*reps))));
        //find average of all formulas
        int avgRes = (int) Math.round((epRes + brzyRes + mcRes + lomRes + mayRes + oconRes +
                                        wathRes)/7);
        //display results in results bar
        results = (TextView) findViewById(R.id.textView4);
        results.setText(avgRes + " lbs.");
        //bold results to make them easier to see for user
        results.setTypeface(null, Typeface.BOLD);
    }

    public void clearSubmit(View view)
    {
        results = (TextView) findViewById(R.id.textView4);
        numReps = (EditText) findViewById(R.id.editText2);
        amtWeight = (EditText) findViewById(R.id.editText);
        results.setText("");
        numReps.setText("");
        amtWeight.setText("");
    }
}
