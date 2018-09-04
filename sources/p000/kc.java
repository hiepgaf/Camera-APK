package p000;

import android.view.View;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: kc */
public final class kc implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        jv jvVar = (jv) ((View) obj).getLayoutParams();
        jv jvVar2 = (jv) ((View) obj2).getLayoutParams();
        boolean z = jvVar.f7994a;
        if (z != jvVar2.f7994a) {
            return !z ? -1 : 1;
        } else {
            return jvVar.f7998e - jvVar2.f7998e;
        }
    }
}
