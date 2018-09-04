package p000;

import android.hardware.camera2.CaptureResult.Key;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: iug */
final class iug implements Comparator {
    iug() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Key) obj).getName().compareTo(((Key) obj2).getName());
    }
}
