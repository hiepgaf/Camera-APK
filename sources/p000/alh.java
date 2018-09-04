package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: alh */
public final class alh implements ajz {
    /* renamed from: a */
    private static final Set f9876a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    /* renamed from: b */
    private final ajz f9877b;

    public alh(ajz ajz) {
        this.f9877b = ajz;
    }

    /* renamed from: a */
    public final /* synthetic */ aka mo88a(Object obj, int i, int i2, adp adp) {
        return this.f9877b.mo88a(new ajl(((Uri) obj).toString()), i, i2, adp);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo89a(Object obj) {
        return f9876a.contains(((Uri) obj).getScheme());
    }
}
