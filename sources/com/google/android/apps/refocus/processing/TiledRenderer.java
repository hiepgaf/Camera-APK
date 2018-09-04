package com.google.android.apps.refocus.processing;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.google.android.apps.refocus.image.BitmapNative;
import com.google.android.apps.refocus.image.RGBZ;
import com.google.android.apps.refocus.processing.Tiler.Tile;
import java.util.ArrayList;

/* compiled from: PG */
public class TiledRenderer {
    public final Options options;
    public final Renderer renderer;

    /* compiled from: PG */
    public class Options {
        public float endProgress = 1.0f;
        public float startProgress = 0.0f;
    }

    public TiledRenderer(Options options, Renderer renderer) {
        this.options = options;
        this.renderer = renderer;
    }

    private static DepthOfFieldOptions getTile(DepthOfFieldOptions depthOfFieldOptions, Tile tile) {
        RGBZ rgbz = depthOfFieldOptions.rgbz;
        Bitmap createBitmap = Bitmap.createBitmap(tile.width, tile.height, Config.ARGB_8888);
        BitmapNative.getRegion(rgbz.getBitmap(), tile.left, tile.top, createBitmap);
        DepthOfFieldOptions depthOfFieldOptions2 = new DepthOfFieldOptions(new RGBZ(createBitmap, depthOfFieldOptions.rgbz.getDepthTransform()), LfuScheduler.MAX_PRIORITY);
        depthOfFieldOptions2.blurInfinity = depthOfFieldOptions.blurInfinity;
        depthOfFieldOptions2.depthOfField = depthOfFieldOptions.depthOfField;
        depthOfFieldOptions2.focalDepth = depthOfFieldOptions.focalDepth;
        return depthOfFieldOptions2;
    }

    public Bitmap render(DepthOfFieldOptions depthOfFieldOptions, ProgressCallback progressCallback) {
        int width = depthOfFieldOptions.rgbz.getWidth();
        int height = depthOfFieldOptions.rgbz.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
        ArrayList computeTiling = Tiler.computeTiling(Tiler.DEFAULT_OPTIONS, width, height);
        Options options = this.options;
        float f = options.endProgress - options.startProgress;
        for (int i = 0; i < computeTiling.size(); i++) {
            int i2;
            float size = this.options.startProgress + ((((float) i) * f) / ((float) computeTiling.size()));
            progressCallback.setRange(size, (f / ((float) computeTiling.size())) + size);
            Tile tile = (Tile) computeTiling.get(i);
            Bitmap render = this.renderer.render(getTile(depthOfFieldOptions, tile), progressCallback);
            if (tile.top != 0) {
                i2 = Tiler.DEFAULT_OPTIONS.apron;
            } else {
                i2 = 0;
            }
            if (tile.left != 0) {
                height = Tiler.DEFAULT_OPTIONS.apron;
            } else {
                height = 0;
            }
            BitmapNative.setRegion(render, height, i2, createBitmap, tile.left + height, tile.top + i2);
        }
        return createBitmap;
    }
}
