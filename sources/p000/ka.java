package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: ka */
public final class ka extends jb {
    public static final Creator CREATOR = new kb();
    /* renamed from: a */
    public int f19134a;
    /* renamed from: b */
    public Parcelable f19135b;
    /* renamed from: c */
    public ClassLoader f19136c;

    ka(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        this.f19134a = parcel.readInt();
        this.f19135b = parcel.readParcelable(classLoader);
        this.f19136c = classLoader;
    }

    public ka(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FragmentPager.SavedState{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" position=");
        stringBuilder.append(this.f19134a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f19134a);
        parcel.writeParcelable(this.f19135b, i);
    }
}
