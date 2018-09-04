package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* compiled from: PG */
/* renamed from: tq */
public final class tq extends sh {
    /* renamed from: c */
    public to f19638c;
    /* renamed from: d */
    private final int f19639d;
    /* renamed from: e */
    private final int f19640e;
    /* renamed from: f */
    private MenuItem f19641f;

    public tq(Context context, boolean z) {
        super(context, z);
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f19639d = 21;
            this.f19640e = 22;
            return;
        }
        this.f19639d = 22;
        this.f19640e = 21;
    }

    public final /* bridge */ /* synthetic */ boolean hasFocus() {
        return super.hasFocus();
    }

    public final /* bridge */ /* synthetic */ boolean hasWindowFocus() {
        return super.hasWindowFocus();
    }

    public final /* bridge */ /* synthetic */ boolean isFocused() {
        return super.isFocused();
    }

    public final /* bridge */ /* synthetic */ boolean isInTouchMode() {
        return super.isInTouchMode();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo2475a(int i, int i2, int i3, int i4, int i5) {
        return super.mo2475a(i, i2, i3, i4, i5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo2476a(MotionEvent motionEvent, int i) {
        return super.mo2476a(motionEvent, i);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (this.f19638c != null) {
            int headersCount;
            oo ooVar;
            MenuItem a;
            ListAdapter adapter = getAdapter();
            oo ooVar2;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                ooVar2 = (oo) headerViewListAdapter.getWrappedAdapter();
                headersCount = headerViewListAdapter.getHeadersCount();
                ooVar = ooVar2;
            } else {
                ooVar2 = (oo) adapter;
                headersCount = 0;
                ooVar = ooVar2;
            }
            if (motionEvent.getAction() != 10) {
                int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                if (pointToPosition != -1) {
                    headersCount = pointToPosition - headersCount;
                    a = headersCount >= 0 ? headersCount < ooVar.getCount() ? ooVar.m5661a(headersCount) : null : null;
                } else {
                    a = null;
                }
            } else {
                a = null;
            }
            MenuItem menuItem = this.f19641f;
            if (menuItem != a) {
                op opVar = ooVar.f9006a;
                if (menuItem != null) {
                    this.f19638c.mo2444b(opVar, menuItem);
                }
                this.f19641f = a;
                if (a != null) {
                    this.f19638c.mo2443a(opVar, a);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f19639d) {
            if (listMenuItemView.isEnabled() && listMenuItemView.f10016a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.f19640e) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ((oo) getAdapter()).f9006a.m14248a(false);
            return true;
        }
    }

    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
