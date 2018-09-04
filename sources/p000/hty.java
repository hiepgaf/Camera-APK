package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;

/* renamed from: hty */
public final class hty implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3392a(parcel);
        boolean z = true;
        byte[][] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[] bArr2 = null;
        PlayLoggerContext playLoggerContext = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0002':
                    playLoggerContext = (PlayLoggerContext) htl.m3397a(parcel, readInt, PlayLoggerContext.CREATOR);
                    break;
                case '\u0003':
                    bArr2 = htl.m3450m(parcel, readInt);
                    break;
                case '\u0004':
                    iArr2 = htl.m3451n(parcel, readInt);
                    break;
                case '\u0005':
                    strArr = htl.m3427a(parcel, readInt);
                    break;
                case '\u0006':
                    iArr = htl.m3451n(parcel, readInt);
                    break;
                case '\u0007':
                    int d = htl.m3441d(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (d == 0) {
                        bArr = null;
                        break;
                    }
                    int readInt2 = parcel.readInt();
                    bArr = new byte[readInt2][];
                    for (readInt = 0; readInt < readInt2; readInt++) {
                        bArr[readInt] = parcel.createByteArray();
                    }
                    parcel.setDataPosition(dataPosition + d);
                    break;
                case '\b':
                    z = htl.m3443f(parcel, readInt);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new LogEventParcelable(playLoggerContext, bArr2, iArr2, strArr, iArr, bArr, z);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LogEventParcelable[i];
    }
}
