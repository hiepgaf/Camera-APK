package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: dg */
public final class dg extends jb {
    public static final Creator CREATOR = new dh();
    /* renamed from: a */
    public final iz f13112a;

    dg(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f13112a = new iz(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f13112a.put(strArr[i], bundleArr[i]);
        }
    }

    public dg(Parcelable parcelable) {
        super(parcelable);
        this.f13112a = new iz();
    }

    public final String toString() {
        String toHexString = Integer.toHexString(System.identityHashCode(this));
        String valueOf = String.valueOf(this.f13112a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(toHexString).length() + 30) + String.valueOf(valueOf).length());
        stringBuilder.append("ExtendableSavedState{");
        stringBuilder.append(toHexString);
        stringBuilder.append(" states=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f13112a.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Parcelable[] parcelableArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = (String) this.f13112a.m4356b(i2);
            parcelableArr[i2] = (Bundle) this.f13112a.m4358d(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(parcelableArr, 0);
    }
}
