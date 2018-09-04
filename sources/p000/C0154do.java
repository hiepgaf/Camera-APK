package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;

/* compiled from: PG */
/* renamed from: do */
public final class C0154do extends jb {
    public static final Creator CREATOR = new dp();
    /* renamed from: a */
    public SparseArray f13595a;

    public C0154do(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f13595a = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f13595a.append(iArr[i], readParcelableArray[i]);
        }
    }

    public C0154do(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int size;
        int i2 = 0;
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f13595a;
        if (sparseArray != null) {
            size = sparseArray.size();
        } else {
            size = 0;
        }
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        while (i2 < size) {
            iArr[i2] = this.f13595a.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f13595a.valueAt(i2);
            i2++;
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
