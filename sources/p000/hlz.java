package p000;

import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;

/* compiled from: PG */
/* renamed from: hlz */
public final class hlz {
    /* renamed from: a */
    public final hls f6344a;
    /* renamed from: b */
    public final hkz f6345b;
    /* renamed from: c */
    public final hln f6346c;
    /* renamed from: d */
    public final View f6347d;
    /* renamed from: e */
    public final View f6348e;
    /* renamed from: f */
    public final int f6349f;
    /* renamed from: g */
    public VideoView f6350g;
    /* renamed from: h */
    public View f6351h;
    /* renamed from: i */
    public ImageButton f6352i;
    /* renamed from: j */
    public ImageButton f6353j;
    /* renamed from: k */
    public TextView f6354k;
    /* renamed from: l */
    public TextView f6355l;
    /* renamed from: m */
    public SeekBar f6356m;
    /* renamed from: n */
    public View f6357n;

    public hlz(hls hls, hkz hkz, hln hln, View view, View view2) {
        this.f6344a = hls;
        this.f6345b = hkz;
        this.f6346c = hln;
        this.f6347d = view;
        this.f6348e = view2;
        this.f6349f = view.getResources().getInteger(17694720);
    }

    /* renamed from: a */
    public final void m3243a(int i) {
        this.f6354k.setText(hhz.m3156a((long) i));
        this.f6356m.setMax(i);
    }

    /* renamed from: b */
    public final void m3244b(int i) {
        this.f6355l.setText(hhz.m3156a((long) i));
        this.f6356m.setProgress(i);
    }
}
