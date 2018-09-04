package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: afc */
public final class afc {
    /* renamed from: a */
    public final List f368a = new ArrayList();
    /* renamed from: b */
    public final List f369b = new ArrayList();
    /* renamed from: c */
    public ace f370c;
    /* renamed from: d */
    public Object f371d;
    /* renamed from: e */
    public int f372e;
    /* renamed from: f */
    public int f373f;
    /* renamed from: g */
    public Class f374g;
    /* renamed from: h */
    public afg f375h;
    /* renamed from: i */
    public adp f376i;
    /* renamed from: j */
    public Map f377j;
    /* renamed from: k */
    public Class f378k;
    /* renamed from: l */
    public boolean f379l;
    /* renamed from: m */
    public boolean f380m;
    /* renamed from: n */
    public adl f381n;
    /* renamed from: o */
    public acg f382o;
    /* renamed from: p */
    public afm f383p;
    /* renamed from: q */
    public boolean f384q;
    /* renamed from: r */
    public boolean f385r;

    afc() {
    }

    /* renamed from: a */
    final List m205a() {
        if (!this.f380m) {
            this.f380m = true;
            this.f369b.clear();
            List b = m208b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                int i2;
                aka aka = (aka) b.get(i);
                if (this.f369b.contains(aka.f506a)) {
                    i2 = 0;
                } else {
                    this.f369b.add(aka.f506a);
                    i2 = 0;
                }
                while (i2 < aka.f507b.size()) {
                    if (!this.f369b.contains(aka.f507b.get(i2))) {
                        this.f369b.add((adl) aka.f507b.get(i2));
                    }
                    i2++;
                }
            }
        }
        return this.f369b;
    }

    /* renamed from: b */
    final List m208b() {
        if (!this.f379l) {
            this.f379l = true;
            this.f368a.clear();
            List a = this.f370c.f211d.m112a(this.f371d);
            int size = a.size();
            for (int i = 0; i < size; i++) {
                aka a2 = ((ajz) a.get(i)).mo88a(this.f371d, this.f372e, this.f373f, this.f376i);
                if (a2 != null) {
                    this.f368a.add(a2);
                }
            }
        }
        return this.f368a;
    }

    /* renamed from: a */
    final agk m204a(Class cls) {
        return this.f370c.f211d.m110a(cls, this.f374g, this.f378k);
    }

    /* renamed from: a */
    final List m206a(File file) {
        return this.f370c.f211d.m112a((Object) file);
    }

    /* renamed from: b */
    final ads m207b(Class cls) {
        ads ads = (ads) this.f377j.get(cls);
        if (ads == null) {
            for (Entry entry : this.f377j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    ads = (ads) entry.getValue();
                    break;
                }
            }
        }
        if (ads != null) {
            return ads;
        }
        if (!this.f377j.isEmpty() || !this.f384q) {
            return (alq) alq.f19783b;
        }
        String valueOf = String.valueOf(cls);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 115);
        stringBuilder.append("Missing transformation for ");
        stringBuilder.append(valueOf);
        stringBuilder.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: c */
    final boolean m209c(Class cls) {
        return m204a(cls) != null;
    }
}
