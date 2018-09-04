package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.ViewFilter;

/* compiled from: PG */
public class BitmapTarget extends ViewFilter {
    public Handler mHandler = null;
    public ImageView mImageView = null;
    public BitmapListener mListener = null;

    /* compiled from: PG */
    public interface BitmapListener {
        void onReceivedBitmap(Bitmap bitmap);
    }

    public BitmapTarget(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        return new Signature().addInputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 1)).disallowOtherPorts();
    }

    public void onBindToView(View view) {
        if (view instanceof ImageView) {
            this.mImageView = (ImageView) view;
            return;
        }
        throw new IllegalArgumentException("View must be an ImageView!");
    }

    protected void onProcess() {
        final Bitmap toBitmap = getConnectedInputPort("image").pullFrame().asFrameImage2D().toBitmap();
        ImageView imageView = this.mImageView;
        if (imageView != null) {
            imageView.post(new Runnable() {
                public void run() {
                    BitmapTarget.this.mImageView.setImageBitmap(toBitmap);
                }
            });
        }
        BitmapListener bitmapListener = this.mListener;
        if (bitmapListener == null) {
            return;
        }
        if (this.mHandler != null) {
            postBitmapToUiThread(toBitmap);
        } else {
            bitmapListener.onReceivedBitmap(toBitmap);
        }
    }

    private void postBitmapToUiThread(final Bitmap bitmap) {
        this.mHandler.post(new Runnable() {
            public void run() {
                BitmapTarget.this.mListener.onReceivedBitmap(bitmap);
            }
        });
    }

    public void setListener(BitmapListener bitmapListener, boolean z) {
        if (isRunning()) {
            throw new IllegalStateException("Attempting to bind filter to callback while it is running!");
        }
        this.mListener = bitmapListener;
        if (!z) {
            return;
        }
        if (Looper.myLooper() == null) {
            throw new IllegalArgumentException("Attempting to set callback on thread which has no looper!");
        }
        this.mHandler = new Handler();
    }
}
