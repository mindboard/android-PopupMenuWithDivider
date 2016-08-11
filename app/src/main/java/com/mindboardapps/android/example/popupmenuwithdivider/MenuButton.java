package com.mindboardapps.android.example.popupmenuwithdivider;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.Button;

public class MenuButton extends Button {

    public MenuButton(Context ctx, AttributeSet attributeSet) {
        super(ctx, attributeSet);

        float density =  getContext().getResources().getDisplayMetrics().density;

        //setBackground(new ColorDrawable(Color.WHITE));
        setBackground(new ColorDrawable(Color.TRANSPARENT));
        setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

        int padding = (int) (25*density);
        int left = padding;
        int top = 0;
        int right = padding;
        int bottom = 0;

        setPadding(left,top,right,bottom);
    }

    @Override
    public boolean performClick() {
        playSoundEffect(SoundEffectConstants.CLICK);
        return super.performClick();
    }
}
