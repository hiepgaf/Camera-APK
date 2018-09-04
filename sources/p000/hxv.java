package p000;

import android.annotation.TargetApi;
import android.app.ApplicationErrorReport;
import android.app.ApplicationErrorReport.CrashInfo;
import android.text.TextUtils;
import com.google.android.gms.feedback.FeedbackOptions;

@TargetApi(14)
/* renamed from: hxv */
public final class hxv extends hxu {
    /* renamed from: d */
    public final ApplicationErrorReport f18134d;
    /* renamed from: e */
    public String f18135e;

    public hxv() {
        this.f18134d = new ApplicationErrorReport();
        this.f18134d.crashInfo = new CrashInfo();
        this.f18134d.crashInfo.throwLineNumber = -1;
    }

    /* renamed from: a */
    public final FeedbackOptions mo1787a() {
        htl.m3431b(this.f18134d.crashInfo.exceptionClassName);
        htl.m3431b(this.f18134d.crashInfo.throwClassName);
        htl.m3431b(this.f18134d.crashInfo.throwMethodName);
        htl.m3431b(this.f18134d.crashInfo.stackTrace);
        if (TextUtils.isEmpty(this.f18134d.crashInfo.throwFileName)) {
            this.f18134d.crashInfo.throwFileName = "unknown";
        }
        return super.mo1787a().f20562d.crashInfo = this.f18134d.crashInfo.f20565g = this.f18135e;
    }

    /* renamed from: a */
    public final hxv m12017a(int i) {
        this.f18134d.crashInfo.throwLineNumber = i;
        return this;
    }

    /* renamed from: a */
    public final hxv m12018a(String str) {
        this.f18134d.crashInfo.exceptionClassName = str;
        return this;
    }

    /* renamed from: b */
    public final hxv m12019b(String str) {
        this.f18134d.crashInfo.stackTrace = str;
        return this;
    }

    /* renamed from: c */
    public final hxv m12020c(String str) {
        this.f18134d.crashInfo.throwClassName = str;
        return this;
    }

    /* renamed from: d */
    public final hxv m12021d(String str) {
        this.f18134d.crashInfo.throwFileName = str;
        return this;
    }

    /* renamed from: e */
    public final hxv m12022e(String str) {
        this.f18134d.crashInfo.throwMethodName = str;
        return this;
    }
}
