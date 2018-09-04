package p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.api.Status;
import com.google.common.logging.nano.eventprotos$CameraEvent;

/* compiled from: PG */
/* renamed from: epd */
public final class epd implements epc {
    /* renamed from: a */
    private final hth f15339a;

    public epd(Context context) {
        this.f15339a = new hth(context, "ANDROID_CAMERA");
        blp.f1266a.mo511a("GcaClearcutLog");
    }

    /* renamed from: a */
    public final void mo774a(eventprotos$CameraEvent eventprotos_cameraevent) {
        icw icw = new icw(this.f15339a, kvl.toByteArray(eventprotos_cameraevent));
        if (icw.f18218h) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        icw.f18218h = true;
        LogEventParcelable logEventParcelable = new LogEventParcelable(new PlayLoggerContext(icw.f18219i.f6643d, icw.f18219i.f6644e, icw.f18211a, icw.f18212b, icw.f18213c, icw.f18214d, false, icw.f18215e), icw.f18217g, null, null, null, null, null, icw.f18216f);
        PlayLoggerContext playLoggerContext = logEventParcelable.f20438a;
        if (icw.f18219i.f6651l.mo1778a(playLoggerContext.f20449b, playLoggerContext.f20448a)) {
            icw.f18219i.f6648i.mo1777a(logEventParcelable);
            return;
        }
        Object obj = Status.f20464a;
        htl.m3432b(obj, (Object) "Result must not be null");
        new hzw(Looper.getMainLooper()).m12065a((hux) obj);
    }
}
