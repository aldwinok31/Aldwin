package aldwin.tablante.com.easycalcu;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

private double finalAnswer=0;
private double numF=0;
    private double numS=0;
    private DecimalFormat temp = new DecimalFormat("0.00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doMinus(View view){

        EditText answer = (EditText) findViewById(R.id.editText3);
        EditText firstNum = (EditText) findViewById(R.id.editText);
        EditText secondNum = (EditText) findViewById(R.id.editText2);
        if(firstNum.getText().toString().trim().equals("")) {
            firstNum.setError( "First Number Required" );

        }
        if(secondNum.getText().toString().trim().equals("")) {
            secondNum.setError( "Second Number Required" );

        }
        else{
            numF = Double.parseDouble(firstNum.getText().toString());
            numS = Double.parseDouble(secondNum.getText().toString());
            finalAnswer = numF - numS;
            answer.setText(temp.format(finalAnswer));
        }

    }


    public void doDivide(View view){
        EditText answer = (EditText) findViewById(R.id.editText3);
        EditText firstNum = (EditText) findViewById(R.id.editText);
        EditText secondNum = (EditText) findViewById(R.id.editText2);
  if(firstNum.getText().toString().trim().equals("")) {
      firstNum.setError( "First Number Required" );

  }
        if(secondNum.getText().toString().trim().equals("")) {
            secondNum.setError( "Second Number Required" );

        }
else{
      numF = Double.parseDouble(firstNum.getText().toString());
      numS = Double.parseDouble(secondNum.getText().toString());
      finalAnswer = numF / numS;
      answer.setText(temp.format(finalAnswer));
  }



    }
    public void doPlus(View view){
        EditText answer = (EditText) findViewById(R.id.editText3);
        EditText firstNum = (EditText) findViewById(R.id.editText);
        EditText secondNum = (EditText) findViewById(R.id.editText2);
        if(firstNum.getText().toString().trim().equals("")) {
            firstNum.setError( "First Number Required" );

        }
        if(secondNum.getText().toString().trim().equals("")) {
            secondNum.setError( "Second Number Required" );

        }
        else{
            numF = Double.parseDouble(firstNum.getText().toString());
            numS = Double.parseDouble(secondNum.getText().toString());
            finalAnswer = numF + numS;
            answer.setText(temp.format(finalAnswer));
        }


    }
    public void doProduct(View view){
        EditText answer = (EditText) findViewById(R.id.editText3);
        EditText firstNum = (EditText) findViewById(R.id.editText);
        EditText secondNum = (EditText) findViewById(R.id.editText2);
        if(firstNum.getText().toString().trim().equals("")) {
            firstNum.setError( "First Number Required" );

        }
        if(secondNum.getText().toString().trim().equals("")) {
            secondNum.setError( "Second Number Required" );

        }
        else{
            numF = Double.parseDouble(firstNum.getText().toString());
            numS = Double.parseDouble(secondNum.getText().toString());
            finalAnswer = numF * numS;
            answer.setText(temp.format(finalAnswer));
        }


    }
    public void doExit(View view){
        finish();

    }
    public void doClear(View view){
        EditText answer = (EditText) findViewById(R.id.editText3);
        EditText firstNum = (EditText) findViewById(R.id.editText);
        EditText secondNum = (EditText) findViewById(R.id.editText2);
        answer.setText("");
        firstNum.setText("");
        secondNum.setText("");
        answer.setHint("0");
        firstNum.setHint("Enter First Number");
        secondNum.setHint("Enter Second Number");
    }

}
