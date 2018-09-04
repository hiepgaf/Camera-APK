package p000;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* renamed from: bjb */
final class bjb implements FilenameFilter {
    bjb() {
    }

    public final boolean accept(File file, String str) {
        return str.toLowerCase().endsWith(".mp4");
    }
}
