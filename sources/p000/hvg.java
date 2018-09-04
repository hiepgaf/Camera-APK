package p000;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: hvg */
public final class hvg implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle bundle = null;
        int i = 0;
        int a = htl.m3392a(parcel);
        int i2 = 0;
        CursorWindow[] cursorWindowArr = null;
        String[] strArr = null;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0001':
                    strArr = htl.m3427a(parcel, readInt);
                    break;
                case '\u0002':
                    cursorWindowArr = (CursorWindow[]) htl.m3437b(parcel, readInt, CursorWindow.CREATOR);
                    break;
                case '\u0003':
                    i2 = htl.m3445h(parcel, readInt);
                    break;
                case '\u0004':
                    bundle = htl.m3449l(parcel, readInt);
                    break;
                case 'Ϩ':
                    i3 = htl.m3445h(parcel, readInt);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a) {
            StringBuilder stringBuilder = new StringBuilder(37);
            stringBuilder.append("Overread allowed size end=");
            stringBuilder.append(a);
            throw new aci(stringBuilder.toString(), parcel);
        }
        DataHolder dataHolder = new DataHolder(i3, strArr, cursorWindowArr, i2, bundle);
        dataHolder.f20478b = new Bundle();
        i3 = 0;
        while (true) {
            strArr = dataHolder.f20477a;
            if (i3 >= strArr.length) {
                dataHolder.f20480d = new int[dataHolder.f20479c.length];
                i3 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr2 = dataHolder.f20479c;
                    if (i < cursorWindowArr2.length) {
                        dataHolder.f20480d[i] = i3;
                        i3 += dataHolder.f20479c[i].getNumRows() - (i3 - cursorWindowArr2[i].getStartPosition());
                        i++;
                    } else {
                        dataHolder.f20481e = i3;
                        return dataHolder;
                    }
                }
            }
            dataHolder.f20478b.putInt(strArr[i3], i3);
            i3++;
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
