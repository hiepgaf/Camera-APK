package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: idr */
public final class idr implements icp, ied {
    /* renamed from: a */
    public final Lock f21702a;
    /* renamed from: b */
    public final Condition f21703b;
    /* renamed from: c */
    public final Context f21704c;
    /* renamed from: d */
    public final huc f21705d;
    /* renamed from: e */
    public final idt f21706e;
    /* renamed from: f */
    public final Map f21707f;
    /* renamed from: g */
    public final Map f21708g = new HashMap();
    /* renamed from: h */
    public final hvx f21709h;
    /* renamed from: i */
    public final Map f21710i;
    /* renamed from: j */
    public final huk f21711j;
    /* renamed from: k */
    public volatile idq f21712k;
    /* renamed from: l */
    public int f21713l;
    /* renamed from: m */
    public final idn f21714m;
    /* renamed from: n */
    public final iee f21715n;
    /* renamed from: o */
    private ConnectionResult f21716o = null;

    public idr(Context context, idn idn, Lock lock, Looper looper, huc huc, Map map, hvx hvx, Map map2, huk huk, ArrayList arrayList, iee iee) {
        this.f21704c = context;
        this.f21702a = lock;
        this.f21705d = huc;
        this.f21707f = map;
        this.f21709h = hvx;
        this.f21710i = map2;
        this.f21711j = huk;
        this.f21714m = idn;
        this.f21715n = iee;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ((ico) arrayList.get(i)).f18176b = this;
            i = i2;
        }
        this.f21706e = new idt(this, looper);
        this.f21703b = lock.newCondition();
        this.f21712k = new idm(this);
    }

    /* renamed from: a */
    public final ich mo1809a(ich ich) {
        ich.m12071d();
        return this.f21712k.mo1834a(ich);
    }

    /* renamed from: a */
    public final void mo1224a(int i) {
        this.f21702a.lock();
        try {
            this.f21712k.mo1836a(i);
        } finally {
            this.f21702a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo1225a(Bundle bundle) {
        this.f21702a.lock();
        try {
            this.f21712k.mo1837a(bundle);
        } finally {
            this.f21702a.unlock();
        }
    }

    /* renamed from: a */
    final void m16026a(ConnectionResult connectionResult) {
        this.f21702a.lock();
        try {
            this.f21716o = connectionResult;
            this.f21712k = new idm(this);
            this.f21712k.mo1835a();
            this.f21703b.signalAll();
        } finally {
            this.f21702a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo3124a(ConnectionResult connectionResult, huh huh, boolean z) {
        this.f21702a.lock();
        try {
            this.f21712k.mo1838a(connectionResult, huh, z);
        } finally {
            this.f21702a.unlock();
        }
    }

    /* renamed from: a */
    final void m16028a(ids ids) {
        this.f21706e.sendMessage(this.f21706e.obtainMessage(1, ids));
    }

    /* renamed from: b */
    public final ich mo1811b(ich ich) {
        ich.m12071d();
        return this.f21712k.mo1839b(ich);
    }

    /* renamed from: b */
    public final void mo1812b() {
        this.f21712k.mo1840b();
    }

    /* renamed from: c */
    public final void mo1813c() {
        if (this.f21712k.mo1841c()) {
            this.f21708g.clear();
        }
    }

    /* renamed from: d */
    public final boolean mo1814d() {
        return this.f21712k instanceof icz;
    }

    /* renamed from: a */
    public final ConnectionResult mo1808a() {
        mo1812b();
        while (this.f21712k instanceof idb) {
            try {
                this.f21703b.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (mo1814d()) {
            return ConnectionResult.f20457a;
        }
        ConnectionResult connectionResult = this.f21716o;
        return connectionResult == null ? new ConnectionResult(13, null) : connectionResult;
    }

    /* renamed from: a */
    public final void mo1810a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f21712k);
        for (huh huh : this.f21710i.keySet()) {
            printWriter.append(str).append(huh.f6675a).println(":");
            ((huo) this.f21707f.get(huh.m3471b())).m11993a(concat, printWriter);
        }
    }
}
