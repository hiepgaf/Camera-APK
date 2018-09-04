package p000;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* renamed from: jw */
public final class jw extends jd {
    /* renamed from: c */
    private final /* synthetic */ ViewPager f19076c;

    public jw(ViewPager viewPager) {
        this.f19076c = viewPager;
    }

    /* renamed from: a */
    private final boolean m13254a() {
        jl jlVar = this.f19076c.f584d;
        return jlVar != null && jlVar.getCount() > 1;
    }

    /* renamed from: a */
    public final void mo683a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo683a(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        accessibilityEvent.setScrollable(m13254a());
        if (accessibilityEvent.getEventType() == 4096) {
            jl jlVar = this.f19076c.f584d;
            if (jlVar != null) {
                accessibilityEvent.setItemCount(jlVar.getCount());
                accessibilityEvent.setFromIndex(this.f19076c.f585e);
                accessibilityEvent.setToIndex(this.f19076c.f585e);
            }
        }
    }

    /* renamed from: a */
    public final void mo684a(View view, kk kkVar) {
        super.mo684a(view, kkVar);
        kkVar.m4986a(ViewPager.class.getName());
        kkVar.m4993d(m13254a());
        if (this.f19076c.canScrollHorizontally(1)) {
            kkVar.m4983a(4096);
        }
        if (this.f19076c.canScrollHorizontally(-1)) {
            kkVar.m4983a(8192);
        }
    }

    /* renamed from: a */
    public final boolean mo2056a(View view, int i, Bundle bundle) {
        if (super.mo2056a(view, i, bundle)) {
            return true;
        }
        ViewPager viewPager;
        switch (i) {
            case 4096:
                if (!this.f19076c.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager = this.f19076c;
                viewPager.m400a(viewPager.f585e + 1);
                return true;
            case 8192:
                if (!this.f19076c.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = this.f19076c;
                viewPager.m400a(viewPager.f585e - 1);
                return true;
            default:
                return false;
        }
    }
}
