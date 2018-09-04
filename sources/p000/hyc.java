package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: hyc */
public final class hyc implements Callable {
    /* renamed from: a */
    private final /* synthetic */ SharedPreferences f6808a;
    /* renamed from: b */
    private final /* synthetic */ String f6809b;
    /* renamed from: c */
    private final /* synthetic */ Boolean f6810c;

    public hyc(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f6808a = sharedPreferences;
        this.f6809b = str;
        this.f6810c = bool;
    }

    public final /* synthetic */ Object call() {
        return Boolean.valueOf(this.f6808a.getBoolean(this.f6809b, this.f6810c.booleanValue()));
    }
}
