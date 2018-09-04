package p000;

import java.util.Collection;
import java.util.LinkedList;

/* compiled from: PG */
/* renamed from: inc */
public enum inc {
    FPS_AUTO(30, 30),
    FPS_30(30, 30),
    FPS_60(60, 60),
    FPS_120(120, 30),
    FPS_240(240, 30);
    
    /* renamed from: f */
    public final int f7142f;
    /* renamed from: g */
    public final int f7143g;

    private inc(int i, int i2) {
        this.f7142f = i;
        this.f7143g = i2;
    }

    /* renamed from: a */
    public final int m3874a() {
        return this.f7142f / this.f7143g;
    }

    /* renamed from: b */
    public static Collection m3873b() {
        Collection linkedList = new LinkedList();
        for (inc inc : inc.values()) {
            if (inc.m3876d()) {
                linkedList.add(inc);
            }
        }
        return linkedList;
    }

    /* renamed from: c */
    public final boolean m3875c() {
        return this.f7142f == this.f7143g;
    }

    /* renamed from: d */
    public final boolean m3876d() {
        return this.f7142f > this.f7143g;
    }

    /* renamed from: a */
    public static inc m3872a(String str) {
        return (inc) Enum.valueOf(inc.class, str);
    }
}
