package p000;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: aaz */
public class aaz {
    /* renamed from: a */
    public static aby f47a = new aby("CamCapabs");
    /* renamed from: b */
    public final ArrayList f48b = new ArrayList();
    /* renamed from: c */
    public final ArrayList f49c = new ArrayList();
    /* renamed from: d */
    public final TreeSet f50d = new TreeSet();
    /* renamed from: e */
    public final ArrayList f51e = new ArrayList();
    /* renamed from: f */
    public final ArrayList f52f = new ArrayList();
    /* renamed from: g */
    public final TreeSet f53g = new TreeSet();
    /* renamed from: h */
    public final EnumSet f54h = EnumSet.noneOf(abd.class);
    /* renamed from: i */
    public final EnumSet f55i = EnumSet.noneOf(abb.class);
    /* renamed from: j */
    public final EnumSet f56j = EnumSet.noneOf(abc.class);
    /* renamed from: k */
    public final EnumSet f57k = EnumSet.noneOf(abf.class);
    /* renamed from: l */
    public final EnumSet f58l = EnumSet.noneOf(aba.class);
    /* renamed from: m */
    public abw f59m;
    /* renamed from: n */
    public int f60n;
    /* renamed from: o */
    public int f61o;
    /* renamed from: p */
    public float f62p;
    /* renamed from: q */
    public int f63q;
    /* renamed from: r */
    public int f64r;
    /* renamed from: s */
    public int f65s;
    /* renamed from: t */
    public float f66t;
    /* renamed from: u */
    public float f67u;
    /* renamed from: v */
    public float f68v;
    /* renamed from: w */
    public final abe f69w;

    aaz(abe abe) {
        this.f69w = abe;
    }

    public aaz(aaz aaz) {
        this.f48b.addAll(aaz.f48b);
        this.f49c.addAll(aaz.f49c);
        this.f50d.addAll(aaz.f50d);
        this.f51e.addAll(aaz.f51e);
        this.f52f.addAll(aaz.f52f);
        this.f53g.addAll(aaz.f53g);
        this.f54h.addAll(aaz.f54h);
        this.f55i.addAll(aaz.f55i);
        this.f56j.addAll(aaz.f56j);
        this.f57k.addAll(aaz.f57k);
        this.f58l.addAll(aaz.f58l);
        this.f59m = aaz.f59m;
        this.f61o = aaz.f61o;
        this.f60n = aaz.f60n;
        this.f62p = aaz.f62p;
        this.f63q = aaz.f63q;
        this.f64r = aaz.f64r;
        this.f65s = aaz.f65s;
        this.f66t = aaz.f66t;
        this.f67u = aaz.f67u;
        this.f68v = aaz.f68v;
        this.f69w = aaz.f69w;
    }

    /* renamed from: a */
    public final List m31a() {
        return new ArrayList(this.f52f);
    }

    /* renamed from: b */
    public final List m36b() {
        return new ArrayList(this.f48b);
    }

    /* renamed from: c */
    public final List m37c() {
        return new ArrayList(this.f49c);
    }

    /* renamed from: a */
    public final boolean m32a(aba aba) {
        return aba != null && this.f58l.contains(aba);
    }

    /* renamed from: a */
    public final boolean m33a(abb abb) {
        return abb != null && this.f55i.contains(abb);
    }

    /* renamed from: a */
    public final boolean m34a(abc abc) {
        return abc != null && this.f56j.contains(abc);
    }

    /* renamed from: a */
    public final boolean m35a(abd abd) {
        return abd != null && this.f54h.contains(abd);
    }
}
