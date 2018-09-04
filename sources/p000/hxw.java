package p000;

import android.app.ApplicationErrorReport;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.List;

/* renamed from: hxw */
public final class hxw implements Creator {
    /* renamed from: a */
    private static ErrorReport m3579a(Parcel parcel) {
        int a = htl.m3392a(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String str = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i2 = 0;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str14 = null;
        String str15 = null;
        byte[] bArr = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        Bundle bundle = null;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        String str19 = null;
        String str20 = null;
        int i9 = 0;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str28 = null;
        FileTeleporter[] fileTeleporterArr = null;
        String[] strArr4 = null;
        boolean z3 = false;
        String str29 = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        String str30 = null;
        boolean z4 = false;
        Bundle bundle2 = null;
        List list = null;
        while (parcel.dataPosition() < a) {
            int b = htl.m3429b(parcel);
            switch (htl.m3428b(b)) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) htl.m3397a(parcel, b, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    str = htl.m3447j(parcel, b);
                    break;
                case 4:
                    i = htl.m3445h(parcel, b);
                    break;
                case 5:
                    str2 = htl.m3447j(parcel, b);
                    break;
                case 6:
                    str3 = htl.m3447j(parcel, b);
                    break;
                case 7:
                    str4 = htl.m3447j(parcel, b);
                    break;
                case 8:
                    str5 = htl.m3447j(parcel, b);
                    break;
                case 9:
                    str6 = htl.m3447j(parcel, b);
                    break;
                case 10:
                    str7 = htl.m3447j(parcel, b);
                    break;
                case 11:
                    str8 = htl.m3447j(parcel, b);
                    break;
                case 12:
                    i2 = htl.m3445h(parcel, b);
                    break;
                case 13:
                    str9 = htl.m3447j(parcel, b);
                    break;
                case 14:
                    str10 = htl.m3447j(parcel, b);
                    break;
                case 15:
                    str11 = htl.m3447j(parcel, b);
                    break;
                case 16:
                    str12 = htl.m3447j(parcel, b);
                    break;
                case 17:
                    str13 = htl.m3447j(parcel, b);
                    break;
                case 18:
                    strArr = htl.m3427a(parcel, b);
                    break;
                case 19:
                    strArr2 = htl.m3427a(parcel, b);
                    break;
                case 20:
                    strArr3 = htl.m3427a(parcel, b);
                    break;
                case 21:
                    str14 = htl.m3447j(parcel, b);
                    break;
                case 22:
                    str15 = htl.m3447j(parcel, b);
                    break;
                case 23:
                    bArr = htl.m3450m(parcel, b);
                    break;
                case 24:
                    i3 = htl.m3445h(parcel, b);
                    break;
                case 25:
                    i4 = htl.m3445h(parcel, b);
                    break;
                case 26:
                    i5 = htl.m3445h(parcel, b);
                    break;
                case 27:
                    i6 = htl.m3445h(parcel, b);
                    break;
                case 28:
                    str16 = htl.m3447j(parcel, b);
                    break;
                case 29:
                    str17 = htl.m3447j(parcel, b);
                    break;
                case 30:
                    str18 = htl.m3447j(parcel, b);
                    break;
                case 31:
                    bundle = htl.m3449l(parcel, b);
                    break;
                case 32:
                    z = htl.m3443f(parcel, b);
                    break;
                case 33:
                    i7 = htl.m3445h(parcel, b);
                    break;
                case 34:
                    i8 = htl.m3445h(parcel, b);
                    break;
                case 35:
                    z2 = htl.m3443f(parcel, b);
                    break;
                case 36:
                    str19 = htl.m3447j(parcel, b);
                    break;
                case 37:
                    str20 = htl.m3447j(parcel, b);
                    break;
                case 38:
                    i9 = htl.m3445h(parcel, b);
                    break;
                case 39:
                    str21 = htl.m3447j(parcel, b);
                    break;
                case 40:
                    str22 = htl.m3447j(parcel, b);
                    break;
                case 41:
                    str23 = htl.m3447j(parcel, b);
                    break;
                case 42:
                    str24 = htl.m3447j(parcel, b);
                    break;
                case 43:
                    str25 = htl.m3447j(parcel, b);
                    break;
                case 44:
                    str26 = htl.m3447j(parcel, b);
                    break;
                case 45:
                    str27 = htl.m3447j(parcel, b);
                    break;
                case 46:
                    bitmapTeleporter = (BitmapTeleporter) htl.m3397a(parcel, b, BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    str28 = htl.m3447j(parcel, b);
                    break;
                case 48:
                    fileTeleporterArr = (FileTeleporter[]) htl.m3437b(parcel, b, FileTeleporter.CREATOR);
                    break;
                case 49:
                    strArr4 = htl.m3427a(parcel, b);
                    break;
                case 50:
                    z3 = htl.m3443f(parcel, b);
                    break;
                case 51:
                    str29 = htl.m3447j(parcel, b);
                    break;
                case 52:
                    themeSettings = (ThemeSettings) htl.m3397a(parcel, b, ThemeSettings.CREATOR);
                    break;
                case 53:
                    logOptions = (LogOptions) htl.m3397a(parcel, b, LogOptions.CREATOR);
                    break;
                case 54:
                    str30 = htl.m3447j(parcel, b);
                    break;
                case 55:
                    z4 = htl.m3443f(parcel, b);
                    break;
                case 56:
                    bundle2 = htl.m3449l(parcel, b);
                    break;
                case 57:
                    list = htl.m3438c(parcel, b, RectF.CREATOR);
                    break;
                default:
                    htl.m3442e(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new ErrorReport(applicationErrorReport, str, i, str2, str3, str4, str5, str6, str7, str8, i2, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i3, i4, i5, i6, str16, str17, str18, bundle, z, i7, i8, z2, str19, str20, i9, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, fileTeleporterArr, strArr4, z3, str29, themeSettings, logOptions, str30, z4, bundle2, list);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return hxw.m3579a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ErrorReport[i];
    }
}
