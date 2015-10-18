package br.com.justiniano.edilson.closeaccount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import br.com.justiniano.edilson.closeaccount.model.Product;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //O Justino parece um jacaré
        congureExitButton();
    }

    private void congureExitButton() {
        Button btGoHome = (Button) findViewById(R.id.bt_go_home);
        btGoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callHomeActivity();

            }
        });
    }

    private void callHomeActivity() {

        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra("MSG", getString(R.string.message_open_home));
        Integer valueTest = new Integer(10);
        intent.putExtra("OBJECT", valueTest);
        Product product = new Product("Coca-cola", 5.5d, 1);
        intent.putExtra("PRODUCT", product);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
