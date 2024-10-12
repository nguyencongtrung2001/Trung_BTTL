package com.example.my_tab_g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ProfileFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager2 viewPager;
    private ProfilePagerAdapter profilePagerAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        tabLayout = view.findViewById(R.id.tab_layout);
        viewPager = view.findViewById(R.id.view_pager);

        profilePagerAdapter = new ProfilePagerAdapter(this);
        viewPager.setAdapter(profilePagerAdapter);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Tab 1");
                    break;
                case 1:
                    tab.setText("Tab 2");
                    break;
                case 2:
                    tab.setText("Tab 3");
                    break;
            }
        }).attach();

        return view;
    }
}
