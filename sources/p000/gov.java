package p000;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

/* compiled from: PG */
/* renamed from: gov */
final class gov implements OnSharedPreferenceChangeListener {
    /* renamed from: a */
    private final /* synthetic */ gol f5610a;

    gov(gol gol) {
        this.f5610a = gol;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f5610a.mo1526a(str);
    }
}
