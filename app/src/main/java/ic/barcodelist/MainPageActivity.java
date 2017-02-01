package ic.barcodelist;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class MainPageActivity extends AppCompatActivity {
    FragmentManager manager;
    WelcomeFragment welcomeFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);


        manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        welcomeFragment = new WelcomeFragment();
        transaction.add(R.id.frag_container, welcomeFragment);
        transaction.commit();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
}
