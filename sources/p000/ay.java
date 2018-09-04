package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: ay */
public final class ay extends jb {
    public static final Creator CREATOR = new az();
    /* renamed from: a */
    public int f10516a;
    /* renamed from: b */
    public float f10517b;
    /* renamed from: c */
    public boolean f10518c;

    public ay(Parcel parcel, ClassLoader classLoader) {
        boolean z;
        super(parcel, classLoader);
        this.f10516a = parcel.readInt();
        this.f10517b = parcel.readFloat();
        if (parcel.readByte() != (byte) 0) {
            z = true;
        } else {
            z = false;
        }
        this.f10518c = z;
    }

    public ay(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f10516a);
        parcel.writeFloat(this.f10517b);
        parcel.writeByte(this.f10518c);
    }
}
