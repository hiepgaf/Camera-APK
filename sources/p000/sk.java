package p000;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: sk */
public final class sk extends uf implements ul {
    /* renamed from: p */
    private static final int[] f19564p = new int[]{16842919};
    /* renamed from: q */
    private static final int[] f19565q = new int[0];
    /* renamed from: A */
    private int f19566A = 0;
    /* renamed from: B */
    private final int[] f19567B = new int[2];
    /* renamed from: C */
    private final int[] f19568C = new int[2];
    /* renamed from: D */
    private final Runnable f19569D = new sl(this);
    /* renamed from: E */
    private final um f19570E = new sm(this);
    /* renamed from: a */
    public final int f19571a;
    /* renamed from: b */
    public final StateListDrawable f19572b;
    /* renamed from: c */
    public final Drawable f19573c;
    /* renamed from: d */
    public int f19574d;
    /* renamed from: e */
    public int f19575e;
    /* renamed from: f */
    public int f19576f;
    /* renamed from: g */
    public int f19577g;
    /* renamed from: h */
    public int f19578h = 0;
    /* renamed from: i */
    public int f19579i = 0;
    /* renamed from: j */
    public RecyclerView f19580j;
    /* renamed from: k */
    public boolean f19581k = false;
    /* renamed from: l */
    public boolean f19582l = false;
    /* renamed from: m */
    public int f19583m = 0;
    /* renamed from: n */
    public final ValueAnimator f19584n = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    /* renamed from: o */
    public int f19585o = 0;
    /* renamed from: r */
    private final int f19586r;
    /* renamed from: s */
    private final int f19587s;
    /* renamed from: t */
    private final int f19588t;
    /* renamed from: u */
    private final StateListDrawable f19589u;
    /* renamed from: v */
    private final Drawable f19590v;
    /* renamed from: w */
    private final int f19591w;
    /* renamed from: x */
    private final int f19592x;
    /* renamed from: y */
    private float f19593y;
    /* renamed from: z */
    private float f19594z;

    public sk(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f19572b = stateListDrawable;
        this.f19573c = drawable;
        this.f19589u = stateListDrawable2;
        this.f19590v = drawable2;
        this.f19587s = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f19588t = Math.max(i, drawable.getIntrinsicWidth());
        this.f19591w = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f19592x = Math.max(i, drawable2.getIntrinsicWidth());
        this.f19571a = i2;
        this.f19586r = i3;
        this.f19572b.setAlpha(Illuminant.kOther);
        this.f19573c.setAlpha(Illuminant.kOther);
        this.f19584n.addListener(new sn(this));
        this.f19584n.addUpdateListener(new so(this));
        RecyclerView recyclerView2 = this.f19580j;
        if (recyclerView2 != recyclerView) {
            um umVar;
            if (recyclerView2 != null) {
                recyclerView2.m450a((uf) this);
                recyclerView2 = this.f19580j;
                recyclerView2.f686n.remove(this);
                if (recyclerView2.f687o == this) {
                    recyclerView2.f687o = null;
                }
                recyclerView2 = this.f19580j;
                umVar = this.f19570E;
                List list = recyclerView2.f657B;
                if (list != null) {
                    list.remove(umVar);
                }
                m14337b();
            }
            this.f19580j = recyclerView;
            recyclerView2 = this.f19580j;
            if (recyclerView2 != null) {
                ug ugVar = recyclerView2.f683k;
                if (ugVar != null) {
                    ugVar.mo2466a("Cannot add item decoration during a scroll  or layout");
                }
                if (recyclerView2.f685m.isEmpty()) {
                    recyclerView2.setWillNotDraw(false);
                }
                recyclerView2.f685m.add(this);
                recyclerView2.m475l();
                recyclerView2.requestLayout();
                this.f19580j.f686n.add(this);
                recyclerView2 = this.f19580j;
                umVar = this.f19570E;
                if (recyclerView2.f657B == null) {
                    recyclerView2.f657B = new ArrayList();
                }
                recyclerView2.f657B.add(umVar);
            }
        }
    }

