package aldwin.tablante.com.easycalcu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
public class MainActivity extends AppCompatActivity {

private int finalAnswer=0;
private int numF=0;
    private int numS=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doMinus(View view){
EditText answer = (EditText) findViewById(R.id.editText3);
        EditText firstNum = (EditText) findViewById(R.id.editText);
        EditText secondNum = (EditText) findViewById(R.id.editText2);
        numF = Integer.parseInt(firstNum.getText().toString());
        numS =Integer.parseInt(secondNum.getText().toString());
        numF = numF - numS;
        String finAl=String.valueOf(numF);
answer.setText(finAl);
    }


    public void doDivide(View view){
        EditText answer = (EditText) findViewById(R.id.editText3);
        EditText firstNum = (EditText) findViewById(R.id.editText);
        EditText secondNum = (EditText) findViewById(R.id.editText2);
        numF = Integer.parseInt(firstNum.getText().toString());
        numS =Integer.parseInt(secondNum.getText().toString());
        finalAnswer = numF / numS;
        String finAl=String.valueOf(finalAnswer);
        answer.setText(finAl);

    }
    public void doPlus(View view){
        EditText answer = (EditText) findViewById(R.id.editText3);
        EditText firstNum = (EditText) findViewById(R.id.editText);
        EditText secondNum = (EditText) findViewById(R.id.editText2);
        numF = Integer.parseInt(firstNum.getText().toString());
        numS =Integer.parseInt(secondNum.getText().toString());
        finalAnswer = numF + numS;
        String finAl=String.valueOf(finalAnswer);
        answer.setText(finAl);

    }
    public void doProduct(View view){
        EditText answer = (EditText) findViewById(R.id.editText3);
        EditText firstNum = (EditText) findViewById(R.id.editText);
        EditText secondNum = (EditText) findViewById(R.id.editText2);
        numF = Integer.parseInt(firstNum.getText().toString());
        numS =Integer.parseInt(secondNum.getText().toString());
        finalAnswer = numF * numS;
        String finAl=String.valueOf(finalAnswer);
        answer.setText(finAl);

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
