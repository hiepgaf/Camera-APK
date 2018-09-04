package p000;

import android.util.Range;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: bil */
final class bil implements Comparator {
    bil() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Range range = (Range) obj;
        Range range2 = (Range) obj2;
        int intValue = ((Integer) range.getUpper()).intValue() - ((Integer) range2.getUpper()).intValue();
        if (intValue != 0) {
            return intValue;
        }
        return ((Integer) range.getLower()).intValue() - ((Integer) range2.getLower()).intValue();
    }
}
