package com.google.android.apps.camera.stats;

import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.ArrayList;
import java.util.List;
import p000.grp;
import p000.jri;
import p000.ken;
import p000.kwk;

@UsedByReflection
/* compiled from: PG */
public class InstrumentationSessionRecorder implements grp {
    /* renamed from: a */
    private final Object f12324a = new Object();
    /* renamed from: b */
    private final kwk f12325b;
    /* renamed from: c */
    private final List f12326c = new ArrayList();
    /* renamed from: d */
    private InstrumentationSession f12327d;

    @UsedByReflection
    public InstrumentationSessionRecorder(kwk kwk) {
        jri.m13152b((Object) kwk);
        this.f12325b = kwk;
    }

    @UsedByReflection
    public void clear() {
        synchronized (this.f12324a) {
            this.f12327d = null;
            this.f12326c.clear();
        }
    }

    @UsedByReflection
    public InstrumentationSession create() {
        InstrumentationSession a;
        synchronized (this.f12324a) {
            a = m8426a();
        }
        return a;
    }

    /* renamed from: a */
    private final InstrumentationSession m8426a() {
        Object obj = (InstrumentationSession) this.f12325b.mo345a();
        obj.f2412l = this;
        jri.m13152b(obj);
        this.f12327d = obj;
        this.f12326c.add(obj);
        return obj;
    }

    @UsedByReflection
    public InstrumentationSession getCurrentSession() {
        InstrumentationSession instrumentationSession;
        synchronized (this.f12324a) {
            if (this.f12327d == null) {
                m8426a();
            }
            instrumentationSession = this.f12327d;
        }
        return instrumentationSession;
    }

    @UsedByReflection
    public List getSessionList() {
        List a;
        synchronized (this.f12324a) {
            a = ken.m13458a(this.f12326c);
        }
        return a;
    }

    @UsedByReflection
    public void handleClose(InstrumentationSession instrumentationSession) {
        synchronized (this.f12324a) {
            if (this.f12327d == instrumentationSession) {
                this.f12327d = null;
            }
            this.f12326c.remove(instrumentationSession);
        }
    }

    @UsedByReflection
    public boolean hasSessions() {
        boolean z;
        synchronized (this.f12324a) {
            z = this.f12326c.size() > 0;
        }
        return z;
    }
}
