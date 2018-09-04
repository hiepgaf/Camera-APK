package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: ajk */
final class ajk implements ajj {
    ajk() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo97a(Object obj) {
        ((InputStream) obj).close();
    }

    /* renamed from: a */
    public final Class mo95a() {
        return InputStream.class;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo96a(File file) {
        return new FileInputStream(file);
    }
}
