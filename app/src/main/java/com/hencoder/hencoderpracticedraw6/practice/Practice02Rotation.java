package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice02Rotation extends RelativeLayout {
    Button animateBt;
    ImageView imageView;

    public Practice02Rotation(Context context) {
        super(context);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    int clickCount;

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        final ViewPropertyAnimator animate = imageView
                .animate()
                .setDuration(1000);
        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                // // TODO 在这里处理点击事件，通过 View.animate().rotation/X/Y() 来让 View 旋转
                switch (clickCount) {
                    case 0:
                        animate.rotation(180f);
                        break;
                    case 1:
                        animate.rotation(0.0f);
                        break;
                    case 2:
                        animate.rotationX(180f);
                        break;
                    case 3:
                        animate.rotationX(0.0f);
                        break;
                    case 4:
                        animate.rotationY(180f);
                        break;
                    case 5:
                        animate.rotationY(0.0f);
                        clickCount = -1;
                        break;
                }

                clickCount++;
            }
        });
    }
}