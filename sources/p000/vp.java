package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: vp */
public final class vp extends jb {
    public static final Creator CREATOR = new vq();
    /* renamed from: a */
    public int f19654a;
    /* renamed from: b */
    public boolean f19655b;

    public vp(Parcel parcel, ClassLoader classLoader) {
        boolean z;
        super(parcel, classLoader);
        this.f19654a = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f19655b = z;
    }

    public vp(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f19654a);
        parcel.writeInt(this.f19655b);
    }
}
