package aldwin.tablante.com.easycalcu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doMinus(View view){
EditText answer = (EditText) findViewById(R.id.editText3);
        EditText firstNum = (EditText) findViewById(R.id.editText);
        EditText secondNum = (EditText) findViewById(R.id.editText2);
        int numF = Integer.parseInt(firstNum.getText().toString());
        int numS =Integer.parseInt(secondNum.getText().toString());
        numF = numF - numS;
        String finAl=String.valueOf(numF);
answer.setText(finAl);
    }
}
