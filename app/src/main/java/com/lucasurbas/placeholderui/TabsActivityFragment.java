package com.lucasurbas.placeholderui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class TabsActivityFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_tabs, container, false);

        Toolbar t = (Toolbar) root.findViewById(R.id.toolbar);
        t.setTitle(R.string.app_name);
        t.setNavigationIcon(R.drawable.ic_menu_white_24dp);
        t.setContentInsetsRelative(Utils.dpToPx(72, getActivity()), 0);

        t.inflateMenu(R.menu.menu_tabs);
        ((AppCompatActivity) getActivity()).setSupportActionBar(t);

        return root;
    }
}
