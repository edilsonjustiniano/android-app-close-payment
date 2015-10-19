package br.com.justiniano.edilson.closeaccount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashSet;
import java.util.Set;

import br.com.justiniano.edilson.closeaccount.controller.AccountController;
import br.com.justiniano.edilson.closeaccount.model.Account;
import br.com.justiniano.edilson.closeaccount.model.Person;

public class CreateNewAccount extends AppCompatActivity {

    private AccountController accountController = new AccountController();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_account);

        final Set<Person> persons = buildPersons();
        Button btCreateAccount = (Button) findViewById(R.id.bt_start_account);
        btCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accountController.createAccount(persons);
            }
        });


    }

    private Set<Person> buildPersons() {
        EditText editTextPerson1 = (EditText) findViewById(R.id.txt_edit_person_1);
        EditText editTextPerson2 = (EditText) findViewById(R.id.txt_edit_person_2);
        EditText editTextPerson3 = (EditText) findViewById(R.id.txt_edit_person_3);
        EditText editTextPerson4 = (EditText) findViewById(R.id.txt_edit_person_4);

        Set<Person> persons = new HashSet<Person>();
        persons.add(new Person(editTextPerson1.getText().toString()));
        persons.add(new Person(editTextPerson2.getText().toString()));
        persons.add(new Person(editTextPerson3.getText().toString()));
        persons.add(new Person(editTextPerson4.getText().toString()));
        return persons;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_create_new_account, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
