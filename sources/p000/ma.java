package p000;

import android.content.Context;
import android.widget.ArrayAdapter;

/* compiled from: PG */
/* renamed from: ma */
public final class ma extends ArrayAdapter {
    public ma(Context context, int i) {
        super(context, i, 16908308, null);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final boolean hasStableIds() {
        return true;
    }
}
