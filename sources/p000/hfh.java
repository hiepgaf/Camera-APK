package p000;

import android.os.Handler;
import android.view.Choreographer;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.ui.widget.TracedFrameLayout;

/* compiled from: PG */
/* renamed from: hfh */
public final class hfh extends TracedFrameLayout {
    /* renamed from: c */
    private static final String f17742c = bli.m862a("CountDownView");
    /* renamed from: a */
    public int f17743a = 0;
    /* renamed from: b */
    public hfk f17744b;
    /* renamed from: d */
    private TextView f17745d;
    /* renamed from: e */
    private final Handler f17746e = new hfj(this);
    /* renamed from: f */
    private final ViewGroup f17747f;

    public hfh(FrameLayout frameLayout) {
        super(frameLayout.getContext());
        this.f17747f = frameLayout;
        setTag("countDown");
        this.f17745d = (TextView) hhz.m3162d(new TextView(frameLayout.getContext(), null, R.style.CountdownTextStyle));
        this.f17745d.setTextAppearance(R.style.CountdownTextStyle);
        this.f17745d.setGravity(17);
        addView(this.f17745d);
    }

    /* renamed from: a */
    public final void m11788a() {
        if (this.f17743a > 0) {
            this.f17743a = 0;
            this.f17746e.removeMessages(1);
            this.f17747f.removeView(this);
        }
    }

    /* renamed from: b */
    public final boolean m11791b() {
        return this.f17743a > 0;
    }

    /* renamed from: a */
    final void m11790a(boolean z, int i) {
        this.f17743a = i;
        hfk hfk = this.f17744b;
        if (hfk != null) {
            if (z) {
                hfk.mo1140r();
            } else {
                hfk.mo1138b(this.f17743a);
            }
        }
        if (i == 0) {
            this.f17747f.removeView(this);
            hfk = this.f17744b;
            if (hfk != null) {
                hfk.mo1139q();
                return;
            }
            return;
        }
        this.f17745d.setText(String.format(getResources().getConfiguration().locale, "%d", new Object[]{Integer.valueOf(i)}));
        m11792c();
        this.f17746e.sendEmptyMessageDelayed(1, 1000);
    }

    /* renamed from: a */
    public final void m11789a(int i) {
        if (i <= 0) {
            String str = f17742c;
            StringBuilder stringBuilder = new StringBuilder(54);
            stringBuilder.append("Invalid input for countdown timer: ");
            stringBuilder.append(i);
            stringBuilder.append(" seconds");
            bli.m873e(str, stringBuilder.toString());
            return;
        }
        if (m11791b()) {
            m11788a();
        }
        this.f17747f.addView(this, -1);
        m11790a(true, i);
    }

    /* renamed from: c */
    final void m11792c() {
        int measuredWidth = this.f17745d.getMeasuredWidth();
        int measuredHeight = this.f17745d.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Choreographer.getInstance().postFrameCallback(new hfi(this));
            return;
        }
        this.f17745d.setScaleX(1.0f);
        this.f17745d.setScaleY(1.0f);
        this.f17745d.setPivotX((float) (measuredWidth / 2));
        this.f17745d.setPivotY((float) (measuredHeight / 2));
        this.f17745d.setAlpha(1.0f);
        this.f17745d.animate().scaleX(1.375f).scaleY(1.375f).alpha(0.0f).setDuration(800).start();
    }
}
