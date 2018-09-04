package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Size;

/* compiled from: PG */
/* renamed from: hid */
public final class hid {
    /* renamed from: a */
    private static final String f6222a = bli.m862a("BitmapUtil");

    /* renamed from: a */
    public static Bitmap m3168a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int max = Math.max(1, drawable.getIntrinsicWidth());
        int max2 = Math.max(1, drawable.getIntrinsicHeight());
        Bitmap createBitmap = Bitmap.createBitmap(max, max2, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, max, max2);
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m3166a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        String str = f6222a;
        StringBuilder stringBuilder = new StringBuilder(50);
        stringBuilder.append("cropCenterBitmap srcBitmap=");
        stringBuilder.append(width);
        stringBuilder.append("x");
        stringBuilder.append(height);
        bli.m871d(str, stringBuilder.toString());
        if (width >= height) {
            str = f6222a;
            stringBuilder = new StringBuilder(50);
            stringBuilder.append("cropCenterBitmap dstBitmap=");
            stringBuilder.append(height);
            stringBuilder.append("x");
            stringBuilder.append(height);
            bli.m871d(str, stringBuilder.toString());
            return Bitmap.createBitmap(bitmap, (width / 2) - (height / 2), 0, height, height);
        }
        str = f6222a;
        stringBuilder = new StringBuilder(50);
        stringBuilder.append("cropCenterBitmap dstBitmap=");
        stringBuilder.append(width);
        stringBuilder.append("x");
        stringBuilder.append(width);
        bli.m871d(str, stringBuilder.toString());
        return Bitmap.createBitmap(bitmap, 0, (height / 2) - (width / 2), width, width);
    }

    /* renamed from: b */
    public static Bitmap m3170b(Drawable drawable) {
        return hid.m3168a(drawable);
    }

    /* renamed from: a */
    public static Bitmap m3167a(Bitmap bitmap, Size size) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int width2 = size.getWidth();
        int height2 = size.getHeight();
        String str = f6222a;
        StringBuilder stringBuilder = new StringBuilder(57);
        stringBuilder.append("scaleDownBitmapIfNeeded srcBitmap=");
        stringBuilder.append(width);
        stringBuilder.append("x");
        stringBuilder.append(height);
        bli.m871d(str, stringBuilder.toString());
        if (width <= width2 && height <= height2) {
            return bitmap;
        }
        if (((float) width) / ((float) height) > ((float) width2) / ((float) height2)) {
            height2 = (height * width2) / width;
        } else {
            width2 = (width * height2) / height;
        }
        String str2 = f6222a;
        StringBuilder stringBuilder2 = new StringBuilder(57);
        stringBuilder2.append("scaleDownBitmapIfNeeded dstBitmap=");
        stringBuilder2.append(width2);
        stringBuilder2.append("x");
        stringBuilder2.append(height2);
        bli.m871d(str2, stringBuilder2.toString());
        return Bitmap.createScaledBitmap(bitmap, width2, height2, false);
    }

    /* renamed from: b */
    public static Bitmap m3169b(Bitmap bitmap) {
        int i = 512;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        String str = f6222a;
        StringBuilder stringBuilder = new StringBuilder(57);
        stringBuilder.append("scaleDownBitmapIfNeeded srcBitmap=");
        stringBuilder.append(width);
        stringBuilder.append("x");
        stringBuilder.append(height);
        bli.m871d(str, stringBuilder.toString());
        if (width <= 512 && height <= 512) {
            return bitmap;
        }
        if (width > height) {
            width = (height << 9) / width;
        } else {
            i = (width << 9) / height;
            width = 512;
        }
        String str2 = f6222a;
        StringBuilder stringBuilder2 = new StringBuilder(57);
        stringBuilder2.append("scaleDownBitmapIfNeeded dstBitmap=");
        stringBuilder2.append(i);
        stringBuilder2.append("x");
        stringBuilder2.append(width);
        bli.m871d(str2, stringBuilder2.toString());
        return Bitmap.createScaledBitmap(bitmap, i, width, false);
    }
}
