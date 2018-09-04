package p000;

import android.content.Intent;
import com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService;

/* compiled from: PG */
/* renamed from: baq */
public final class baq implements kov {
    /* renamed from: a */
    public final /* synthetic */ SilentFeedbackService f10618a;
    /* renamed from: b */
    private final /* synthetic */ Intent f10619b;

    public baq(SilentFeedbackService silentFeedbackService, Intent intent) {
        this.f10618a = silentFeedbackService;
        this.f10619b = intent;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m867b(SilentFeedbackService.f2238a, "GoogleApiClient silent feedback connection failed with result", th);
        this.f10618a.m1218a();
    }

    public final /* synthetic */ void b_(Object obj) {
        hjk hjk = (hjk) obj;
        bli.m871d(SilentFeedbackService.f2238a, "GoogleAPIClient connected.");
        try {
            Intent intent = this.f10619b;
            bli.m871d(SilentFeedbackService.f2238a, "Building crash options.");
            hxu hxv = new hxv();
            if (intent != null) {
                hxv.f6795a = " ";
                hxv.f6797c = true;
                if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.exceptionClass")) {
                    hxv.m12018a(intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.exceptionClass"));
                }
                if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.stackTrace")) {
                    hxv.m12019b(intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.stackTrace"));
                }
                if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingClass")) {
                    hxv.m12020c(intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingClass"));
                }
                if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingFile")) {
                    hxv.m12021d(intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingFile"));
                }
                if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingLine")) {
                    hxv.m12017a(intent.getIntExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingLine", -1));
                }
                if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingMethod")) {
                    hxv.m12022e(intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingMethod"));
                }
                if (intent.hasExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.categoryTag")) {
                    hxv.f6796b = intent.getStringExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.categoryTag");
                }
            }
            hxp.m3576a(hjk.f6271a.f17906a, hxv.mo1787a()).mo1807a(new bar(this, hjk));
        } catch (UnsupportedOperationException e) {
            bli.m863a(SilentFeedbackService.f2238a, "Could not clean PII, no feedback sent.");
            this.f10618a.m1218a();
        }
    }
}
