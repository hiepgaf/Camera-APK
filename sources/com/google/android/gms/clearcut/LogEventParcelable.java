package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import p000.htk;
import p000.htl;
import p000.hty;
import p000.ibw;

public class LogEventParcelable extends zza {
    public static final Creator CREATOR = new hty();
    /* renamed from: a */
    public PlayLoggerContext f20438a;
    /* renamed from: b */
    public byte[] f20439b;
    /* renamed from: c */
    public final ibw f20440c;
    /* renamed from: d */
    public final htk f20441d;
    /* renamed from: e */
    public final htk f20442e;
    /* renamed from: f */
    private int[] f20443f;
    /* renamed from: g */
    private String[] f20444g;
    /* renamed from: h */
    private int[] f20445h;
    /* renamed from: i */
    private byte[][] f20446i;
    /* renamed from: j */
    private boolean f20447j;

    public LogEventParcelable(PlayLoggerContext playLoggerContext, ibw ibw, htk htk, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, boolean z) {
        this.f20438a = playLoggerContext;
        this.f20440c = ibw;
        this.f20441d = null;
        this.f20442e = null;
        this.f20443f = iArr;
        this.f20444g = strArr;
        this.f20445h = iArr2;
        this.f20446i = bArr;
        this.f20447j = z;
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z) {
        this.f20438a = playLoggerContext;
        this.f20439b = bArr;
        this.f20443f = iArr;
        this.f20444g = strArr;
        this.f20440c = null;
        this.f20441d = null;
        this.f20442e = null;
        this.f20445h = iArr2;
        this.f20446i = bArr2;
        this.f20447j = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogEventParcelable)) {
            return false;
        }
        LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
        return htl.m3426a(this.f20438a, logEventParcelable.f20438a) && Arrays.equals(this.f20439b, logEventParcelable.f20439b) && Arrays.equals(this.f20443f, logEventParcelable.f20443f) && Arrays.equals(this.f20444g, logEventParcelable.f20444g) && htl.m3426a(this.f20440c, logEventParcelable.f20440c) && htl.m3426a(this.f20441d, logEventParcelable.f20441d) && htl.m3426a(null, null) && Arrays.equals(this.f20445h, logEventParcelable.f20445h) && Arrays.deepEquals(this.f20446i, logEventParcelable.f20446i) && this.f20447j == logEventParcelable.f20447j;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20438a, this.f20439b, this.f20443f, this.f20444g, this.f20440c, this.f20441d, null, this.f20445h, this.f20446i, Boolean.valueOf(this.f20447j)});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LogEventParcelable[");
        stringBuilder.append(this.f20438a);
        stringBuilder.append(", ");
        stringBuilder.append("LogEventBytes: ");
        byte[] bArr = this.f20439b;
        stringBuilder.append(bArr != null ? new String(bArr) : null);
        stringBuilder.append(", ");
        stringBuilder.append("TestCodes: ");
        stringBuilder.append(Arrays.toString(this.f20443f));
        stringBuilder.append(", ");
        stringBuilder.append("MendelPackages: ");
        stringBuilder.append(Arrays.toString(this.f20444g));
        stringBuilder.append(", ");
        stringBuilder.append("LogEvent: ");
        stringBuilder.append(this.f20440c);
        stringBuilder.append(", ");
        stringBuilder.append("ExtensionProducer: ");
        stringBuilder.append(this.f20441d);
        stringBuilder.append(", ");
        stringBuilder.append("VeProducer: ");
        stringBuilder.append(null);
        stringBuilder.append(", ");
        stringBuilder.append("ExperimentIDs: ");
        stringBuilder.append(Arrays.toString(this.f20445h));
        stringBuilder.append(", ");
        stringBuilder.append("ExperimentTokens: ");
        stringBuilder.append(Arrays.toString(this.f20446i));
        stringBuilder.append(", ");
        stringBuilder.append("AddPhenotypeExperimentTokens: ");
        stringBuilder.append(this.f20447j);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3430b(parcel, 20293);
        htl.m3411a(parcel, 2, this.f20438a, i);
        htl.m3415a(parcel, 3, this.f20439b);
        htl.m3416a(parcel, 4, this.f20443f);
        htl.m3418a(parcel, 5, this.f20444g);
        htl.m3416a(parcel, 6, this.f20445h);
        byte[][] bArr = this.f20446i;
        if (bArr != null) {
            int b2 = htl.m3430b(parcel, 7);
            parcel.writeInt(r4);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            htl.m3439c(parcel, b2);
        }
        htl.m3414a(parcel, 8, this.f20447j);
        htl.m3439c(parcel, b);
    }
}
