package com.udacity.gradle.builditbigger.jokeactivity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class JokeFragment extends Fragment {


    public JokeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_joke, container, false);
        TextView jokeTextView = (TextView) view.findViewById(R.id.joke_text);
        String joke = getActivity().getIntent().getStringExtra("joke");
        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }

        return view;
    }

}
