package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* renamed from: amp */
final class amp {
    /* renamed from: a */
    private static final agw f538a = new amq();

    /* renamed from: a */
    static agn m354a(agw agw, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Object obj;
        Drawable current = drawable.getCurrent();
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
            obj = null;
        } else if (current instanceof Animatable) {
            bitmap = null;
            obj = null;
        } else {
            bitmap = amp.m355b(agw, current, i, i2);
            obj = 1;
        }
        if (obj == null) {
            agw = f538a;
        }
        return alv.m6617a(bitmap, agw);
    }

    /* renamed from: b */
    private static Bitmap m355b(agw agw, Drawable drawable, int i, int i2) {
        Bitmap bitmap = null;
        String valueOf;
        StringBuilder stringBuilder;
        if (i != kvl.UNSET_ENUM_VALUE || drawable.getIntrinsicWidth() > 0) {
            if (i2 != kvl.UNSET_ENUM_VALUE || drawable.getIntrinsicHeight() > 0) {
                if (drawable.getIntrinsicWidth() > 0) {
                    i = drawable.getIntrinsicWidth();
                }
                if (drawable.getIntrinsicHeight() > 0) {
                    i2 = drawable.getIntrinsicHeight();
                }
                Lock lock = anb.f549a;
                lock.lock();
                bitmap = agw.mo59a(i, i2, Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(bitmap);
                    drawable.setBounds(0, 0, i, i2);
                    drawable.draw(canvas);
                    canvas.setBitmap(null);
                } finally {
                    lock.unlock();
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                valueOf = String.valueOf(drawable);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 96);
                stringBuilder.append("Unable to draw ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                Log.w("DrawableToBitmap", stringBuilder.toString());
            }
        } else if (Log.isLoggable("DrawableToBitmap", 5)) {
            valueOf = String.valueOf(drawable);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 95);
            stringBuilder.append("Unable to draw ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            Log.w("DrawableToBitmap", stringBuilder.toString());
        }
        return bitmap;
    }
}
