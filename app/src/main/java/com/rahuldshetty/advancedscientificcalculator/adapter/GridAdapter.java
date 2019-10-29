package com.rahuldshetty.advancedscientificcalculator.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.rahuldshetty.advancedscientificcalculator.R;
import com.rahuldshetty.advancedscientificcalculator.activities.UnitsActivity;

public class GridAdapter extends BaseAdapter {

    private Context context;

    private int image_list[] = {
            R.drawable.standard,
            R.drawable.complex,
            R.drawable.matrix,
            R.drawable.base,
            R.drawable.table,
            R.drawable.equation,
            R.drawable.units,
            R.drawable.calculus,
            R.drawable.misc
    };

    private String titles[] = {
            "Standard", //0
            "Complex", // 1
            "Matrix", // 2
            "Base", //3
            "Table", // 4
            "Equation", //5
            "Units", //6
            "Calculus", // 7
            "Miscellaneous" //8
    };

    public GridAdapter(Context c){
        context = c;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView = (LayoutInflater.from(context)).inflate(R.layout.grid_single_item,null);
        ImageView imageView = convertView.findViewById(R.id.grid_image);
        TextView textView = convertView.findViewById(R.id.grid_text);

        imageView.setImageResource(image_list[position]);
        textView.setText(titles[position]);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position)
                {
                    case 6:
                        // units
                        Intent i = new Intent(context.getApplicationContext(), UnitsActivity.class);
                        context.startActivity(i);
                        break;

                    default:

                }
            }
        });

        return convertView;
    }
}
