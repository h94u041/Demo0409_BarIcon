package com.example.h94u04.demo0409_baricon;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements ActionBar.TabListener, ViewPager.OnPageChangeListener {
    ViewPager Vpg ;
    Fragment fragment;
    DrawerLayout FraDL ;
    TextView TV;
    ListView LV;
    Button BTN;
    Menu mMenu;
    ActionBar Bar ;
    String[] strA = {"Page 1 ","Page 2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Vpg = (ViewPager) findViewById(R.id.Vpg);
        Vpg.setAdapter(new FraPager(getSupportFragmentManager()));
        Vpg.setOnPageChangeListener(this);
        LV = (ListView) findViewById(R.id.DraLV);
        FraDL = (DrawerLayout)findViewById(R.id.FraDraOut);
        FraDL.setDrawerShadow(android.R.color.holo_green_light , GravityCompat.END);
        LV.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, strA));
        Bar = getActionBar();

        Bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        Bar.addTab(Bar.newTab().setText("Tab01").setIcon(R.drawable.boot_camp_dark).setTabListener(this));

        Bar.addTab(Bar.newTab().setText("Tab02").setIcon(R.drawable.clear_dark).setTabListener(this));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        mMenu = menu;
        getMenuInflater().inflate(R.menu.menu_main, menu);
        mMenu.getItem(0).setVisible(true);
        mMenu.getItem(0).setEnabled(true);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch(id)
        {
            case R.id.Menu_LV02 :
                FraDL.openDrawer(Gravity.END);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
        //動畫效果
        if (Vpg != null)
        {
            Vpg.setCurrentItem(tab.getPosition());
        }
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onPageScrolled(int i, float v, int i2) {

    }

    @Override
    public void onPageSelected(int i) {
        Bar.setSelectedNavigationItem(i);
    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }
}

class FraPager extends FragmentPagerAdapter
{
    public FraPager(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int i)
    {
        return new FraPage();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
