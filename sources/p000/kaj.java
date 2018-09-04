package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: kaj */
public final class kaj implements Parcelable, Comparable {
    public static final Creator CREATOR = new kak();
    /* renamed from: a */
    public final String f8169a;
    /* renamed from: b */
    public final long f8170b;
    /* renamed from: c */
    public final int f8171c;
    /* renamed from: d */
    public final String f8172d;

    kaj(Parcel parcel) {
        this.f8169a = parcel.readString();
        this.f8170b = parcel.readLong();
        this.f8171c = parcel.readInt();
        this.f8172d = parcel.readString();
    }

    public kaj(String str, long j, int i, String str2) {
        this.f8169a = str;
        this.f8170b = j;
        this.f8171c = i;
        this.f8172d = str2;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.f8169a.compareToIgnoreCase(((kaj) obj).f8169a);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f8169a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8169a);
        parcel.writeLong(this.f8170b);
        parcel.writeInt(this.f8171c);
        parcel.writeString(this.f8172d);
    }
}
