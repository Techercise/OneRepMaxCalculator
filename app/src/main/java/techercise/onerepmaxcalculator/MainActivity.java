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

    public TextView epRes;
    public EditText numReps;
    public EditText amtWeight;
    public TextView resText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numReps= (EditText) findViewById(R.id.editText2);
        amtWeight= (EditText) findViewById(R.id.editText);
        resText = (TextView) findViewById(R.id.textView5);
        resText.setTypeface(null, Typeface.BOLD);
    }

    public void buttonSubmit(View view)
    {
        epRes = (TextView) findViewById(R.id.textView4);
        epRes.setText((Integer.parseInt(amtWeight.getText().toString()) * (1 + Integer.parseInt(numReps.getText().toString()) / 30)) + " lbs.");
        epRes.setTypeface(null, Typeface.BOLD);
    }

    public void clearSubmit(View view)
    {
        epRes = (TextView) findViewById(R.id.textView4);
        numReps = (EditText) findViewById(R.id.editText2);
        amtWeight = (EditText) findViewById(R.id.editText);
        epRes.setText("");
        numReps.setText("");
        amtWeight.setText("");
    }
}
