package com.charlynder.tymr;

import static android.content.ContentValues.TAG;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Date;
import java.text.SimpleDateFormat;


public class TymrFragment extends Fragment {

    private static SharedPreferences prefs;

    public TymrFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set the default values for the preferences
        PreferenceManager.setDefaultValues(getActivity(), R.xml.preferences, false);
        // get default SharedPreferences object
        prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
        // turn on the options menu
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tymr, container, false);

        return view;
    }

    public String timer() {
        Long currentTime = System.currentTimeMillis();

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

        Date date = new Date(currentTime);

        String time = sdf.format(date);

        Log.d(TAG, "onCreate: " + time);

        return time;
    }
}