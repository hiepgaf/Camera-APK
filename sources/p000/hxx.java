package p000;

import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.List;

/* renamed from: hxx */
public final class hxx implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        LogOptions logOptions = null;
        int a = htl.m3392a(parcel);
        boolean z = false;
        ThemeSettings themeSettings = null;
        List list = null;
        String str = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case '\u0002':
                    str4 = htl.m3447j(parcel, readInt);
                    break;
                case '\u0003':
                    bundle = htl.m3449l(parcel, readInt);
                    break;
                case '\u0005':
                    str3 = htl.m3447j(parcel, readInt);
                    break;
                case '\u0006':
                    applicationErrorReport = (ApplicationErrorReport) htl.m3397a(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case '\u0007':
                    str2 = htl.m3447j(parcel, readInt);
                    break;
                case '\b':
                    bitmapTeleporter = (BitmapTeleporter) htl.m3397a(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case '\t':
                    str = htl.m3447j(parcel, readInt);
                    break;
                case '\n':
                    list = htl.m3438c(parcel, readInt, FileTeleporter.CREATOR);
                    break;
                case '\u000b':
                    z = htl.m3443f(parcel, readInt);
                    break;
                case '\f':
                    themeSettings = (ThemeSettings) htl.m3397a(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case '\r':
                    logOptions = (LogOptions) htl.m3397a(parcel, readInt, LogOptions.CREATOR);
                    break;
                default:
                    htl.m3442e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new FeedbackOptions(str4, bundle, str3, applicationErrorReport, str2, bitmapTeleporter, str, list, z, themeSettings, logOptions);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FeedbackOptions[i];
    }
}
