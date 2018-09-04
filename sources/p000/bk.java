package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: bk */
public final class bk extends jb {
    public static final Creator CREATOR = new bl();
    /* renamed from: a */
    public final int f10974a;

    public bk(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10974a = parcel.readInt();
    }

    public bk(Parcelable parcelable, int i) {
        super(parcelable);
        this.f10974a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f10974a);
    }
}
