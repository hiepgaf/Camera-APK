package p000;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: hl */
final class hl implements Callable {
    /* renamed from: a */
    private final /* synthetic */ Context f6333a;
    /* renamed from: b */
    private final /* synthetic */ hj f6334b;
    /* renamed from: c */
    private final /* synthetic */ int f6335c;
    /* renamed from: d */
    private final /* synthetic */ String f6336d;

    hl(Context context, hj hjVar, int i, String str) {
        this.f6333a = context;
        this.f6334b = hjVar;
        this.f6335c = i;
        this.f6336d = str;
    }

    public final /* synthetic */ Object call() {
        hr a = hk.m3217a(this.f6333a, this.f6334b, this.f6335c);
        if (a.f6464a != null) {
            hk.f6284a.m3904a(this.f6336d, a.f6464a);
        }
        return a;
    }
}
