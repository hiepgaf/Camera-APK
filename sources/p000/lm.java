package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

/* compiled from: PG */
/* renamed from: lm */
public final class lm extends BaseSavedState {
    public static final Creator CREATOR = new ln();
    /* renamed from: a */
    public int f8781a;

    lm(Parcel parcel) {
        super(parcel);
        this.f8781a = parcel.readInt();
    }

    public lm(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HorizontalScrollView.SavedState{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" scrollPosition=");
        stringBuilder.append(this.f8781a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f8781a);
    }
}
