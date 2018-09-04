package p000;

import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* renamed from: enr */
public class enr {
    /* renamed from: c */
    private static final Bundle f3977c = new Bundle();
    /* renamed from: a */
    private final List f3978a = new ArrayList();
    /* renamed from: b */
    private HashSet f3979b = new HashSet();
    /* renamed from: e */
    public final List f3980e = new ArrayList();
    /* renamed from: f */
    public enw f3981f;
    /* renamed from: g */
    public enw f3982g;
    /* renamed from: h */
    public enw f3983h;
    /* renamed from: i */
    public enw f3984i;

    /* renamed from: a */
    public final enw m1905a(enw enw) {
        for (int i = 0; i < this.f3980e.size(); i++) {
            enw.mo1236a((eol) this.f3980e.get(i));
        }
        this.f3978a.add(enw);
        return enw;
    }

    /* renamed from: a */
    public final eol m1906a(eol eol) {
        jri.m13154b(Looper.getMainLooper().isCurrentThread(), (Object) "addObserver must be called on the main thread.");
        String b = enr.m1904b(eol);
        if (b != null) {
            if (this.f3979b.contains(b)) {
                throw new IllegalStateException(String.format("Duplicate observer tag: '%s'. Implement LifecycleObserverTag to provide unique tags.", new Object[]{b}));
            }
            this.f3979b.add(b);
        }
        this.f3980e.add(eol);
        for (int i = 0; i < this.f3978a.size(); i++) {
            ((enw) this.f3978a.get(i)).mo1236a(eol);
        }
        return eol;
    }

    /* renamed from: a */
    public static Bundle m1903a(eol eol, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String b = enr.m1904b(eol);
        if (b != null) {
            return bundle.getBundle(b);
        }
        return f3977c;
    }

    /* renamed from: b */
    static String m1904b(eol eol) {
        if (!(eol instanceof eoi)) {
            return null;
        }
        if (eol instanceof eom) {
            return ((eom) eol).m1925a();
        }
        return eol.getClass().getName();
    }

    /* renamed from: a */
    public void mo1234a() {
        m1909b(this.f3984i);
        m1909b(this.f3981f);
        for (int i = 0; i < this.f3980e.size(); i++) {
            eol eol = (eol) this.f3980e.get(i);
            if (eol instanceof eoc) {
                ((eoc) eol).mo378f();
            }
        }
    }

    /* renamed from: b */
    public void mo1235b() {
        m1909b(this.f3983h);
        for (int i = 0; i < this.f3980e.size(); i++) {
            eol eol = (eol) this.f3980e.get(i);
            if (eol instanceof eof) {
                ((eof) eol).mo379g();
            }
        }
    }

    /* renamed from: b */
    public final void m1909b(enw enw) {
        this.f3978a.remove(enw);
    }
}