    /* renamed from: b */
    private final void m14337b() {
        this.f19580j.removeCallbacks(this.f19569D);
    }

    /* renamed from: c */
    private final boolean m14340c() {
        return jm.m4576j(this.f19580j) == 1;
    }

    /* renamed from: a */
    private final boolean m14336a(float f, float f2) {
        if (f2 >= ((float) (this.f19579i - this.f19591w))) {
            int i = this.f19577g;
            int i2 = this.f19576f / 2;
            if (f >= ((float) (i - i2)) && f <= ((float) (i + i2))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private final boolean m14339b(float r4, float r5) {
        /*
        r3 = this;
        r0 = r3.m14340c();
        if (r0 != 0) goto L_0x0027;
    L_0x0006:
        r0 = r3.f19578h;
        r1 = r3.f19587s;
        r0 = r0 - r1;
        r0 = (float) r0;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x0025;
    L_0x0010:
        r0 = r3.f19575e;
        r1 = r3.f19574d;
        r1 = r1 / 2;
        r2 = r0 - r1;
        r2 = (float) r2;
        r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x0025;
    L_0x001d:
        r0 = r0 + r1;
        r0 = (float) r0;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 > 0) goto L_0x0025;
    L_0x0023:
        r0 = 1;
    L_0x0024:
        return r0;
    L_0x0025:
        r0 = 0;
        goto L_0x0024;
    L_0x0027:
        r0 = r3.f19587s;
        r0 = r0 / 2;
        r0 = (float) r0;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 > 0) goto L_0x0025;
    L_0x0030:
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: sk.b(float, float):boolean");
    }

    /* renamed from: a */
    public final void mo2457a(Canvas canvas) {
        if (this.f19578h != this.f19580j.getWidth() || this.f19579i != this.f19580j.getHeight()) {
            this.f19578h = this.f19580j.getWidth();
            this.f19579i = this.f19580j.getHeight();
            m14343a(0);
        } else if (this.f19585o != 0) {
            int i;
            int i2;
            int i3;
            int i4;
            if (this.f19581k) {
                i = this.f19578h;
                i2 = this.f19587s;
                i -= i2;
                i3 = this.f19575e;
                i4 = this.f19574d;
                i3 -= i4 / 2;
                this.f19572b.setBounds(0, 0, i2, i4);
                this.f19573c.setBounds(0, 0, this.f19588t, this.f19579i);
                if (m14340c()) {
                    this.f19573c.draw(canvas);
                    canvas.translate((float) this.f19587s, (float) i3);
                    canvas.scale(-1.0f, 1.0f);
                    this.f19572b.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate((float) (-this.f19587s), (float) (-i3));
                } else {
                    canvas.translate((float) i, 0.0f);
                    this.f19573c.draw(canvas);
                    canvas.translate(0.0f, (float) i3);
                    this.f19572b.draw(canvas);
                    canvas.translate((float) (-i), (float) (-i3));
                }
            }
            if (this.f19582l) {
                i = this.f19579i;
                i2 = this.f19591w;
                i -= i2;
                i3 = this.f19577g;
                i4 = this.f19576f;
                i3 -= i4 / 2;
                this.f19589u.setBounds(0, 0, i4, i2);
                this.f19590v.setBounds(0, 0, this.f19578h, this.f19592x);
                canvas.translate(0.0f, (float) i);
                this.f19590v.draw(canvas);
                canvas.translate((float) i3, 0.0f);
                this.f19589u.draw(canvas);
                canvas.translate((float) (-i3), (float) (-i));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo2458a(MotionEvent motionEvent) {
        boolean z = false;
        int i = this.f19583m;
        if (i == 1) {
            boolean b = m14339b(motionEvent.getX(), motionEvent.getY());
            boolean a = m14336a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (b || a)) {
                if (a) {
                    this.f19566A = 1;
                    this.f19594z = (float) ((int) motionEvent.getX());
                } else if (b) {
                    this.f19566A = 2;
                    this.f19593y = (float) ((int) motionEvent.getY());
                }
                m14343a(2);
                z = true;
            }
        } else if (i == 2) {
            return true;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo2456a() {
    }

    /* renamed from: b */
    public final void mo2459b(MotionEvent motionEvent) {
        if (this.f19583m != 0) {
            if (motionEvent.getAction() == 0) {
                boolean b = m14339b(motionEvent.getX(), motionEvent.getY());
                boolean a = m14336a(motionEvent.getX(), motionEvent.getY());
                if (b || a) {
                    if (a) {
                        this.f19566A = 1;
                        this.f19594z = (float) ((int) motionEvent.getX());
                    } else if (b) {
                        this.f19566A = 2;
                        this.f19593y = (float) ((int) motionEvent.getY());
                    }
                    m14343a(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f19583m == 2) {
                this.f19593y = 0.0f;
                this.f19594z = 0.0f;
                m14343a(1);
                this.f19566A = 0;
            } else if (motionEvent.getAction() == 2 && this.f19583m == 2) {
                float x;
                int[] iArr;
                int i;
                float max;
                int a2;
                m14341d();
                if (this.f19566A == 1) {
                    x = motionEvent.getX();
                    iArr = this.f19568C;
                    i = this.f19586r;
                    iArr[0] = i;
                    iArr[1] = this.f19578h - i;
                    max = Math.max((float) iArr[0], Math.min((float) iArr[1], x));
                    if (Math.abs(((float) this.f19577g) - max) >= 2.0f) {
                        a2 = sk.m14335a(this.f19594z, max, iArr, this.f19580j.computeHorizontalScrollRange(), this.f19580j.computeHorizontalScrollOffset(), this.f19578h);
                        if (a2 != 0) {
                            this.f19580j.scrollBy(a2, 0);
                        }
                        this.f19594z = max;
                    }
                }
                if (this.f19566A == 2) {
                    x = motionEvent.getY();
                    iArr = this.f19567B;
                    i = this.f19586r;
                    iArr[0] = i;
                    iArr[1] = this.f19579i - i;
                    max = Math.max((float) iArr[0], Math.min((float) iArr[1], x));
                    if (Math.abs(((float) this.f19575e) - max) >= 2.0f) {
                        a2 = sk.m14335a(this.f19593y, max, iArr, this.f19580j.computeVerticalScrollRange(), this.f19580j.computeVerticalScrollOffset(), this.f19579i);
                        if (a2 != 0) {
                            this.f19580j.scrollBy(0, a2);
                        }
                        this.f19593y = max;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private final void m14338b(int i) {
        m14337b();
        this.f19580j.postDelayed(this.f19569D, (long) i);
    }

    /* renamed from: a */
    private static int m14335a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        i4 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i6 = i2 + i4;
        if (i6 >= i5 || i6 < 0) {
            return 0;
        }
        return i4;
    }

    /* renamed from: a */
    final void m14343a(int i) {
        if (i == 2 && this.f19583m != 2) {
            this.f19572b.setState(f19564p);
            m14337b();
        }
        if (i != 0) {
            m14341d();
        } else {
            this.f19580j.invalidate();
        }
        if (this.f19583m == 2 && i != 2) {
            this.f19572b.setState(f19565q);
            m14338b(1200);
        } else if (i == 1) {
            m14338b(1500);
        }
        this.f19583m = i;
    }

    /* renamed from: d */
    private final void m14341d() {
        switch (this.f19585o) {
            case 0:
                break;
            case 3:
                this.f19584n.cancel();
                break;
            default:
                return;
        }
        this.f19585o = 1;
        this.f19584n.setFloatValues(new float[]{((Float) this.f19584n.getAnimatedValue()).floatValue(), 1.0f});
        this.f19584n.setDuration(500);
        this.f19584n.setStartDelay(0);
        this.f19584n.start();
    }
}
