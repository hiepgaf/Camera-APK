package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.io.Closeable;
import p000.htl;
import p000.hvg;

@KeepName
public final class DataHolder extends zza implements Closeable {
    public static final Creator CREATOR = new hvg();
    /* renamed from: a */
    public final String[] f20477a;
    /* renamed from: b */
    public Bundle f20478b;
    /* renamed from: c */
    public final CursorWindow[] f20479c;
    /* renamed from: d */
    public int[] f20480d;
    /* renamed from: e */
    public int f20481e;
    /* renamed from: f */
    private final int f20482f;
    /* renamed from: g */
    private final int f20483g;
    /* renamed from: h */
    private final Bundle f20484h;
    /* renamed from: i */
    private boolean f20485i = false;
    /* renamed from: j */
    private boolean f20486j = true;

    static {
        htl htl = new htl(new String[0], (byte) 0);
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f20482f = i;
        this.f20477a = strArr;
        this.f20479c = cursorWindowArr;
        this.f20483g = i2;
        this.f20484h = bundle;
    }

    /* renamed from: a */
    private final boolean m15099a() {
        boolean z;
        synchronized (this) {
            z = this.f20485i;
        }
        return z;
    }

    public final void close() {
        synchronized (this) {
            if (!this.f20485i) {
                this.f20485i = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f20479c;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    protected final void finalize() {
        try {
            if (this.f20486j && this.f20479c.length > 0 && !m15099a()) {
                close();
                String valueOf = String.valueOf(toString());
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 178);
                stringBuilder.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                stringBuilder.append(valueOf);
                stringBuilder.append(")");
                Log.e("DataBuffer", stringBuilder.toString());
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3418a(parcel, 1, this.f20477a);
        htl.m3417a(parcel, 2, this.f20479c, i);
        htl.m3440c(parcel, 3, this.f20483g);
        htl.m3409a(parcel, 4, this.f20484h);
        htl.m3440c(parcel, 1000, this.f20482f);
        htl.m3439c(parcel, b);
    }
}
