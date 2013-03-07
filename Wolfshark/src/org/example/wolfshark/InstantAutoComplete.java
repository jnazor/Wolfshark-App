package org.example.wolfshark;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.AutoCompleteTextView;


//Most of the code for this class has been written by the user Destil, 
//posted to StackOverflow on April 25, 2011, and can be found at:
//http://stackoverflow.com/questions/2126717/android-autocompletetextview-show-suggestions-when-no-text-entered
//  - as of February 26, 2013
public class InstantAutoComplete extends AutoCompleteTextView {

    public InstantAutoComplete(Context context) {
        super(context);
    }

    public InstantAutoComplete(Context arg0, AttributeSet arg1) {
        super(arg0, arg1);
    }

    public InstantAutoComplete(Context arg0, AttributeSet arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @Override
    public boolean enoughToFilter() {
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
    	requestFocus();
    	setText("");
    	showDropDown();
    	return true;
    }
    @Override
    protected void onFocusChanged(boolean focused, int direction,
            Rect previouslyFocusedRect) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        if (focused) {
            performFiltering(getText(), 0);
            //showDropDown();
        } 
    }
} 