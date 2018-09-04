package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: iqv */
public final class iqv implements iqz, ira {
    /* renamed from: a */
    private final String f18513a;
    /* renamed from: b */
    private final iqu f18514b;

    public iqv(String str, iqu iqu) {
        this.f18513a = str;
        this.f18514b = iqu;
    }

    /* renamed from: a */
    public final iqz mo511a(String str) {
        iqu iqu = this.f18514b;
        String valueOf = String.valueOf(iqu.f7337a);
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        int length = str.length();
        int i = iqu.f7338b;
        if (length > i) {
            iqv a = iqu.mo509a(valueOf2.substring(0, i));
            i = str.length();
            int i2 = iqu.f7338b;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 44);
            stringBuilder.append("Tag ");
            stringBuilder.append(str);
            stringBuilder.append(" is ");
            stringBuilder.append(i - i2);
            stringBuilder.append(" chars longer than limit.");
            a.mo520f(stringBuilder.toString());
        }
        return iqu.mo509a(valueOf2);
    }

    /* renamed from: b */
    public final void mo514b(String str) {
        if (this.f18514b.mo510a(this.f18513a, 3)) {
            Log.d(this.f18513a, str);
        }
    }

    /* renamed from: a */
    public final void mo513a(String str, Throwable th) {
        if (this.f18514b.mo510a(this.f18513a, 3)) {
            Log.d(this.f18513a, str, th);
        }
    }

    /* renamed from: c */
    public final void mo516c(String str) {
        if (this.f18514b.mo510a(this.f18513a, 6)) {
            Log.e(this.f18513a, str);
        }
    }

    /* renamed from: b */
    public final void mo515b(String str, Throwable th) {
        if (this.f18514b.mo510a(this.f18513a, 6)) {
            Log.e(this.f18513a, str, th);
        }
    }

    /* renamed from: d */
    public final void mo518d(String str) {
        if (this.f18514b.mo510a(this.f18513a, 4)) {
            Log.i(this.f18513a, str);
        }
    }

    /* renamed from: e */
    public final void mo519e(String str) {
        if (this.f18514b.mo510a(this.f18513a, 2)) {
            Log.v(this.f18513a, str);
        }
    }

    /* renamed from: f */
    public final void mo520f(String str) {
        if (this.f18514b.mo510a(this.f18513a, 5)) {
            Log.w(this.f18513a, str);
        }
    }

    /* renamed from: c */
    public final void mo517c(String str, Throwable th) {
        if (this.f18514b.mo510a(this.f18513a, 5)) {
            Log.w(this.f18513a, str, th);
        }
    }
}
