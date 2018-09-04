package com.google.android.apps.refocus.image;

/* compiled from: PG */
public interface DepthTransform {
    float getFar();

    String getFormat();

    float getNear();

    int quantize(float f);

    float reconstruct(int i);
}
