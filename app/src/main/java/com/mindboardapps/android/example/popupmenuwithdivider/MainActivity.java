package com.mindboardapps.android.example.popupmenuwithdivider;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;

/**
 * Copyright © 2017 tomoaki oshima All Rights Reserved.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    private View popupLayout;
    private View getPopupLayout(){
        if( popupLayout==null ){
            popupLayout = getLayoutInflater().inflate(R.layout.popup_menu, null);

            Button newButton = (Button)popupLayout.findViewById(R.id.action_new);

            newButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.i("CHK9","new button is clicked");
                }
            });

        }
        return popupLayout;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if( item!=null && item.getItemId()==R.id.file_menu ) {
            PopupWindow popupWindow = new PopupWindow(this);
            popupWindow.setBackgroundDrawable(new ColorDrawable(Color.WHITE));

            popupWindow.setWidth(WindowManager.LayoutParams.WRAP_CONTENT);
            popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);

            View popupLayout = getPopupLayout();
            popupWindow.setContentView(popupLayout);

            popupWindow.setOutsideTouchable(true);
            popupWindow.setTouchable(true);
            popupWindow.setFocusable(true);

            popupWindow.showAsDropDown(findViewById(R.id.file_menu));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
