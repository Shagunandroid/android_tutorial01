package android.app.shagun.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tapme(View view) {
        Toast.makeText(getApplicationContext(),"You have tap the 'Tap me button'",Toast.LENGTH_LONG).show();
    }
}
