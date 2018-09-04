package p000;

import android.content.Context;
import java.lang.Thread.UncaughtExceptionHandler;

/* compiled from: PG */
/* renamed from: ban */
public final class ban extends bas {
    /* renamed from: a */
    private final Context f10615a;

    public ban(Context context, UncaughtExceptionHandler uncaughtExceptionHandler) {
        super(uncaughtExceptionHandler);
        this.f10615a = context;
    }

    /* renamed from: a */
    protected final void mo418a(Throwable th) {
        bap.m775a(this.f10615a, th, "com.android.camera.silentfeedback.SILENT_FEEDBACK");
    }
}
