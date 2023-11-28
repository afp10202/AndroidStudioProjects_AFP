package com.kelompok11_progmob_a.myrecipe.data;

import com.kelompok11_progmob_a.myrecipe.R;
import com.kelompok11_progmob_a.myrecipe.model.Category;
import com.kelompok11_progmob_a.myrecipe.model.Recipe;

import java.util.ArrayList;

public class DataProvider {
    public static ArrayList<Category> getCategories() {
        ArrayList<Category> categories = new ArrayList<>();

        categories.add(new Category(0, "Appetizer", R.drawable.img_apetizer));
        categories.add(new Category(1, "Beverage", R.drawable.img_beverage));
        categories.add(new Category(2, "Dessert", R.drawable.img_dessert));
        categories.add(new Category(3, "Main Course", R.drawable.img_main_course));
        categories.add(new Category(4, "Side Dish", R.drawable.img_side_dish));

        return categories;
    }

    public static ArrayList<Recipe> getFavoriteRecipes() {
        ArrayList<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe("Penne Carbonara", R.drawable.img_penne_carbonara, "RiKmiY0z1aM", getIngredients(0), getSteps(0)));
        recipes.add(new Recipe("Fettuccine Carbonara", R.drawable.img_fettuccine_carbonara, "nAihfRXEiBQ", getIngredients(1), getSteps(1)));
        recipes.add(new Recipe("Pasta Lasagna", R.drawable.img_pasta_lasagna, "lDS6-gOh8G8", getIngredients(2), getSteps(2)));
        recipes.add(new Recipe("Mushroom Aglio Olio Pasta", R.drawable.img_mushroom_aglio_olio_pasta, "1fTQXcxVa_A", getIngredients(3), getSteps(3)));
        recipes.add(new Recipe("Bolognese Mac and Cheese", R.drawable.img_bolognese_mac_and_cheese, "sH9aA9yOCsY", getIngredients(4), getSteps(4)));
        return recipes;
    }

    public static ArrayList<Recipe> getAllRecipes() {
        ArrayList<Recipe> recipes = new ArrayList<>();

        recipes.add(new Recipe("Penne Carbonara", R.drawable.img_penne_carbonara, "RiKmiY0z1aM", getIngredients(0), getSteps(0)));
        recipes.add(new Recipe("Fettuccine Carbonara", R.drawable.img_fettuccine_carbonara, "nAihfRXEiBQ", getIngredients(1), getSteps(1)));
        recipes.add(new Recipe("Pasta Lasagna", R.drawable.img_pasta_lasagna, "lDS6-gOh8G8", getIngredients(2), getSteps(2)));
        recipes.add(new Recipe("Mushroom Aglio Olio Pasta", R.drawable.img_mushroom_aglio_olio_pasta, "1fTQXcxVa_A", getIngredients(3), getSteps(3)));
        recipes.add(new Recipe("Bolognese Mac and Cheese", R.drawable.img_bolognese_mac_and_cheese, "sH9aA9yOCsY", getIngredients(4), getSteps(4)));
        recipes.add(new Recipe("Manggo Jelly Milk Ice", R.drawable.img_manggo_jelly_milk_ice, "pL73hiGNU7c", getIngredients(5), getSteps(5)));
        recipes.add(new Recipe("Thai Tea", R.drawable.img_thai_tea, "tawz-mtvoXk", getIngredients(6), getSteps(6)));
        recipes.add(new Recipe("Kopi Susu Gula Aren", R.drawable.img_kopi_susu_gula_aren, "2AOFuPGtGqA", getIngredients(7), getSteps(7)));
        recipes.add(new Recipe("Iced Matcha Boba Latte", R.drawable.img_iced_matcha_boba_latte, "jFfbveNKUKQ", getIngredients(8), getSteps(8)));
        recipes.add(new Recipe("Taro Milk Tea", R.drawable.img_taro_milk_tea, "Zj2ijnkEjU4", getIngredients(9), getSteps(9)));
        recipes.add(new Recipe("Pancake Mangga", R.drawable.img_pancake_mangga, "BoRrFm_XmgA", getIngredients(10), getSteps(10)));
        recipes.add(new Recipe("Puding Coklat", R.drawable.img_puding_coklat, "uunoZaYF5mA", getIngredients(11), getSteps(11)));
        recipes.add(new Recipe("Puding Custard", R.drawable.img_puding_custard, "A8D1oGwSFf8", getIngredients(12), getSteps(12)));
        recipes.add(new Recipe("Oreo Dessert Cup", R.drawable.img_oreo_dessert_cup, "ouN9rpxwaYQ", getIngredients(13), getSteps(13)));
        recipes.add(new Recipe("Coklat Karamel Puding Cake", R.drawable.img_coklat_karamel_puding_cake, "ncaVevdSXU8", getIngredients(14), getSteps(14)));
        recipes.add(new Recipe("Chawanmushi", R.drawable.img_chawanmushi, "EzGRhgVyswk", getIngredients(15), getSteps(15)));
        recipes.add(new Recipe("Agedashi Tofu", R.drawable.img_agedashi_tofu, "M-4I-6w8l2I&pp=qAMBugMGCgJpZBAB", getIngredients(16), getSteps(16)));
        recipes.add(new Recipe("Karai Edamame", R.drawable.img_karai_edamame, "GpwGarDF0zE", getIngredients(17), getSteps(17)));
        recipes.add(new Recipe("Nasu No Miso Yaki", R.drawable.img_nasu_no_miso_yaki, "38FbOBgFlNQ", getIngredients(18), getSteps(18)));
        recipes.add(new Recipe("Tsukune", R.drawable.img_tsukune, "2org9q2Ca9I&pp=qAMBugMGCgJpZBAB", getIngredients(19), getSteps(19)));
        recipes.add(new Recipe("Lyonnaise Potatoes", R.drawable.img_lyonnaise_potatoes, "DB0hs4iv8Uc", getIngredients(20), getSteps(20)));
        recipes.add(new Recipe("Bayam Stew with Anchovy Powder", R.drawable.img_bayam_stew_with_anchovy_powder, "tmNPzBxXVqk&pp=qAMBugMGCgJpZBAB", getIngredients(21), getSteps(21)));
        recipes.add(new Recipe("Tumis Wortel Buncis Jagung", R.drawable.img_tumis_wortel_buncis_jagung, "OtbiLNFrpYk", getIngredients(22), getSteps(22)));
        recipes.add(new Recipe("Baked Potato Wedges", R.drawable.img_baked_potato_wedges, "bf48RIGw1kw", getIngredients(23), getSteps(23)));
        recipes.add(new Recipe("Chicken Parmigiana", R.drawable.img_chicken_parmigiana, "NVmqoYEqXzI&pp=qAMBugMGCgJpZBAB", getIngredients(24), getSteps(24)));
        return recipes;
    }

    public static ArrayList<Recipe> getRecipes(int id) {
        ArrayList<Recipe> recipes = new ArrayList<>();

        if (id == 0) {
            recipes.add(new Recipe("Penne Carbonara", R.drawable.img_penne_carbonara, "RiKmiY0z1aM", getIngredients(0), getSteps(0)));
            recipes.add(new Recipe("Fettuccine Carbonara", R.drawable.img_fettuccine_carbonara, "nAihfRXEiBQ", getIngredients(1), getSteps(1)));
            recipes.add(new Recipe("Pasta Lasagna", R.drawable.img_pasta_lasagna, "lDS6-gOh8G8", getIngredients(2), getSteps(2)));
            recipes.add(new Recipe("Mushroom Aglio Olio Pasta", R.drawable.img_mushroom_aglio_olio_pasta, "1fTQXcxVa_A", getIngredients(3), getSteps(3)));
            recipes.add(new Recipe("Bolognese Mac and Cheese", R.drawable.img_bolognese_mac_and_cheese, "sH9aA9yOCsY", getIngredients(4), getSteps(4)));
        } else if (id == 1) {
            recipes.add(new Recipe("Manggo Jelly Milk Ice", R.drawable.img_manggo_jelly_milk_ice, "pL73hiGNU7c", getIngredients(5), getSteps(5)));
            recipes.add(new Recipe("Thai Tea", R.drawable.img_thai_tea, "tawz-mtvoXk", getIngredients(6), getSteps(6)));
            recipes.add(new Recipe("Kopi Susu Gula Aren", R.drawable.img_kopi_susu_gula_aren, "2AOFuPGtGqA", getIngredients(7), getSteps(7)));
            recipes.add(new Recipe("Iced Matcha Boba Latte", R.drawable.img_iced_matcha_boba_latte, "jFfbveNKUKQ", getIngredients(8), getSteps(8)));
            recipes.add(new Recipe("Taro Milk Tea", R.drawable.img_taro_milk_tea, "Zj2ijnkEjU4", getIngredients(9), getSteps(9)));
        } else if (id == 2) {
            recipes.add(new Recipe("Pancake Mangga", R.drawable.img_pancake_mangga, "BoRrFm_XmgA", getIngredients(10), getSteps(10)));
            recipes.add(new Recipe("Puding Coklat", R.drawable.img_puding_coklat, "uunoZaYF5mA", getIngredients(11), getSteps(11)));
            recipes.add(new Recipe("Puding Custard", R.drawable.img_puding_custard, "A8D1oGwSFf8", getIngredients(12), getSteps(12)));
            recipes.add(new Recipe("Oreo Dessert Cup", R.drawable.img_oreo_dessert_cup, "ouN9rpxwaYQ", getIngredients(13), getSteps(13)));
            recipes.add(new Recipe("Coklat Karamel Puding Cake", R.drawable.img_coklat_karamel_puding_cake, "ncaVevdSXU8", getIngredients(14), getSteps(14)));
        } else if (id == 3) {
            recipes.add(new Recipe("Chawanmushi", R.drawable.img_chawanmushi, "EzGRhgVyswk", getIngredients(15), getSteps(15)));
            recipes.add(new Recipe("Agedashi Tofu", R.drawable.img_agedashi_tofu, "M-4I-6w8l2I&pp=qAMBugMGCgJpZBAB", getIngredients(16), getSteps(16)));
            recipes.add(new Recipe("Karai Edamame", R.drawable.img_karai_edamame, "GpwGarDF0zE", getIngredients(17), getSteps(17)));
            recipes.add(new Recipe("Nasu No Miso Yaki", R.drawable.img_nasu_no_miso_yaki, "38FbOBgFlNQ", getIngredients(18), getSteps(18)));
            recipes.add(new Recipe("Tsukune", R.drawable.img_tsukune, "2org9q2Ca9I&pp=qAMBugMGCgJpZBAB", getIngredients(19), getSteps(19)));
        } else if (id == 4) {
            recipes.add(new Recipe("Lyonnaise Potatoes", R.drawable.img_lyonnaise_potatoes, "DB0hs4iv8Uc", getIngredients(20), getSteps(20)));
            recipes.add(new Recipe("Bayam Stew with Anchovy Powder", R.drawable.img_bayam_stew_with_anchovy_powder, "tmNPzBxXVqk&pp=qAMBugMGCgJpZBAB", getIngredients(21), getSteps(21)));
            recipes.add(new Recipe("Tumis Wortel Buncis Jagung", R.drawable.img_tumis_wortel_buncis_jagung, "OtbiLNFrpYk", getIngredients(22), getSteps(22)));
            recipes.add(new Recipe("Baked Potato Wedges", R.drawable.img_baked_potato_wedges, "bf48RIGw1kw", getIngredients(23), getSteps(23)));
            recipes.add(new Recipe("Chicken Parmigiana", R.drawable.img_chicken_parmigiana, "NVmqoYEqXzI&pp=qAMBugMGCgJpZBAB", getIngredients(24), getSteps(24)));
        }

        return recipes;
    }

    private static ArrayList<String> getIngredients(int index) {
        ArrayList<String> ingredients = new ArrayList<>();
        if (index == 0) {
            ingredients.add("150 gr penne");
            ingredients.add("250 ml susu full cream");
            ingredients.add("3 buah sosis, iris");
            ingredients.add("Keju cheddar secukupnya, parut");
            ingredients.add("3 siung bawang putih, cincang");
            ingredients.add("1/4 bawang bombai, cincang");
            ingredients.add("Mentega untuk menumis");
            ingredients.add("Garam secukupnya");
            ingredients.add("Lada bubuk secukupnya");
            ingredients.add("Kaldu jamur secukupnya");
            ingredients.add("Oregano secukupnya");
        } else if (index == 1) {
            ingredients.add("150 gr fettucine");
            ingredients.add("50 gram keju cheddar parut");
            ingredients.add("1/2 buah bawang bombai, cincang");
            ingredients.add("2 butir telur, kocok lepas");
            ingredients.add("4 buah sosis sapi");
            ingredients.add("3 kuntum besar brokoli, belah ukuran kecil");
            ingredients.add("250 ml susu cair");
            ingredients.add("2 sdm fibercream");
            ingredients.add("1 sdt maizena, larutkan dengan sedikit air");
            ingredients.add("2 sdm mentega asin");
            ingredients.add("1/2 sdt oregano kering");
            ingredients.add("1/2 sdt parsley kering");
            ingredients.add("Air secukupnya");
            ingredients.add("Lada, garam himalayan, gula, dan merica");
            ingredients.add("Kaldu jamur secukupnya");
        } else if (index == 2) {
            ingredients.add("4 lembar pasta lasagna");
            ingredients.add("Topping: Keju cheddar, oregano\n");
            ingredients.add("200 gram daging giling (Bahan Saus Merah)");
            ingredients.add("Setengah bawang bombai cincang (Bahan Saus Merah)");
            ingredients.add("Oregano (Bahan Saus Merah)");
            ingredients.add("1 botol kecil saus tomat (Bahan Saus Merah)");
            ingredients.add("1/2 botol kecil saus sambal (Bahan Saus Merah)");
            ingredients.add("Garam dan gula secukupnya (Bahan Saus Merah)");
            ingredients.add("100 ml air (Bahan Saus Merah)");
            ingredients.add("3 butir bawang putih cincang (Bahan Saus Merah)");
            ingredients.add("500 ml susu cair (Bahan Saus Putih)");
            ingredients.add("Keju mozzarela (Bahan Saus Putih)");
            ingredients.add("Mentega (Bahan Saus Putih)");
            ingredients.add("Gula Secukupnya (Bahan Saus Putih)");
        } else if (index == 3) {
            ingredients.add("5-7 buah Jamur kancing");
            ingredients.add("5 butir bawang putih (iris tipis)");
            ingredients.add("Garam rendah natrium");
            ingredients.add("Kaldu jamur non MSG");
            ingredients.add("Bubuk lada hitam");
            ingredients.add("Bubuk cabai");
            ingredients.add("Minyak nabati");
            ingredients.add("Air untuk merebus mie");
            ingredients.add("2 sdm air");
        } else if (index == 4) {
            ingredients.add("150-200 gr makaroni kering");
            ingredients.add("Sedikit minyak");
            ingredients.add("Air secukupnya");
            ingredients.add("Saus bolognese");
            ingredients.add("1 sdm mentega (Saus Keju)");
            ingredients.add("2 sdm tepung terigu (Saus Keju)");
            ingredients.add("2 siung bawang putih, cincang (Saus Keju)");
            ingredients.add("Sedikit bawang bombai, cincang (Saus Keju)");
            ingredients.add("Garam, lada dan pala bubuk secukupnya (Saus Keju)");
            ingredients.add("300 ml susu cair (Saus Keju)");
            ingredients.add("100 gram keju parut (Saus Keju)");
            ingredients.add("Oregano secukupnya (Saus Keju)");
            ingredients.add("Sosis atau daging asap (Saus Keju)");
        } else if (index == 5) {
            ingredients.add("1 bungkus nutrijel mangga");
            ingredients.add("800 ml air");
            ingredients.add("5-6 sdm gula pasir");
            ingredients.add("200 ml kental manis (SKM) putih (Bahan Susu Mangga)");
            ingredients.add("2 bungkus Nutrisari sweet mango (Bahan Susu Mangga)");
            ingredients.add("1 bungkus Nutrisari sweet orange (Bahan Susu Mangga)");
            ingredients.add("1 liter air (Bahan Susu Mangga)");
            ingredients.add("6 sdm atau sesuai selera gula pasir (Bahan Susu Mangga)");
            ingredients.add("1 buah mangga, kupas, cuci bersih lalu potong bentuk dadu (Pelengkap)");
            ingredients.add("Secukupnya es batu (Pelengkap)");
        } else if (index == 6) {
            ingredients.add("1/2 gelas teh panas");
            ingredients.add("3 sdm bubuk creamer");
            ingredients.add("2 sdm gula pasir");
            ingredients.add("2 sdm susu kental manis putih");
            ingredients.add("Es batu");
        } else if (index == 7) {
            ingredients.add("1 sdm penuh kopi bubuk");
            ingredients.add("150 ml air mendidih");
            ingredients.add("50 gr gula aren/gula jawa");
            ingredients.add("50 ml air");
            ingredients.add("100 ml susu UHT/susu segar/evaporated milk");
            ingredients.add("Secukupnya es batu");
        } else if (index == 8) {
            ingredients.add("2 sachet matcha latte bubuk, dan tambahkan 50ml air panas, aduk tercampur rata, lalu tambahkan 40 ml air putih matang dingin");
            ingredients.add("1/8 sdt pasta greentea");
            ingredients.add("10 ml cooking cream");
            ingredients.add("120 ml susu UHT putih");
            ingredients.add("Es batu secukupnya");
        } else if (index == 9) {
            ingredients.add("70 gram bubuk taro");
            ingredients.add("180 ml air panas");
            ingredients.add("2-3 sendok makan creamer atau susu rendah lemak");
            ingredients.add("2-4 sendok makan gula cair atau sesuai selera");
            ingredients.add("60 gram es batu");
        } else if (index == 10) {
            ingredients.add("125 gr tepung terigu");
            ingredients.add("1 butir telur ayam, dikocok lepas");
            ingredients.add("1/4 sdt garam");
            ingredients.add("275 ml susu cair");
        } else if (index == 11) {
            ingredients.add("800 ml susu cair (Lapisan 1)");
            ingredients.add("1 bungkus agar-agar warna putih (Lapisan 1)");
            ingredients.add("150 gr gula pasir (Lapisan 1)");
            ingredients.add("25 gr bubuk cokelat warna hitam (Lapisan 1)");
            ingredients.add("100 gr dark chocolate compound (Lapisan 1)");
            ingredients.add("2 butir kuning telur (Lapisan 1)");
            ingredients.add("800 ml susu cair (Lapisan 2)");
            ingredients.add("1,5 bungkus agar-agar warna putih (Lapisan 2)");
            ingredients.add("150 gr gula pasir (Lapisan 2)");
            ingredients.add("25 gr coklat bubuk (Lapisan 2)");
            ingredients.add("50 gr dark chocolate compound (Lapisan 2)");
            ingredients.add("2 kuning telur (Lapisan 2)");
            ingredients.add("800 ml susu cair (Lapisan 3)");
            ingredients.add("1,5 bks agar-agar warna putih (Lapisan 3)");
            ingredients.add("150 gr gula pasir (Lapisan 3)");
            ingredients.add("100 gr white chocolate compound (Lapisan 3)");
            ingredients.add("2 kuning telur (Lapisan 3)");
            ingredients.add("500 ml susu cair (Vla)");
            ingredients.add("80 gr gula pasir (Vla)");
            ingredients.add("40 gr tepung maizena (Vla)");
            ingredients.add("10 sdm air (Vla)");
            ingredients.add("2 sdt rum (Vla)");
        } else if (index == 12) {
            ingredients.add("1 bungkus agar-agar (7 gr)");
            ingredients.add("800 cc air");
            ingredients.add("1 liter susu cair");
            ingredients.add("8 sdm tepung custard");
            ingredients.add("20 sdm gula pasir (sesuai selera)");
            ingredients.add("4 butir kuning telur, kocok lepas");
            ingredients.add("1/2 sdt garam");
            ingredients.add("1 sdt essence vanila");
            ingredients.add("2 sdt rum (boleh tidak memakainya)");
        } else if (index == 13) {
            ingredients.add("135 gr biskuit Oreo");
            ingredients.add("2 sdm mentega cair");
            ingredients.add("500 ml susu cair full cream (Lapisan Keju)");
            ingredients.add("2 sdm maizena (Lapisan Keju)");
            ingredients.add("100 gr keju cheddar parut (Lapisan Keju)");
            ingredients.add("5 sdm gula pasir (Lapisan Keju)");
            ingredients.add("1 sdt ekstrak vanila (Lapisan Keju");
            ingredients.add("160 ml susu cair full cream (Lapisan Cokelat)");
            ingredients.add("120 gr dark cooking chocolate (Lapisan Cokelat)");
        } else if (index == 14) {
            ingredients.add("4 telur utuh (Bahan A)");
            ingredients.add("65 gr gula (Bahan A)");
            ingredients.add("1 sdt SP (Bahan A)");
            ingredients.add("55 gr tepung protein rendah (Bahan B)");
            ingredients.add("10 gr susu bubuk (Bahan B)");
            ingredients.add("10 gr maizena (Bahan B)");
            ingredients.add("85 gr butter / margarine (Bahan C)");
            ingredients.add("150 gr gula pasir (Bahan Puding Caramel)");
            ingredients.add("600 ml susu UHT (Bahan Puding Caramel)");
            ingredients.add("2 kuning telur (Bahan Puding Caramel)");
            ingredients.add("Sejimpit garam (Bahan Puding Caramel)");
            ingredients.add("10 gr bubuk agar-agar (Bahan Puding Caramel)");
            ingredients.add("Vanila ekstrak (Bahan Puding Caramel)");
            ingredients.add("60 gr White cooking chocolate (Bahan Puding Caramel)");
            ingredients.add("150 gr gula pasir (Bahan Puding Coklat)");
            ingredients.add("600 ml susu UHT (Bahan Puding Coklat)");
            ingredients.add("15 gr bubuk coklat (Bahan Puding Coklat)");
            ingredients.add("2 kuning telur (Bahan Puding Coklat)");
            ingredients.add("Sejimpit garam (Bahan Puding Coklat)");
            ingredients.add("10 gr bubuk agar-agar (Bahan Puding Coklat)");
            ingredients.add("60 gr Dark cooking chocolate (Bahan Puding Coklat)");
        } else if (index == 15) {
            ingredients.add("2 buah jamur shiitake kering");
            ingredients.add("3 sendok makan air");
            ingredients.add("½ cup kaldu dashi");
            ingredients.add("½ paha ayam, diambil dagingnya saja");
            ingredients.add("4 buah udang");
            ingredients.add("1 sendok makan sake (bisa dihilangkan/diganti perasan jahe)");
            ingredients.add("1 buah telur (pilih yang besar)");
            ingredients.add("Jamur shimeji secukupnya");
            ingredients.add("4 iris kamaboko");
            ingredients.add("Satu buah daun bawang");
        } else if (index == 16) {
            ingredients.add("1 buah tahu sutera");
            ingredients.add("4 sendok makan tepung kantang/tepung jagung");
            ingredients.add("4 cup minyak sayur");
        } else if (index == 17) {
            ingredients.add("¼ kg Kedelai edamame (biasanya bisa dibeli dg kemasan ½ kg per pcs di pasar modern)");
            ingredients.add("1 sendok makan minyak sayur");
            ingredients.add("2 siung bawang putih, haluskan");
            ingredients.add("2 sendok teh pasta cabai (bisa diganti sambal sachet)");
            ingredients.add("1 sendok makan miso");
        } else if (index == 18) {
            ingredients.add("2 sendok makan miso (miso cair cap M1nute Miso/atau bisa diganti dg yang pasta)");
            ingredients.add("1 sendok makan gula");
            ingredients.add("1 sendok teh mirin (opsional)");
            ingredients.add("¼ sendok teh cabai bubuk");
            ingredients.add("3 buah terong ungu panjang");
            ingredients.add("1 sendok makan wijen");
            ingredients.add("1 batang daun bawang, iris tipis");
            ingredients.add("3 batang cilantro, ambil daunnya saja");
            ingredients.add("Minyak goreng");
        } else if (index == 19) {
            ingredients.add("½ kg daging ayam cincang");
            ingredients.add("1 sendok makan minyak wijen");
            ingredients.add("1 sendok makan miso");
            ingredients.add("10 buah daun perilla");
            ingredients.add("4 batang daun bawang");
            ingredients.add("Garam");
            ingredients.add("½ cup kecap manis (Saus Olesan)");
            ingredients.add("½ cup mirin (Saus Olesan)");
            ingredients.add("¼ cup sake (Saus Olesan)");
            ingredients.add("¼ cup air (Saus Olesan)");
            ingredients.add("2 sendok teh gula merah (Saus Olesan)");
        } else if (index == 20) {
            ingredients.add("1 buah kentang");
            ingredients.add("15 gr margarin");
            ingredients.add("15 gr chop bombay");
            ingredients.add("garam");
            ingredients.add("lada bubuk");
            ingredients.add("peterseli kering");
        } else if (index == 21) {
            ingredients.add("200 gr bayam pakai batangnya juga");
            ingredients.add("300 ml air");
            ingredients.add("1 sdm anchovy powder (bisa dilihat di kolom TIP)");
            ingredients.add("1/2 sdt lada bubuk");
            ingredients.add("1 sdt garam");
        } else if (index == 22) {
            ingredients.add("1 bonggol jagung");
            ingredients.add("1 buah wortel import");
            ingredients.add("1 bungkus buncis");
            ingredients.add("1 kotak kecil mentega");
            ingredients.add("Sedikit gula, garam, merica");
        } else if (index == 23) {
            ingredients.add("2 buah kentang ukuran besar");
            ingredients.add("2 sdm olive oil");
            ingredients.add("Garam");
            ingredients.add("Merica");
            ingredients.add("Dry Oregano");
            ingredients.add("Dry Parsley");
            ingredients.add("Dry Basil");
            ingredients.add("Keju parmesan untuk taburan");
        } else if (index == 24) {
            ingredients.add("150 gr Paha ayam");
            ingredients.add("1 pcs Telur");
            ingredients.add("100 gr Tepung kentucky");
            ingredients.add("100 gr Kentang (Kentang Tumbuk)");
            ingredients.add("10 gr PALMIA MARGARIN SERBAGUNA (Kentang Tumbuk)");
            ingredients.add("55 ml Susu segar (Kentang Tumbuk)");
            ingredients.add("3 gr Garam (Kentang Tumbuk)");
            ingredients.add("3 gr Merica (Kentang Tumbuk)");
            ingredients.add("50 gr Tomato concase (Campuran Sayuran)");
            ingredients.add("30 gr Keju mozarella (Campuran Sayuran)");
            ingredients.add("10 gr Jagung serut (Campuran Sayuran)");
            ingredients.add("10 gr Wortel (Campuran Sayuran)");
            ingredients.add("10 gr Buncis (Campuran Sayuran)");
        }
        return ingredients;
    }

    private static ArrayList<String> getSteps(int index) {
        ArrayList<String> steps = new ArrayList<>();
        if (index == 0) {
            steps.add("Rebus penne dengan sedikit minyak goreng dan garam, angkat lalu tiriskan.");
            steps.add("Tumis bawang putih dan bawang bombai sampai harum.");
            steps.add("Masukkan sosis, tambahkan susu full cream.");
            steps.add("Kemudian masukkan keju dan penne.");
            steps.add("Tambahkan garam, lada bubuk, serta kaldu, aduk rata dan tes rasa.");
            steps.add("Angkat, beri taburan oregano dan sajikan.");
        } else if (index == 1) {
            steps.add("Siapkan air untuk merebus air. Beri 2 sdm minyak dan garam himalayan secukupnya. Rebus fettuchine hingga matang. Angkat, tiriskan.");
            steps.add("Didihkan air lagi. Masukkan brokoli, janan terlalu matang. Angkat, tiriskan.");
            steps.add("Siapkan wajan, masukkan mentega asin. Tumis bawang bombai hingga harum.");
            steps.add("Masukkan telur, orak arik sebentar. Kemudian masukkan sosis, tumis hingga matang.");
            steps.add("Tuangkan susu. Tambahkan keju cheddar, maizena dan fibercream. Aduk hingga masak.");
            steps.add("Tambahkan lada, garam himalaya, gula, kaldu jamur dan merica secukupnya. Koreksi rasa.");
            steps.add("Aduk pelan, tambahkan oregano dan parsley.");
            steps.add("Saus udah siap. Masukkan fettuchine dan brokoli. Aduk-aduk, matikan kompor. Sajikan");
        } else if (index == 2) {
            steps.add("Buat saus merah terlebih dahulu, tumis bawang putih dengan mentega, masukan daging, bawang bombai, garam. Kemudian aduk rata.");
            steps.add("Setelah daging sudah dirasa matang, masukan saus tomat dan saus sambal, beri gula sedikit. Tambahkan sedikit oregano dan beri air 100 ml.");
            steps.add("Jika saus sudah agak mengental matikan kompor. Sisihkan");
            steps.add("Buat saus putih, panaskan mentega, masukkan susu, aduk-aduk sampai rata. Setelah itu masukkan keju mozzarela dan sedikit gula. Jika sudah kental matikan kompor.");
            steps.add("Rebus pasta lasagna hingga matang, tiriskan. Susun lembaran lasagna di cup aluminium foil ukuran persegi panjang dengan urutan pasta lasagna, saus merah dan saus putih.");
            steps.add("Diulang sampai posisi atas saus putih. Kemudian taburkan keju parut dan oregano.");
            steps.add("Masukan ke oven dengan suhu panas. Jika sudah agak kecoklatan, keluarkan dari oven dan sajikan.");
        } else if (index == 3) {
            steps.add("Rebus spaghetti sampai agak lunak 8-10 menit, angkat. Sisihkan.");
            steps.add("Tumis bawang putih dengan minyak nabati sampai harum, masukkan jamur aduk-aduk sampai setengah matang.");
            steps.add("Kemudian masukkan air 2 sendok makan agar spaghetti tidak lengket, lalu masukkan bumbu, garam, kaldu jamur dan bubuk lada hitam, bubuk cabai, aduk rata.");
            steps.add("Kemudian masukkan spaghetti, aduk sampai rata. Koreksi rasa.");
            steps.add("Angkat dan sajikan di piring saji.");
        } else if (index == 4) {
            steps.add("Rebus macaroni dengan sedikit minyak, angkat dan tiriskan");
            steps.add("Buat saus, panaskan mentega hingga meleleh, tambahkan bawang putih dan bawang bombai, tunggu hingga harum.");
            steps.add("Lalu tambahkan sosis atau daging asap, masak hingga matang dan tambahkan tepung terigu, aduk rata sambil ditambahkan susu cair sedikit demi sedikit hingga larutan rata dan tidak menggumpal.");
            steps.add("Kemudian tambahkan garam, lada, pala dan oregano. Terakhir masukkan keju parut dan macaroni, aduk rata. Masak hingga keju meleleh dan mengental, angkat.");
            steps.add("Tuang makaroni ke dalam mangkuk selang seling dengan saus bolognese. Tambahkan keju dan oregano di atasnya, panggang.");
            steps.add("Sajikan hangat.");
        } else if (index == 5) {
            steps.add("JELLY: campur semua bahan jelly, masak sampai mendidih. Lalu tuang di wadah dan masukkan kulkas. Setelah dingin, potong-potong bentuk dadu, sisihkan.");
            steps.add("SUSU MANGGA: campur kental manis (SKM), gula dan air lalu masak sampai mendidih. Biarkan uapnya hilang, baru masukkan Nutrisari sweet mango dan orange, aduk rata, biarkan dingin.");
            steps.add("PENYAJIAN: masukkan potongan jelly dan mangga ke dalam gelas. Lalu tuang susu mangga ke dalam gelas, beri es batu secukupnya. Nikmati segarnya es susu mangga jelly.");
        } else if (index == 6) {
            steps.add("Aduk bubuk creamer dan gula pasir ke dalam teh panas lalu tambahkan susu kental manis tes rasa tambahkan es batu sesuai selera sajikan dingin.");
        } else if (index == 7) {
            steps.add("Masak gula aren hingga mendidih dan gula larut, sisihkan.");
            steps.add("Seduh kopi dengan air mendidih, tunggu hingga hangat, tuang 4 sdm atau secukupnya cairan gula, masukkan es batu, tuang susu lanjut tuang kopi tanpa ampas. Aduk.");
            steps.add("Sajikan.");
        } else if (index == 8) {
            steps.add("Siapkan gelas bening kaca kapasitas 650 ml.");
            steps.add("Ambil 2 sdm penuh boba tanpa sirupnya, letakkan ke dasar gelas.");
            steps.add("Tambahkan es batu hingga 1/2 gelas penuh, lalu tuang pelan campuran susu.");
            steps.add("Tambahkan lagi es batu hingga 3/4 penuh, lalu tuang matcha latte perlahan.");
            steps.add("Tambahkan lagi es batu dan hias dgn boba atasnya atau bisa juga disajikan seperti tampak di foto.");
            steps.add("Setelah boba lalu beri es batu, tuang matcha latte dahulu baru bahan susunya.");
            steps.add("Siap disajikan.");
        } else if (index == 9) {
            steps.add("Larutkan bubuk taro dengan air panas, aduk hingga larut.");
            steps.add("Tuangkan ke dalam gelas shaker atau gelas tertutup. Tambahkan creamer, es batu, dan gula cair.");
            steps.add("Kocok hingga semua campuran tersebut menyatu.");
            steps.add("Taro milk tea siap disajikan di gelas. Kamu bisa menambahkan topping sesuai selera.");
            steps.add("Sajikan di atas bubble yang sudah disiapkan dalam gelas saji.");
        } else if (index == 10) {
            steps.add("Campurkan tepung terigu, garam dan telur jadi satu.");
            steps.add("Tambahkan susu cair secara perlahan sambil diaduk-aduk. Kemudian disaring.");
            steps.add("Dadar di tempat penggoreng sampai adonan habis.");
            steps.add("Isi kulit pancake dengan whipping cream dan mangga, lipat seperti amplop.");
            steps.add("Simpan pancake di kulkas. Pancake mangga enak dimakan dalam kondisi dingin.");
        } else if (index == 11) {
            steps.add("Siapkan loyang kotak ukuran 22x7 cm.");
            steps.add("Lapisan 1: campur semua bahan ke dalam panci, aduk-aduk dengan whisk hingga tercampur rata. Nyalakan api masak hingga mendidih sambil terus diaduk. Angkat. Tuang ke dalam loyang. Sisihkan.");
            steps.add("Lapisan 2: campur semua bahan ke dalam panci, aduk-aduk dengan whisk hingga tercampur rata. Nyalakan api masak hingga mendidih sambil terus diaduk. Angkat. Tuang ke atas lapisan pertama secara perlahan");
            steps.add("Lapisan 3: campur semua bahan ke dalam panci, aduk-aduk dengan whisk hingga tercampur rata. Nyalakan api masak hingga mendidih sambil terus diaduk. Angkat. Tuang ke atas lapisan kedua secara perlahan");
            steps.add("Masukkan ke dalam kulkas. Diamkan hingga mengeras");
            steps.add("Vla: Masukkan susu cair dan gula pasir ke dalam panci lalu masak hingga mendidih sambil terus diaduk. Larutkan maizena dengan sedikit air, kemudian tuang ke dalam panci. Aduk cepat hingga meletup-letup. Kemudian saring supaya vla benar-benar lembut.");
        } else if (index == 12) {
            steps.add("Campur semua bahan ke dalam panci kecuali rum, aduk rata");
            steps.add("Panaskan di atas kompor dengan api sedang sambil terus diaduk hingga mendidih dan mengental. Matikan api dan tambahkan rum, aduk terus sampai agak dingin");
            steps.add("Tuang ke dalam cetakan dan biarkan beku. Hias atasnya dengan buah");
            steps.add("Siap dihidangkan.");
        } else if (index == 13) {
            steps.add("Hancurkan kasar biskuit oreo bersama krimnya, campur dengan mentega cair dan letakkan di bagian dasar cup");
            steps.add("Campur maizena dengan sedikit susu aduk dengan whisk hingga rata, masukkan gula aduk rata, tuang sisa susu dan masukkan keju parut, masak di api kecil sambil terus diaduk hingga mengental tuang di atas remukan biskuit Oreo, dinginkan.");
            steps.add("Masak susu cair dan dcc di api kecil hingga semua coklat meleleh, tuang di atas lapisan keju perlahan dengan sendok, tunggu hingga uap panas hilang masukkan dalam kulkas, sajikan dalam keadaan dingin.");
        } else if (index == 14) {
            steps.add("[Part 1] Panaskan oven dengan suhu 170 derajat Celcius.");
            steps.add("Kocok bahan A hingga putih mengembang, masukkan bahan B secara bertahap hingga rata, matikan mixer, masukma bahan C, lalu aduk balik dengan spatula hingga rata.");
            steps.add("Tuang kedalam loyang, dan panggang kurang lebih 25 menit. Setelah matang, balikkan , keluarkan dr loyang, tunggu hingga dingin.");
            steps.add("Potong cake seukuran loyang 22x22x7.");
            steps.add("[Part 2] Membuat karamel: siapkan wajan anti lengket, panaskan gula pasir hingga kecoklatan dan menjadi karamel, matikan api");
            steps.add("Sisihkan tunggu sampai karamel tidak panas, ambil 300 ml susu, masukkan kedalam gula karamel, masak dgn api kecil hingga gula menjadi larut. Saring");
            steps.add("Kocok lepas kuning telur, tuang susu cair susu cair aduk rata. Kemudian masukkan susu karamel , agar agar, sejimpit garam, dan vanila. Masak dengan api sedang, masukkan coklat putih, aduk terus hingga matang, sisihkan");
            steps.add("Siapkan loyang ukuran 22x22x7, alasi dasarnya dengan plastik/non stick baking paper");
            steps.add("Masukkan cake pada dasar loyang, kemudian tuang agar agar karamel. Tunggu hingga agak mengeras. Kemudian tuang dengan puding coklat");
            steps.add("[Part 3] Campur susu, gula, bubuk agar, garam, aduk hingga bahan larut");
            steps.add("Kemudian kocok lepas kuning telur, masukan");
            steps.add("Masak dengan api sedang dan Aduk rata");
            steps.add("Lalu masuukan cokelat bubuk, aduk hingga larut dan menyusul DCC");
            steps.add("Masak hingga berbuih kecil. Matikan");
        } else if (index == 15) {
            steps.add("Rendam jamur shiitake kering dengan air lalu setelah mengembang pisahkan airnya. Campur air dengan kaldu dashi, lalu sisihkan.");
            steps.add("Rendam ayam yang telah dipotong kecil dan udang ke dalam sake salam 15 menit. Gunanya agar bau amisnya hilang.");
            steps.add("Pecahkan telur ke dalam mangkok bersih. Masukkan kaldu dashi dan bumbu. Aduk sampai tercampur rata. Lalu saring.");
            steps.add("Panaskan air dalam panci. Kira-kira sampai setinggi setengah cup tempat chawanmushi.");
            steps.add("Masukkan bahan-bahan kedalam cup, lalu siram dengan kocokan telur. Lalu tutup (atau bisa diganti dengan aluminium foil kalau cupnya tidak memiliki tutup)");
            steps.add("Letakkan cup berisi bahan ke dalam panci berisi air panas (Bukan mendidih). Lalu biarkan sampai 30 menit dengan api kecil. Jaga air agar tidak terlalu mendidih.");
            steps.add("Jika telah matang angkat dan sajikan dengan topping.");
        } else if (index == 16) {
            steps.add("Keringkan tahu dengan paper towels sekitar 15 menit.");
            steps.add("Iris iris daun bawang dan daikon.");
            steps.add("Masukkan kaldu dashi, kecap dan mirin ke dalam panci kecil. Biarkan sampai mendidih lalu matikan api.");
            steps.add("Potong tahu menjadi 8 bagian kecil, lalu selimuti dengan tepung kentang dan goreng dengan minyak panas sampai berwarna kecokelatan, tiriskan.");
            steps.add("Tata tahu ke dalam piring sajian lalu tuang saus diatasnya. Taburi dengan topping sesuai selera.");
        } else if (index == 17) {
            steps.add("Siapkan edamame frozen yang sudah dipanaskan ke dalam wadah");
            steps.add("Panaskan minyak untuk menumis bawang putih dan pasta cabai sampai harum. Lalu masukkan miso.");
            steps.add("Angkat bumbu dan campurkan ke wadah edamame. Mix sampai merata.");
        } else if (index == 18) {
            steps.add("Campurkan miso, mirin, gula dan cabai kering ke dalam mangkuk.");
            steps.add("Cuci bersih terong lalu potong menjadi 2 bagian memanjang, lalu buat guratan di setiap potongan agar bumbu meresap.");
            steps.add("Siapkan broiler atau kalau nggak ada bisa diganti wajan anti lengket, beri minyak sedikit.");
            steps.add("Panggang terong sambil dilumuri bumbu secara merata, bolak balik sampai sisi terong terlihat cokelat matang (sekitar 5 menit)");
            steps.add("Angkat, sajikan dengan taburan daun bawang, cilantro dan wijen.");
        } else if (index == 19) {
            steps.add("Siapkan bahan dan tusuk sate yang sudah dibersihkan");
            steps.add("Iris daun bawang dan perilla tipis-tipis");
            steps.add("Panaskan wajan anti lengket, tumis setengah bagian daging sampai matang. (jangan sampai gosong ya)");
            steps.add("Campurkan daging ayam yang sudah matang dengan yang mentah. Tambahkan minyak wijen dan miso. Uleni hingga merata dengan spatula.");
            steps.add("Tambahkan lagi dedaunan yang telah di iris tipis dan uleni dengan tangan sebanyak 30 kali sampai banar-benar tercampur semua.");
            steps.add("Ambil satu sendok besar bahan, lalu bentuk memanjang dengan tangan. Tusuk bagian tengah dengan tusuk sate.");
            steps.add("Siapkan pemanggang, jejer tsukune ke dalam pemanggang yang sudah panas, taburi dengan garam. Panggang sampai kedua sisi berwarna cokelat.");
            steps.add("Angkat dan sajikan.");
        } else if (index == 20) {
            steps.add("Rebus kentang beserta kulitnya, lalu kupas");
            steps.add("Potong bulat dengan teknik sliced. Dengan ketebalan 3mm");
            steps.add("Panaskan margarine, masukan kentang dan chop onion");
            steps.add("Bumbui dengan garam + lada + dan peterseli kering");
            steps.add("Masak sampai kentang kecoklatan dan sajikan.");
        } else if (index == 21) {
            steps.add("Cuci bersih bayam. Buang batang yang ujungnya saja.");
            steps.add("Panaskan Air dan jika sudah mendidih masukkan bumbunya. Aduk. Lalu masukkan bayamnya. Setelah bayam layu dan mulai empuk angkat lalu tiriskan. Setelah dingin potong2 seperti di gambar. Dan bisa dihidangkan dengan sanjian utama lainnya.");
        } else if (index == 22) {
            steps.add("Pipil jagung, potong buncis 3 bagian dan wortel potong korek api. Siapkan air, masukkan jagung dan wortel tunggu sekitar 7 menit, baru masukkan buncis. Dan aduk 10x, matikan api. Buang airnya lalu sisihkan");
            steps.add("Beri mentega di wajan, masukkan semua bahan yg sudah kita rebus, beri gula dan sedikit garam dan merica. Aduk-aduk sebentar sekitar 1 menit. Matikan api");
            steps.add("Simpan di wadah tertutup dan sajikan bersama steak (kalau saya untuk nasi goreng bistik, ada di postingan sebelumnya)");
        } else if (index == 23) {
            steps.add("Potong-potong kentang, cuci bersih dan keringkan");
            steps.add("Tata kentang pada pinggan tahan panas, taburi olive oil, taburi garam, merica, oregano, basil dan parsley");
            steps.add("Panggang dalam suhu 200 derajat celcius, selama kurang lebih 45 menit.");
            steps.add("Setelah matang angkat, dan sajikan, taburi parmesan diatasnya");
        } else if (index == 24) {
            steps.add("Bumbui paha ayam, lalu lumuri dengan telur dan masukkan dalam tepung kentucky, kemudian goreng hingga matang.");
            steps.add("Buat kentang tumbuk, masukkan PALMIA MARGARIN SERBAGUNA, susu segar, garam, merica, pala bubuk dan terakhir kentang yang telah dihaluskan.");
            steps.add("Tumis bawang dengan PALMIA MARGARIN SERBAGUNA lalu masukkan campuran sayuran, tumis hingga merata.");
            steps.add("Kemudian siapkan tomat concase.");
            steps.add("Penyajian, kentang tumbuk kita taruh di tengah piring, di atasnya kita letakkan paha ayam yang telah matang, lalu topping dengan tomat concase dan keju mozarella, kemudian dioven.");
        }
        return steps;
    }
}
