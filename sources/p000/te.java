package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: te */
public final class te implements Parcelable {
    public static final Creator CREATOR = new tf();
    /* renamed from: a */
    public int f9274a;
    /* renamed from: b */
    public int f9275b;
    /* renamed from: c */
    public boolean f9276c;

    te(Parcel parcel) {
        boolean z = true;
        this.f9274a = parcel.readInt();
        this.f9275b = parcel.readInt();
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f9276c = z;
    }

    public te(te teVar) {
        this.f9274a = teVar.f9274a;
        this.f9275b = teVar.f9275b;
        this.f9276c = teVar.f9276c;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    final boolean m5836a() {
        return this.f9274a >= 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9274a);
        parcel.writeInt(this.f9275b);
        parcel.writeInt(this.f9276c);
    }
}
