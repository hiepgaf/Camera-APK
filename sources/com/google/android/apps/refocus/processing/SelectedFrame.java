package com.google.android.apps.refocus.processing;

import com.google.android.apps.refocus.image.ColorImage;
import p000.bli;

/* compiled from: PG */
public class SelectedFrame implements Comparable {
    public static final String TAG = bli.m862a("SelectedFrame");
    public float gradient;
    public ColorImage image;
    public float progress;

    public SelectedFrame(float f, float f2) {
        this.image = null;
        update(f, f2);
    }

    public SelectedFrame(float f, float f2, ColorImage colorImage) {
        update(f, f2, colorImage);
    }

    public int compareTo(SelectedFrame selectedFrame) {
        float f = this.progress;
        float f2 = selectedFrame.progress;
        if (f >= f2) {
            return f != f2 ? 1 : 0;
        } else {
            return -1;
        }
    }

    public void update(float f, float f2) {
        this.gradient = f2;
        this.progress = f;
    }

    public void update(float f, float f2, ColorImage colorImage) {
        update(f, f2);
        ColorImage colorImage2 = this.image;
        if (colorImage2 == null || colorImage2.getBuffer().length != colorImage.getBuffer().length) {
            this.image = new ColorImage(colorImage.getWidth(), colorImage.getHeight(), colorImage.getFormat(), new byte[colorImage.getBuffer().length]);
        }
        if (!this.image.swapBuffers(colorImage)) {
            bli.m866b(TAG, "Error swapping buffers");
        }
    }
}
