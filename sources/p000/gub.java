package p000;

import android.os.StatFs;
import android.os.storage.StorageManager;

/* compiled from: PG */
/* renamed from: gub */
public final class gub {
    /* renamed from: a */
    private static final String f5696a = bli.m862a("PlatformSpaceChk");
    /* renamed from: b */
    private final StorageManager f5697b;
    /* renamed from: c */
    private final ivx f5698c;

    gub(StorageManager storageManager, ivx ivx) {
        this.f5697b = storageManager;
        this.f5698c = ivx;
    }

    /* renamed from: a */
    public final long m2833a(gsx gsx) {
        try {
            long allocatableBytes;
            if (this.f5698c.f7502c) {
                allocatableBytes = this.f5697b.getAllocatableBytes(this.f5697b.getUuidForPath(gsx.mo1623a()));
            } else {
                StatFs statFs = new StatFs(gsx.mo1624b());
                allocatableBytes = statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
            }
            String str = f5696a;
            StringBuilder stringBuilder = new StringBuilder(49);
            stringBuilder.append("available space size (byte): ");
            stringBuilder.append(allocatableBytes);
            bli.m863a(str, stringBuilder.toString());
            return allocatableBytes;
        } catch (Exception e) {
            return -1;
        }
    }
}
