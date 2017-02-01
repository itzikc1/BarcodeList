package ic.barcodelist;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;

/**
 * Created by Itzik on 31/01/2017.
 */

public class WelcomeFragment extends Fragment {

    ProgressBar progressBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.welcome_fragment, container, false);

        progressBar = (ProgressBar) view.findViewById(R.id.mainListProgressBar);
        progressBar.setVisibility(View.VISIBLE);
        return view;
    }



}
