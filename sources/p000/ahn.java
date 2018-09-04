package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ahn */
public final class ahn {
    /* renamed from: a */
    public final long f459a;
    /* renamed from: b */
    public final aht f460b;

    public ahn(Context context) {
        this(context, "image_manager_disk_cache");
    }

    private ahn(Context context, String str) {
        this(new aht(context, str));
    }

    private ahn(aht aht) {
        this.f459a = 262144000;
        this.f460b = aht;
    }
}
