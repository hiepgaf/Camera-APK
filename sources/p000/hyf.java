package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: hyf */
public final class hyf implements Callable {
    /* renamed from: a */
    private final /* synthetic */ SharedPreferences f6817a;
    /* renamed from: b */
    private final /* synthetic */ String f6818b;
    /* renamed from: c */
    private final /* synthetic */ String f6819c;

    public hyf(SharedPreferences sharedPreferences, String str, String str2) {
        this.f6817a = sharedPreferences;
        this.f6818b = str;
        this.f6819c = str2;
    }

    public final /* synthetic */ Object call() {
        return this.f6817a.getString(this.f6818b, this.f6819c);
    }
}
