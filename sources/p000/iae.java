package p000;

import android.app.ApplicationErrorReport;
import android.app.ApplicationErrorReport.CrashInfo;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.io.File;
import java.util.List;

/* renamed from: iae */
public final class iae extends hwc {
    /* renamed from: l */
    private Context f23338l;

    public iae(Context context, Looper looper, hus hus, hut hut, hvx hvx) {
        super(context, looper, 29, hvx, hus, hut);
        this.f23338l = context;
    }

    /* renamed from: a */
    public final ErrorReport m17555a(FeedbackOptions feedbackOptions) {
        File cacheDir = this.f23338l.getCacheDir();
        ErrorReport errorReport = new ErrorReport();
        if (feedbackOptions != null) {
            CrashInfo crashInfo;
            Bundle bundle = feedbackOptions.f20560b;
            if (bundle != null && bundle.size() > 0) {
                errorReport.f20536d = feedbackOptions.f20560b;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f20559a)) {
                errorReport.f20535c = feedbackOptions.f20559a;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f20561c)) {
                errorReport.f20534b = feedbackOptions.f20561c;
            }
            ApplicationErrorReport applicationErrorReport = feedbackOptions.f20562d;
            if (applicationErrorReport != null) {
                crashInfo = applicationErrorReport.crashInfo;
            } else {
                crashInfo = null;
            }
            if (crashInfo != null) {
                errorReport.f20541i = crashInfo.throwMethodName;
                errorReport.f20539g = crashInfo.throwLineNumber;
                errorReport.f20540h = crashInfo.throwClassName;
                errorReport.f20542j = crashInfo.stackTrace;
                errorReport.f20537e = crashInfo.exceptionClassName;
                errorReport.f20543k = crashInfo.exceptionMessage;
                errorReport.f20538f = crashInfo.throwFileName;
            }
            ThemeSettings themeSettings = feedbackOptions.f20568j;
            if (themeSettings != null) {
                errorReport.f20549q = themeSettings;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f20563e)) {
                errorReport.f20544l = feedbackOptions.f20563e;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f20565g)) {
                errorReport.f20533a.packageName = feedbackOptions.f20565g;
            }
            BitmapTeleporter bitmapTeleporter = feedbackOptions.f20564f;
            if (!(bitmapTeleporter == null || cacheDir == null)) {
                errorReport.f20545m = bitmapTeleporter;
                bitmapTeleporter = errorReport.f20545m;
                if (cacheDir == null) {
                    throw new NullPointerException("Cannot set null temp directory");
                }
                bitmapTeleporter.f20472a = cacheDir;
            }
            List list = feedbackOptions.f20566h;
            if (!(list == null || list.size() == 0 || cacheDir == null)) {
                for (FileTeleporter fileTeleporter : feedbackOptions.f20566h) {
                    if (cacheDir == null) {
                        throw new NullPointerException("Cannot set null temp directory");
                    }
                    fileTeleporter.f20570a = cacheDir;
                }
                list = feedbackOptions.f20566h;
                errorReport.f20546n = (FileTeleporter[]) list.toArray(new FileTeleporter[list.size()]);
            }
            LogOptions logOptions = feedbackOptions.f20569k;
            if (logOptions != null) {
                errorReport.f20550r = logOptions;
            }
            errorReport.f20547o = feedbackOptions.f20567i;
        }
        return errorReport;
    }

    /* renamed from: a */
    protected final String mo3468a() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    /* renamed from: b */
    protected final String mo3469b() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface mo3467a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof iaf)) ? new iaf(iBinder) : (iaf) queryLocalInterface;
    }
}
