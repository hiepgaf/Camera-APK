package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: any */
public class any extends Drawable implements Animatable, aof {
    /* renamed from: a */
    public final anz f10102a;
    /* renamed from: b */
    public boolean f10103b;
    /* renamed from: c */
    private boolean f10104c;
    /* renamed from: d */
    private boolean f10105d;
    /* renamed from: e */
    private boolean f10106e;
    /* renamed from: f */
    private int f10107f;
    /* renamed from: g */
    private int f10108g;
    /* renamed from: h */
    private boolean f10109h;
    /* renamed from: i */
    private Paint f10110i;
    /* renamed from: j */
    private Rect f10111j;

    public any(Context context, ada ada, ads ads, int i, int i2, Bitmap bitmap) {
        this(new anz(new aod(acc.m98a(context), ada, i, i2, ads, bitmap)));
    }

    any(anz anz) {
        this.f10106e = true;
        this.f10108g = -1;
        this.f10102a = (anz) aqe.m585a((Object) anz, "Argument must not be null");
    }

    public void draw(Canvas canvas) {
        if (!this.f10103b) {
            if (this.f10109h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m6864d());
                this.f10109h = false;
            }
            canvas.drawBitmap(this.f10102a.f796a.m519a(), null, m6864d(), m6865e());
        }
    }

    /* renamed from: a */
    public final ByteBuffer m6868a() {
        return this.f10102a.f796a.f798a.mo16e().asReadOnlyBuffer();
    }

    public ConstantState getConstantState() {
        return this.f10102a;
    }

    /* renamed from: d */
    private final Rect m6864d() {
        if (this.f10111j == null) {
            this.f10111j = new Rect();
        }
        return this.f10111j;
    }

    /* renamed from: b */
    public final Bitmap m6869b() {
        return this.f10102a.f796a.f805h;
    }

    public int getIntrinsicHeight() {
        return this.f10102a.f796a.m519a().getHeight();
    }

    public int getIntrinsicWidth() {
        return this.f10102a.f796a.m519a().getWidth();
    }

    public int getOpacity() {
        return -2;
    }

    /* renamed from: e */
    private final Paint m6865e() {
        if (this.f10110i == null) {
            this.f10110i = new Paint(2);
        }
        return this.f10110i;
    }

    public boolean isRunning() {
        return this.f10104c;
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f10109h = true;
    }

    /* renamed from: c */
    public final void mo314c() {
        Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        int i;
        invalidateSelf();
        aod aod = this.f10102a.f796a;
        aoe aoe = aod.f802e;
        if (aoe != null) {
            i = aoe.f23446a;
        } else {
            i = -1;
        }
        if (i == aod.m522b() - 1) {
            this.f10107f++;
        }
        i = this.f10108g;
        if (i != -1 && this.f10107f >= i) {
            stop();
        }
    }

    public void setAlpha(int i) {
        m6865e().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m6865e().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        aqe.m588a(this.f10103b ^ 1, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f10106e = z;
        if (!z) {
            m6867g();
        } else if (this.f10105d) {
            m6866f();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f10105d = true;
        this.f10107f = 0;
        if (this.f10106e) {
            m6866f();
        }
    }

    /* renamed from: f */
    private final void m6866f() {
        aqe.m588a(this.f10103b ^ 1, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f10102a.f796a.m522b() == 1) {
            invalidateSelf();
        } else if (!this.f10104c) {
            this.f10104c = true;
            aod aod = this.f10102a.f796a;
            if (aod.f803f) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            } else if (aod.f799b.contains(this)) {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            } else {
                boolean isEmpty = aod.f799b.isEmpty();
                aod.f799b.add(this);
                if (isEmpty && !aod.f801d) {
                    aod.f801d = true;
                    aod.f803f = false;
                    aod.m523c();
                }
                invalidateSelf();
            }
        }
    }

    public void stop() {
        this.f10105d = false;
        m6867g();
    }

    /* renamed from: g */
    private final void m6867g() {
        this.f10104c = false;
        aod aod = this.f10102a.f796a;
        aod.f799b.remove(this);
        if (aod.f799b.isEmpty()) {
            aod.f801d = false;
        }
    }
}
