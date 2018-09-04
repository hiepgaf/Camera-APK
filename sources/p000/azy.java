package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.service.voice.VoiceInteractionService;
import android.util.Log;

/* compiled from: PG */
/* renamed from: azy */
public final class azy implements baf {
    /* renamed from: a */
    private static final ComponentName f10588a = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.voiceinteraction.GsaVoiceInteractionService");
    /* renamed from: b */
    private final Context f10589b;
    /* renamed from: c */
    private final ilp f10590c;

    public azy(Context context, ilp ilp) {
        this.f10589b = context;
        this.f10590c = ilp;
    }

    /* renamed from: a */
    public final void mo411a() {
        boolean z;
        boolean z2 = false;
        long currentTimeMillis = System.currentTimeMillis();
        Intent intent = new Intent();
        intent.addFlags(268468224);
        intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivityFromDeeplink"));
        if (this.f10589b.getPackageManager().resolveActivity(intent, 0) != null) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder stringBuilder = new StringBuilder(25);
        stringBuilder.append("Assistant available:");
        stringBuilder.append(z);
        Log.i("AgsaAvailibility", stringBuilder.toString());
        if (z) {
            z = VoiceInteractionService.isActiveService(this.f10589b, f10588a);
            stringBuilder = new StringBuilder(24);
            stringBuilder.append("Assistant selected:");
            stringBuilder.append(z);
            Log.i("AgsaAvailibility", stringBuilder.toString());
            if (z) {
                z2 = true;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        stringBuilder = new StringBuilder(53);
        stringBuilder.append("Enabled property is:");
        stringBuilder.append(z2);
        stringBuilder.append(", Took: ");
        stringBuilder.append(currentTimeMillis2 - currentTimeMillis);
        Log.i("AgsaAvailibility", stringBuilder.toString());
        this.f10590c.mo348a(Boolean.valueOf(z2));
    }
}
