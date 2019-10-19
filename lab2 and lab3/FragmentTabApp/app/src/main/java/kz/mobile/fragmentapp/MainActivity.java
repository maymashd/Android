package kz.mobile.fragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FirstFragment.SendMessage {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle", "Main activity- onRestoreInstanceState" );

        //Show fragment in container
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer1, new FirstFragment())
                .commit();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer2, new SecondFragment())
                .commit();
    }

    @Override
    public void sendData(String counter) {
        String tag = "android:switcher:" + R.id.viewPager + ":" + 1;
        Log.d("lifecycle", "Main activity send Data");
        SecondFragment fragment = (SecondFragment)
                getSupportFragmentManager().findFragmentByTag(tag);
        fragment.displayReceivedData(counter);
    }
}
