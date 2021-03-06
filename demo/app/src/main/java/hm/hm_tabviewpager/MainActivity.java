package hm.hm_tabviewpager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Hm_TabViewPager tabViewPager = (Hm_TabViewPager) findViewById(R.id.pager);
        tabViewPager.setIcon_normal(new int[]{R.drawable.ic_launcher, R.drawable.ic_launcher});
        tabViewPager.setIcon_selected(new int[]{R.drawable.ic_launcher2, R.drawable.ic_launcher2});
        tabViewPager.setTabTitle(new String[]{"首页", "我的"});
        tabViewPager.setTabBackgroundColor(Color.parseColor("#f3f3f3"));
        tabViewPager.setTabTitleColor(Color.parseColor("#333333"));
        tabViewPager.setDividerColorBetweenViewPagerAndTab(Color.parseColor("#000000"));
//        tabViewPager.setNoScroll(false);
        Hm_TabViewPager.ViewPager_ pager = tabViewPager.getViewPager();
        Adapter adapter = new Adapter(getSupportFragmentManager());
        pager.setAdapter(adapter);


    }

    class Adapter extends FragmentPagerAdapter {

        public Adapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new F_1();
            } else {
                return new F_2();
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
