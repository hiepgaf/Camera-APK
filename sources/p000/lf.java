package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: lf */
public final class lf extends jb {
    public static final Creator CREATOR = new lg();
    /* renamed from: a */
    public int f19332a = 0;
    /* renamed from: b */
    public int f19333b;
    /* renamed from: c */
    public int f19334c;
    /* renamed from: f */
    public int f19335f;
    /* renamed from: g */
    public int f19336g;

    public lf(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f19332a = parcel.readInt();
        this.f19333b = parcel.readInt();
        this.f19334c = parcel.readInt();
        this.f19335f = parcel.readInt();
        this.f19336g = parcel.readInt();
    }

    public lf(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f19332a);
        parcel.writeInt(this.f19333b);
        parcel.writeInt(this.f19334c);
        parcel.writeInt(this.f19335f);
        parcel.writeInt(this.f19336g);
    }
}
