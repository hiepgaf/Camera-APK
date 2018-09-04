package p000;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: hyh */
final class hyh implements Callable {
    /* renamed from: a */
    private final /* synthetic */ Context f6821a;

    hyh(Context context) {
        this.f6821a = context;
    }

    public final /* synthetic */ Object call() {
        return this.f6821a.getSharedPreferences("google_sdk_flags", 1);
    }
}
