package com.kelompok11_progmob_a.myrecipe.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.PagerAdapter;

import com.kelompok11_progmob_a.myrecipe.DetailRecipeActivity;
import com.kelompok11_progmob_a.myrecipe.R;
import com.kelompok11_progmob_a.myrecipe.model.Recipe;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Banner adapter merupakan sebuah adapter yang  diperlukan untuk membuat tampilan viewpager.
 * View pager akan ditampilkan di halaman HomeActivity.
 */
public class BannerAdapter extends PagerAdapter {

    // deklarasi atribut-atribut banner adapter.
    private List<Recipe> recipes;
    private Context context;

    // deklarasi konstruktor kelas BannerAdapter.
    public BannerAdapter(List<Recipe> recipes, Context context) {
        this.recipes = recipes;
        this.context = context;
    }

    // getcount akan mengembalikan nilai jumlah item dari view pager.
    @Override
    public int getCount() {
        return recipes.size();
    }

    // method ini dibutuhkan untuk mengecek apakah item bagian dari objek.
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    // method ini akan mengisi tiap item view pager dengan data yang didapatkan dari data recipe.
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(
                R.layout.item_banner,
                container,
                false
        );

        // data recipe dengan posisi yang ditentukan.
        Recipe recipe = recipes.get(position);

        // deklarasi objek view dari layout item_banner.xml
        ImageView recipeImage = view.findViewById(R.id.imageView_recipeImage);
        TextView recipeName = view.findViewById(R.id.textView_recipeName);
        CardView cardItem = view.findViewById(R.id.cardView_bannerItem);

        // memasukkan gambar kedalam objek imageview menggunakan bantuan library picasso.
        Picasso.get().load(recipe.getImageRes()).into(recipeImage);

        recipeName.setText(recipe.getName());

        cardItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailRecipeActivity.class);
                intent.putExtra(DetailRecipeActivity.NAME, recipe.getName());
                intent.putExtra(DetailRecipeActivity.IMAGE, recipe.getImageRes());
                intent.putExtra(DetailRecipeActivity.VIDEO, recipe.getVideo());
                intent.putStringArrayListExtra(DetailRecipeActivity.INGREDIENTS, recipe.getIngredient());
                intent.putStringArrayListExtra(DetailRecipeActivity.STEPS, recipe.getSteps());
                context.startActivity(intent);
            }
        });

        container.addView(view, 0);
        return view;
    }

    // method untuk menghapus item yang tidak terlihat untuk menghemat memori.
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
