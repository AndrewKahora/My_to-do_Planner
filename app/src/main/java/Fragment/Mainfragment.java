package Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andrew.myto_doplanner.R;

/**
 * Created by andrew on 10/18/16.
 */
public class Mainfragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragmentmain, container, false);
        return rootView;


    }



}