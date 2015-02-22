package com.ron.mycompany;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

class DrawerItemClickListener implements ListView.OnItemClickListener {
    @Override
    public void onItemClick(
        AdapterView<?> parent, View view, int position, long id) {
        Intent intent = null;
        Context context = view.getContext();
        switch (position) {
            case 0:
                intent = new Intent(context, MainActivity.class);
                context.startActivity(intent);
                break;
            case 1:
                intent = new Intent(context, ActivityNews.class);
                context.startActivity(intent);
                break;
            case 2:
                intent = new Intent(context, ActivityContacts.class);
                context.startActivity(intent);
                break;
            default:
                break;
        }
    }
}
