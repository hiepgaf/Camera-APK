package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: hye */
public final class hye implements Callable {
    /* renamed from: a */
    private final /* synthetic */ SharedPreferences f6814a;
    /* renamed from: b */
    private final /* synthetic */ String f6815b;
    /* renamed from: c */
    private final /* synthetic */ Long f6816c;

    public hye(SharedPreferences sharedPreferences, String str, Long l) {
        this.f6814a = sharedPreferences;
        this.f6815b = str;
        this.f6816c = l;
    }

    public final /* synthetic */ Object call() {
        return Long.valueOf(this.f6814a.getLong(this.f6815b, this.f6816c.longValue()));
    }
}
