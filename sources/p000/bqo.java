package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: bqo */
public final class bqo extends ImageView {
    /* renamed from: a */
    public bqp f1448a;
    /* renamed from: b */
    public boolean f1449b = true;
    /* renamed from: c */
    private final Drawable f1450c;
    /* renamed from: d */
    private final Drawable f1451d;

    public bqo(Context context) {
        super(context);
        this.f1450c = context.getResources().getDrawable(R.drawable.ic_afae_unlock_24px, null);
        this.f1451d = context.getResources().getDrawable(R.drawable.ic_afae_lock_24px, null);
        int dimension = (int) getResources().getDimension(R.dimen.evCompLockIconPadding);
        setPadding(dimension, dimension, dimension, dimension);
        m941a(false);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1449b) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    final void m941a(boolean z) {
        if (z) {
            setImageDrawable(this.f1451d);
            setContentDescription(getResources().getString(R.string.lock_closed_label));
        } else {
            setImageDrawable(this.f1450c);
            setContentDescription(getResources().getString(R.string.lock_open_label));
        }
        bqp bqp = this.f1448a;
        if (bqp != null) {
            bpt bpt = bqp.f1452a;
            if (z) {
                bpt.f1418b.mo2703f();
            }
        }
    }
}
