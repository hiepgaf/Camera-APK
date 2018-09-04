package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: hyd */
public final class hyd implements Callable {
    /* renamed from: a */
    private final /* synthetic */ SharedPreferences f6811a;
    /* renamed from: b */
    private final /* synthetic */ String f6812b;
    /* renamed from: c */
    private final /* synthetic */ Integer f6813c;

    public hyd(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f6811a = sharedPreferences;
        this.f6812b = str;
        this.f6813c = num;
    }

    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.f6811a.getInt(this.f6812b, this.f6813c.intValue()));
    }
}
