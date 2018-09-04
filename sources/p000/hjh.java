package p000;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: hjh */
final class hjh implements FileFilter {
    hjh() {
    }

    public final boolean accept(File file) {
        if (Pattern.matches("cpu[0-9]+", file.getName())) {
            return true;
        }
        return false;
    }
}
