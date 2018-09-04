package p000;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* renamed from: eme */
final class eme implements FilenameFilter {
    eme() {
    }

    public final boolean accept(File file, String str) {
        return str.toLowerCase().endsWith(".jpg");
    }
}
