package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: us */
public final class us extends jb {
    public static final Creator CREATOR = new ut();
    /* renamed from: a */
    public Parcelable f19645a;

    us(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            classLoader = ug.class.getClassLoader();
        }
        this.f19645a = parcel.readParcelable(classLoader);
    }

    public us(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f19645a, 0);
    }
}
