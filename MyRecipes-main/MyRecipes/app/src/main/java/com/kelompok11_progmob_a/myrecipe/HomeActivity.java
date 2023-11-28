package com.kelompok11_progmob_a.myrecipe;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.kelompok11_progmob_a.myrecipe.adapter.BannerAdapter;
import com.kelompok11_progmob_a.myrecipe.adapter.CategoryAdapter;
import com.kelompok11_progmob_a.myrecipe.data.DataProvider;
import com.kelompok11_progmob_a.myrecipe.model.Category;
import com.kelompok11_progmob_a.myrecipe.model.Recipe;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private ViewPager bannerViewPager;
    private RecyclerView categoryRecyclerView;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bannerViewPager = findViewById(R.id.viewPager_banner);
        categoryRecyclerView = findViewById(R.id.recyclerView_categories);
        searchView = findViewById(R.id.searchView_home);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                Intent intent = new Intent(HomeActivity.this, SearchActivity.class);
                intent.putExtra(SearchActivity.QUERY, s);
                startActivity(intent);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });

        setBanner();
        setCategories();
    }

    public void setBanner() {
        ArrayList<Recipe> recipes = DataProvider.getFavoriteRecipes();
        BannerAdapter bannerAdapter = new BannerAdapter(recipes, this);
        bannerViewPager.setAdapter(bannerAdapter);
        bannerViewPager.setPadding(20, 0, 150, 0);
        bannerAdapter.notifyDataSetChanged();
    }

    private void setCategories() {
        ArrayList<Category> categories = DataProvider.getCategories();
        CategoryAdapter categoryAdapter = new CategoryAdapter(categories, this);
        categoryRecyclerView.setAdapter(categoryAdapter);
        categoryRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        categoryRecyclerView.setNestedScrollingEnabled(true);
        categoryAdapter.notifyDataSetChanged();
    }
}