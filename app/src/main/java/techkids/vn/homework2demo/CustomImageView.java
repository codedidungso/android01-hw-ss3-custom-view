package techkids.vn.homework2demo;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;
import android.widget.ImageView;

/**
 * Created by Admins on 9/28/2017.
 */

public class CustomImageView extends ImageView {
    private static final String TAG = CustomImageView.class.toString();

    // Simple constructor to use when creating a view from code.
    public CustomImageView(Context context) {
        super(context);

        Log.d(TAG, "SquareImageView: ");
    }

    // Called when the view should render its content.
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Log.d(TAG, "onDraw: ");
    }

    // Called to determine the size requirements for this view and all of its children.
    // Can be called many times.
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.d(TAG, "onMeasure (1): " + MeasureSpec.getSize(widthMeasureSpec) + " " + MeasureSpec.getSize(heightMeasureSpec));

        int width = getMeasuredWidth();
        setMeasuredDimension(width, width / 2);

        Log.d(TAG, "onMeasure (2): " + getMeasuredWidth() + " " + getMeasuredHeight());
    }

    // Called when this view should assign a size and position to all of its children.
    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

        Log.d(TAG, "onLayout: " + left + " " + top + " " + right + " " + bottom);
    }

    // Called when the size of this view has changed.
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        Log.d(TAG, "onSizeChanged: " + "old: " + oldw + " " + oldh + "  new: " + w + " " + h);
    }

    // Called when the view is attached to a window.
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        Log.d(TAG, "onAttachedToWindow: ");
    }
}
