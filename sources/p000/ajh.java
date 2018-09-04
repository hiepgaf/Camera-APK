package p000;

import android.os.ParcelFileDescriptor;
import java.io.File;

/* compiled from: PG */
/* renamed from: ajh */
final class ajh implements ajj {
    ajh() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo97a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    /* renamed from: a */
    public final Class mo95a() {
        return ParcelFileDescriptor.class;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo96a(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }
}
