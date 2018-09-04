package p000;

import java.io.File;
import java.io.FileFilter;

/* compiled from: PG */
/* renamed from: gnw */
final class gnw implements FileFilter {
    gnw() {
    }

    public final boolean accept(File file) {
        return file.isDirectory();
    }
}
