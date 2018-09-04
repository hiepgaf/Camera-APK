package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: jb */
public class jb implements Parcelable {
    public static final Creator CREATOR = new jc();
    /* renamed from: d */
    public static final jb f7630d = new jb((byte) 0);
    /* renamed from: e */
    public final Parcelable f7631e;

    private jb() {
        this.f7631e = null;
    }

    private jb(byte b) {
        this();
    }

    public jb(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = f7630d;
        }
        this.f7631e = readParcelable;
    }

    public jb(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if (parcelable == f7630d) {
            parcelable = null;
        }
        this.f7631e = parcelable;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f7631e, i);
    }
}
