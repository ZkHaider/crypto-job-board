package com.cryptojobboard.cryptojobboard;

//package com.zkhaider.red_code.ui;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FiveStarsFragment extends Fragment {


    // Star icons
    private ImageView star1;
    private ImageView star2;
    private ImageView star3;
    private ImageView star4;
    private ImageView star5;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_rate_employee, null);

        // Declare the stars by Id
        star1 = (ImageView) root.findViewById(R.id.star1);
        star2 = (ImageView) root.findViewById(R.id.star2);
        star3 = (ImageView) root.findViewById(R.id.star3);
        star4 = (ImageView) root.findViewById(R.id.star4);
        star5 = (ImageView) root.findViewById(R.id.star5);

        double score = 3.5;

        changeStarIcons(score);

        return root;
    }


    private void changeStarIcons(double score) {

        if (score == 0) {
            star1.setImageResource(R.drawable.ic_toggle_star_outline);
            star2.setImageResource(R.drawable.ic_toggle_star_outline);
            star3.setImageResource(R.drawable.ic_toggle_star_outline);
            star4.setImageResource(R.drawable.ic_toggle_star_outline);
            star5.setImageResource(R.drawable.ic_toggle_star_outline);
        } else if (score < 0) {
            star1.setImageResource(R.drawable.ic_toggle_star_half);
            star2.setImageResource(R.drawable.ic_toggle_star_outline);
            star3.setImageResource(R.drawable.ic_toggle_star_outline);
            star4.setImageResource(R.drawable.ic_toggle_star_outline);
            star5.setImageResource(R.drawable.ic_toggle_star_outline);
        } else if (score == 1) {
            star1.setImageResource(R.drawable.ic_toggle_star);
            star2.setImageResource(R.drawable.ic_toggle_star_outline);
            star3.setImageResource(R.drawable.ic_toggle_star_outline);
            star4.setImageResource(R.drawable.ic_toggle_star_outline);
            star5.setImageResource(R.drawable.ic_toggle_star_outline);
        } else if (score < 2 && score > 1) {
            star1.setImageResource(R.drawable.ic_toggle_star);
            star2.setImageResource(R.drawable.ic_toggle_star_half);
            star3.setImageResource(R.drawable.ic_toggle_star_outline);
            star4.setImageResource(R.drawable.ic_toggle_star_outline);
            star5.setImageResource(R.drawable.ic_toggle_star_outline);
        } else if (score == 2) {
            star1.setImageResource(R.drawable.ic_toggle_star);
            star2.setImageResource(R.drawable.ic_toggle_star);
            star3.setImageResource(R.drawable.ic_toggle_star_outline);
            star4.setImageResource(R.drawable.ic_toggle_star_outline);
            star5.setImageResource(R.drawable.ic_toggle_star_outline);
        } else if (score > 2 && score < 3) {
            star1.setImageResource(R.drawable.ic_toggle_star);
            star2.setImageResource(R.drawable.ic_toggle_star);
            star3.setImageResource(R.drawable.ic_toggle_star_half);
            star4.setImageResource(R.drawable.ic_toggle_star_outline);
            star5.setImageResource(R.drawable.ic_toggle_star_outline);
        } else if (score == 3) {
            star1.setImageResource(R.drawable.ic_toggle_star);
            star2.setImageResource(R.drawable.ic_toggle_star);
            star3.setImageResource(R.drawable.ic_toggle_star);
            star4.setImageResource(R.drawable.ic_toggle_star_outline);
            star5.setImageResource(R.drawable.ic_toggle_star_outline);
        } else if (score > 3 && score < 4) {
            star1.setImageResource(R.drawable.ic_toggle_star);
            star2.setImageResource(R.drawable.ic_toggle_star);
            star3.setImageResource(R.drawable.ic_toggle_star);
            star4.setImageResource(R.drawable.ic_toggle_star_half);
            star5.setImageResource(R.drawable.ic_toggle_star_outline);
        } else if (score == 4) {
            star1.setImageResource(R.drawable.ic_toggle_star);
            star2.setImageResource(R.drawable.ic_toggle_star);
            star3.setImageResource(R.drawable.ic_toggle_star);
            star4.setImageResource(R.drawable.ic_toggle_star);
            star5.setImageResource(R.drawable.ic_toggle_star_outline);
        } else if (score > 4 && score < 5) {
            star1.setImageResource(R.drawable.ic_toggle_star);
            star2.setImageResource(R.drawable.ic_toggle_star);
            star3.setImageResource(R.drawable.ic_toggle_star);
            star4.setImageResource(R.drawable.ic_toggle_star);
            star5.setImageResource(R.drawable.ic_toggle_star_half);
        } else if (score == 5) {
            star1.setImageResource(R.drawable.ic_toggle_star);
            star2.setImageResource(R.drawable.ic_toggle_star);
            star3.setImageResource(R.drawable.ic_toggle_star);
            star4.setImageResource(R.drawable.ic_toggle_star);
            star5.setImageResource(R.drawable.ic_toggle_star);
        }

    }


    @Override
    public void onResume() {
        super.onResume();
        Context context = getActivity();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

}
