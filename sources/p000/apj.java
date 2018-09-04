package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: apj */
public final class apj extends Fragment {
    /* renamed from: a */
    public final aos f19807a;
    /* renamed from: b */
    public final aph f19808b;
    /* renamed from: c */
    public acm f19809c;
    /* renamed from: d */
    public Fragment f19810d;
    /* renamed from: e */
    private final Set f19811e;
    /* renamed from: f */
    private apj f19812f;

    public apj() {
        this(new aos());
    }

    @SuppressLint({"ValidFragment"})
    private apj(aos aos) {
        this.f19808b = new apk(this);
        this.f19811e = new HashSet();
        this.f19807a = aos;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            Context activity = getActivity();
            m14691a();
            this.f19812f = acc.m98a(activity).f192f.m541a(activity.getSupportFragmentManager(), activity.isFinishing() ^ 1);
            if (!equals(this.f19812f)) {
                this.f19812f.f19811e.add(this);
            }
        } catch (Throwable e) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f19807a.m6881a();
        m14691a();
    }

    public final void onDetach() {
        super.onDetach();
        this.f19810d = null;
        m14691a();
    }

    public final void onStart() {
        super.onStart();
        this.f19807a.m6883b();
    }

    public final void onStop() {
        super.onStop();
        this.f19807a.m6885c();
    }

    public final String toString() {
        String fragment = super.toString();
        Object parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        String valueOf = String.valueOf(parentFragment);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(fragment).length() + 9) + String.valueOf(valueOf).length());
        stringBuilder.append(fragment);
        stringBuilder.append("{parent=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private final void m14691a() {
        apj apj = this.f19812f;
        if (apj != null) {
            apj.f19811e.remove(this);
            this.f19812f = null;
        }
    }
}
