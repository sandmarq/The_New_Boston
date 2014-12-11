package thenewboston.sandmarq.ca.thenewboston;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Email extends Activity implements View.OnClickListener {

    EditText personsEmail, intro, personsName, stupidThings, hatefulAction, outro;
    String emailAdd, beginning, name, stupidAction, hatefulAct, out;
    Button sendEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email);
        initializeVars();
        sendEmail.setOnClickListener(this);
    }

    private void initializeVars() {
        // TODO Auto-generated method stub
        personsEmail = (EditText) findViewById(R.id.etEmails);
        intro = (EditText) findViewById(R.id.etIntro);
        personsName = (EditText) findViewById(R.id.etName);
        stupidThings = (EditText) findViewById(R.id.etThings);
        hatefulAction = (EditText) findViewById(R.id.etAction);
        outro = (EditText) findViewById(R.id.etOutro);
        sendEmail = (Button) findViewById(R.id.bSentEmail);
    }

    public void onClick(View v) {
        // TODO Auto-generated method stub

        Resources res = getResources();
        String[] msg = res.getStringArray(R.array.saMsg);

        convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated();
        String emailaddress[] = { emailAdd };
        String message = msg[0].toString() + " "
                + name
                + " " + msg[1].toString() + " "
                + beginning
                + msg[2].toString() + " "
                + stupidAction
                + msg[3].toString() + " "
                + hatefulAct
                + msg[4].toString() + " "
                + out
                + msg[5].toString()
                + '\n' + msg[6].toString();

        Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailaddress);
        emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "I hate you!");
        emailIntent.setType("plain/text");
        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
        startActivity(emailIntent);

    }

    private void convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated() {
        // TODO Auto-generated method stub
        emailAdd = personsEmail.getText().toString();
        beginning = intro.getText().toString();
        name = personsName.getText().toString();
        stupidAction = stupidThings.getText().toString();
        hatefulAct = hatefulAction.getText().toString();
        out = outro.getText().toString();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}
