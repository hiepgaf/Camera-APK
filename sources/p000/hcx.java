package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: hcx */
public class hcx implements hcy {
    /* renamed from: a */
    public final String f17647a;
    /* renamed from: b */
    public final List f17648b;
    /* renamed from: c */
    public final List f17649c;
    /* renamed from: d */
    public final List f17650d;
    /* renamed from: e */
    public final List f17651e;
    /* renamed from: f */
    public final AtomicInteger f17652f;
    /* renamed from: g */
    public final Handler f17653g;
    /* renamed from: h */
    public volatile View f17654h;
    /* renamed from: i */
    public volatile int f17655i;
    /* renamed from: j */
    public volatile int f17656j;
    /* renamed from: k */
    public volatile boolean f17657k;
    /* renamed from: l */
    public volatile int f17658l;
    /* renamed from: m */
    public volatile int f17659m;
    /* renamed from: n */
    public volatile boolean f17660n;
    /* renamed from: o */
    public volatile boolean f17661o;
    /* renamed from: p */
    public volatile boolean f17662p;
    /* renamed from: q */
    public volatile boolean f17663q;
    /* renamed from: r */
    public volatile String f17664r;
    /* renamed from: s */
    public boolean f17665s = false;
    /* renamed from: t */
    public final Object f17666t = new Object();
    /* renamed from: u */
    public final /* synthetic */ hco f17667u;

    /* renamed from: a */
    public hcx m11758a(kbn kbn) {
        this.f17651e.add(kbn);
        return this;
    }

    /* renamed from: a */
    public hcx m11755a() {
        this.f17651e.add(new hcp(this));
        return this;
    }

    /* renamed from: a */
    public hcx m11757a(Runnable runnable, Executor executor) {
        this.f17650d.add(Pair.create(runnable, executor));
        return this;
    }

    /* renamed from: b */
    public hcx m11761b(Runnable runnable, Executor executor) {
        this.f17648b.add(Pair.create(runnable, executor));
        return this;
    }

    /* renamed from: b */
    public hcx m11760b() {
        this.f17657k = true;
        return this;
    }

    /* renamed from: c */
    public hcx m11762c() {
        this.f17661o = false;
        return this;
    }

    /* renamed from: a */
    public hcx m11759a(boolean z) {
        this.f17660n = z;
        return this;
    }

    /* renamed from: d */
    public iqo m11763d() {
        boolean z;
        Context context = this.f17654h.getContext();
        CharSequence charSequence = this.f17647a;
        View textView = new TextView(context);
        textView.setTextAppearance(R.style.Tooltip);
        textView.setText(charSequence);
        hcz hda = new hda(this.f17654h);
        hcn hcn = new hcn(textView, this.f17655i, this.f17654h, this.f17656j, 0);
        int i = this.f17658l;
        hde hde = hcn.f5985a;
        if (hde == null) {
            z = this.f17657k;
        } else {
            z = this.f17657k;
        }
        if (hde != null) {
            hde.f6031q = z;
            if (z) {
                hde.f6030p = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) hde.f6017c);
                hde.f6030p.setRepeatCount(-1);
                hde.f6030p.setRepeatMode(2);
                hde.f6030p.setDuration(1000);
                hde.f6030p.setInterpolator(hde.getContext(), R.anim.tooltip_animation_interpolator);
            }
        }
        boolean z2 = this.f17660n;
        hde hde2 = hcn.f5985a;
        if (hde2 != null) {
            hde2.f6020f = z2;
        }
        z2 = this.f17661o;
        List list = this.f17648b;
        if (hde2 != null) {
            hde2.f6033s = list;
        }
        hda.mo3073a();
        z2 = this.f17663q;
        hda.mo3076b(new hcq(this, hcn, hda));
        hda.mo3074a(new hcr(this, hcn, hda));
        Collection collection = this.f17650d;
        hde2 = hcn.f5985a;
        hde2.f6018d.clear();
        hde2.f6018d.addAll(collection);
        koq.m16613c(hcn.f5986b).mo1985a(new hcs(this, hcn), kpq.f8410a);
        this.f17667u.f5988b.add(hcn);
        return new hct(this, hcn, hda);
    }

    public hcx(hco hco, String str) {
        this.f17667u = hco;
        this.f17647a = str;
        this.f17648b = Collections.synchronizedList(new ArrayList());
        this.f17649c = Collections.synchronizedList(new ArrayList());
        this.f17650d = Collections.synchronizedList(new ArrayList());
        this.f17651e = Collections.synchronizedList(new ArrayList());
        this.f17652f = new AtomicInteger(0);
        this.f17653g = new Handler(Looper.getMainLooper());
        this.f17659m = 0;
        this.f17658l = 0;
        this.f17660n = true;
        this.f17662p = true;
        this.f17663q = false;
        this.f17664r = "";
        this.f17657k = false;
    }

    /* renamed from: a */
    public hcx mo1725a(View view) {
        this.f17654h = view;
        this.f17655i = 2;
        return this;
    }
}
