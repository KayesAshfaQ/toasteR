package com.kayes.custom_toaster;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

public class ToasteR {

    public static void toasterError(Context context, String text) {
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);

        //inflate view
        View custom_view = LayoutInflater.from(context).inflate(R.layout.toast_layout, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(text);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_close);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(context.getResources().getColor(R.color.red));

        toast.setView(custom_view);
        toast.show();
    }

    public static void toasterSuccess(Context context, String text) {
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);

        //inflate view
        View custom_view = LayoutInflater.from(context).inflate(R.layout.toast_layout, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(text);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_success);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(context.getResources().getColor(R.color.green));

        toast.setView(custom_view);
        toast.show();
    }

    public static void toasterWarn(Context context, String text) {
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);

        //inflate view
        View custom_view = LayoutInflater.from(context).inflate(R.layout.toast_layout, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(text);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_warn_outline);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(context.getResources().getColor(R.color.blue));

        toast.setView(custom_view);
        toast.show();
    }

}
