package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gxn */
public class gxn {
    /* renamed from: a */
    public final String f5766a;
    /* renamed from: b */
    public final String f5767b;
    /* renamed from: c */
    public final Drawable f5768c;
    /* renamed from: d */
    public boolean f5769d = false;
    /* renamed from: e */
    public View f5770e;
    /* renamed from: f */
    public PopupWindow f5771f = null;
    /* renamed from: g */
    public Runnable f5772g = null;
    /* renamed from: h */
    public Runnable f5773h = null;
    /* renamed from: i */
    public Runnable f5774i = null;

    /* renamed from: a */
    public synchronized void m2870a() {
        m2873a(false);
    }

    /* renamed from: a */
    public synchronized gxn m2869a(Runnable runnable) {
        this.f5772g = runnable;
        return this;
    }

    /* renamed from: b */
    public synchronized gxn m2874b(Runnable runnable) {
        this.f5773h = runnable;
        return this;
    }

    /* renamed from: c */
    public synchronized gxn m2875c(Runnable runnable) {
        this.f5774i = runnable;
        return this;
    }

    /* renamed from: a */
    public synchronized void m2872a(View view, Rect rect) {
        View view2 = view;
        m2871a(view2, rect.left, rect.top, rect.width(), rect.height(), new Rect(0, 0, rect.width(), rect.height()));
    }

    public gxn(String str, String str2, Drawable drawable) {
        this.f5766a = str;
        this.f5767b = str2;
        this.f5768c = drawable;
    }

    /* renamed from: a */
    public synchronized PopupWindow m2868a(Context context, int i, int i2, Rect rect) {
        PopupWindow popupWindow;
        if (!this.f5769d) {
            CharSequence charSequence = this.f5766a;
            CharSequence charSequence2 = this.f5767b;
            Drawable drawable = this.f5768c;
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            Handler handler = new Handler(Looper.getMainLooper());
            View inflate = layoutInflater.inflate(R.layout.info_view, null);
            TextView textView = (TextView) inflate.findViewById(R.id.textContent);
            TextView textView2 = (TextView) inflate.findViewById(R.id.textGotIt);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.imageBackground);
            ((TextView) inflate.findViewById(R.id.textTitle)).setText(charSequence);
            textView.setText(charSequence2);
            textView2.setOnClickListener(new gxo(this, handler));
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
            this.f5770e = inflate;
            this.f5770e.setPadding(rect.left, rect.top, i - rect.right, i2 - rect.bottom);
            this.f5769d = true;
        }
        popupWindow = new PopupWindow(this.f5770e, i, i2);
        popupWindow.setAnimationStyle(R.style.PopupAnimation);
        popupWindow.setOverlapAnchor(true);
        popupWindow.setClippingEnabled(false);
        return popupWindow;
    }

    /* renamed from: a */
    public synchronized void m2873a(boolean z) {
        PopupWindow popupWindow = this.f5771f;
        if (popupWindow != null) {
            popupWindow.dismiss();
            Runnable runnable;
            if (z) {
                runnable = this.f5772g;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                runnable = this.f5773h;
                if (runnable != null) {
                    runnable.run();
                }
            }
            this.f5771f = null;
        }
    }

    /* renamed from: a */
    public synchronized void m2871a(View view, int i, int i2, int i3, int i4, Rect rect) {
        PopupWindow a = m2868a(view.getContext(), i3, i4, rect);
        a.showAtLocation(view, 0, i, i2);
        Runnable runnable = this.f5774i;
        if (runnable != null) {
            runnable.run();
        }
        this.f5771f = a;
    }
}
