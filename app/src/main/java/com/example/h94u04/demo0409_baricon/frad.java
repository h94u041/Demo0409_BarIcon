package com.example.h94u04.demo0409_baricon;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
/*
public class frad extends Fragment
{
    DrawerLayout FraDL ;
    ListView LV;
    String[] strA = {"Page 1 ,Page 2"};

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fradrawer ,container , false);
        FraDL = (DrawerLayout) v.findViewById(R.id.FraDraOut);DrawerLayout FraDL ;
        LV = (ListView) v.findViewById(R.id.DraLV);
        FraDL.setDrawerShadow(android.R.color.holo_green_light , GravityCompat.END);
        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        LV.setAdapter(new ArrayAdapter(getActivity() , android.R.layout.simple_list_item_1 ,strA ));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.Menu_LV02) {
            if (!FraDL.isDrawerOpen(Gravity.END)) {
                FraDL.openDrawer(Gravity.END);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}*/
