package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: og */
final class og extends pb implements OnKeyListener, OnDismissListener, pe {
    /* renamed from: h */
    private static final int f22486h = R.layout.abc_cascading_menu_item_layout;
    /* renamed from: A */
    private pf f22487A;
    /* renamed from: B */
    private OnDismissListener f22488B;
    /* renamed from: a */
    public final Handler f22489a;
    /* renamed from: b */
    public final List f22490b = new ArrayList();
    /* renamed from: c */
    public final OnGlobalLayoutListener f22491c = new oh(this);
    /* renamed from: d */
    public View f22492d;
    /* renamed from: e */
    public ViewTreeObserver f22493e;
    /* renamed from: f */
    public boolean f22494f;
    /* renamed from: i */
    private final Context f22495i;
    /* renamed from: j */
    private final int f22496j;
    /* renamed from: k */
    private final int f22497k;
    /* renamed from: l */
    private final int f22498l;
    /* renamed from: m */
    private final boolean f22499m;
    /* renamed from: n */
    private final List f22500n = new ArrayList();
    /* renamed from: o */
    private final OnAttachStateChangeListener f22501o = new oi(this);
    /* renamed from: p */
    private final to f22502p = new oj(this);
    /* renamed from: q */
    private int f22503q = 0;
    /* renamed from: r */
    private int f22504r = 0;
    /* renamed from: s */
    private View f22505s;
    /* renamed from: t */
    private int f22506t;
    /* renamed from: u */
    private boolean f22507u;
    /* renamed from: v */
    private boolean f22508v;
    /* renamed from: w */
    private int f22509w;
    /* renamed from: x */
    private int f22510x;
    /* renamed from: y */
    private boolean f22511y;
    /* renamed from: z */
    private boolean f22512z;

    public og(Context context, View view, int i, int i2, boolean z) {
        this.f22495i = context;
        this.f22505s = view;
        this.f22497k = i;
        this.f22498l = i2;
        this.f22499m = z;
        this.f22511y = false;
        this.f22506t = m16705g();
        Resources resources = context.getResources();
        this.f22496j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f22489a = new Handler();
    }

    /* renamed from: a */
    public final void mo3303a(op opVar) {
        opVar.m14247a((pe) this, this.f22495i);
        if (mo2473e()) {
            m16704c(opVar);
        } else {
            this.f22500n.add(opVar);
        }
    }

    /* renamed from: b */
    protected final boolean mo3306b() {
        return false;
    }

    /* renamed from: c */
    public final void mo2471c() {
        int size = this.f22490b.size();
        if (size > 0) {
            ol[] olVarArr = (ol[]) this.f22490b.toArray(new ol[size]);
            for (size--; size >= 0; size--) {
                ol olVar = olVarArr[size];
                if (olVar.f9001a.f19629r.isShowing()) {
                    olVar.f9001a.mo2471c();
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo2439a() {
        return false;
    }

    /* renamed from: g */
    private final int m16705g() {
        if (jm.m4576j(this.f22505s) == 1) {
            return 0;
        }
        return 1;
    }

    /* renamed from: d */
    public final ListView mo2472d() {
        if (this.f22490b.isEmpty()) {
            return null;
        }
        List list = this.f22490b;
        return ((ol) list.get(list.size() - 1)).f9001a.f19616e;
    }

    /* renamed from: e */
    public final boolean mo2473e() {
        return this.f22490b.size() > 0 && ((ol) this.f22490b.get(0)).f9001a.f19629r.isShowing();
    }

    /* renamed from: a */
    public final void mo2436a(op opVar, boolean z) {
        int size = this.f22490b.size();
        int i = 0;
        while (i < size) {
            if (opVar == ((ol) this.f22490b.get(i)).f9002b) {
                break;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.f22490b.size()) {
                ((ol) this.f22490b.get(i2)).f9002b.m14248a(false);
            }
            ol olVar = (ol) this.f22490b.remove(i);
            olVar.f9002b.m14254b((pe) this);
            if (this.f22494f) {
                olVar.f9001a.r.setExitTransition(null);
                olVar.f9001a.f19629r.setAnimationStyle(0);
            }
            olVar.f9001a.mo2471c();
            i = this.f22490b.size();
            if (i > 0) {
                this.f22506t = ((ol) this.f22490b.get(i - 1)).f9003c;
            } else {
                this.f22506t = m16705g();
            }
            if (i == 0) {
                mo2471c();
                pf pfVar = this.f22487A;
                if (pfVar != null) {
                    pfVar.mo2353a(opVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f22493e;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f22493e.removeGlobalOnLayoutListener(this.f22491c);
                    }
                    this.f22493e = null;
                }
                this.f22492d.removeOnAttachStateChangeListener(this.f22501o);
                this.f22488B.onDismiss();
            } else if (z) {
                ((ol) this.f22490b.get(0)).f9002b.m14248a(false);
            }
        }
    }

    public final void onDismiss() {
        ol olVar;
        int size = this.f22490b.size();
        for (int i = 0; i < size; i++) {
            olVar = (ol) this.f22490b.get(i);
            if (!olVar.f9001a.f19629r.isShowing()) {
                break;
            }
        }
        olVar = null;
        if (olVar != null) {
            olVar.f9002b.m14248a(false);
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo2471c();
        return true;
    }

    /* renamed from: a */
    public final boolean mo2441a(pn pnVar) {
        for (ol olVar : this.f22490b) {
            if (pnVar == olVar.f9002b) {
                olVar.f9001a.f19616e.requestFocus();
                return true;
            }
        }
        if (!pnVar.hasVisibleItems()) {
            return false;
        }
        mo3303a((op) pnVar);
        pf pfVar = this.f22487A;
        if (pfVar != null) {
            pfVar.mo2354a(pnVar);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo3301a(View view) {
        if (this.f22505s != view) {
            this.f22505s = view;
            this.f22504r = Gravity.getAbsoluteGravity(this.f22503q, jm.m4576j(this.f22505s));
        }
    }

    /* renamed from: a */
    public final void mo2437a(pf pfVar) {
        this.f22487A = pfVar;
    }

    /* renamed from: b */
    public final void mo3305b(boolean z) {
        this.f22511y = z;
    }

    /* renamed from: a */
    public final void mo3300a(int i) {
        if (this.f22503q != i) {
            this.f22503q = i;
            this.f22504r = Gravity.getAbsoluteGravity(i, jm.m4576j(this.f22505s));
        }
    }

    /* renamed from: b */
    public final void mo3304b(int i) {
        this.f22507u = true;
        this.f22509w = i;
    }

    /* renamed from: a */
    public final void mo3302a(OnDismissListener onDismissListener) {
        this.f22488B = onDismissListener;
    }

    /* renamed from: c */
    public final void mo3308c(boolean z) {
        this.f22512z = z;
    }

    /* renamed from: c */
    public final void mo3307c(int i) {
        this.f22508v = true;
        this.f22510x = i;
    }

    /* renamed from: f */
    public final void mo2474f() {
        if (!mo2473e()) {
            for (op c : this.f22500n) {
                m16704c(c);
            }
            this.f22500n.clear();
            this.f22492d = this.f22505s;
            View view = this.f22492d;
            if (view != null) {
                ViewTreeObserver viewTreeObserver = this.f22493e;
                this.f22493e = view.getViewTreeObserver();
                if (viewTreeObserver == null) {
                    this.f22493e.addOnGlobalLayoutListener(this.f22491c);
                }
                this.f22492d.addOnAttachStateChangeListener(this.f22501o);
            }
        }
    }

    /* renamed from: c */
    private final void m16704c(op opVar) {
        View view;
        ol olVar;
        LayoutInflater from = LayoutInflater.from(this.f22495i);
        ListAdapter ooVar = new oo(opVar, from, this.f22499m, f22486h);
        if (!mo2473e() && this.f22511y) {
            ooVar.f9007b = true;
        } else if (mo2473e()) {
            ooVar.f9007b = pb.m14298b(opVar);
        }
        int a = pb.m14296a(ooVar, null, this.f22495i, this.f22496j);
        tg tpVar = new tp(this.f22495i, this.f22497k, this.f22498l);
        tpVar.f22579b = this.f22502p;
        tpVar.f19624m = this;
        tpVar.m14414a((OnDismissListener) this);
        tpVar.f19623l = this.f22505s;
        tpVar.f19621j = this.f22504r;
        tpVar.m14424j();
        tpVar.m14423i();
        tpVar.mo3329a(ooVar);
        tpVar.m14411a(a);
        tpVar.f19621j = this.f22504r;
        if (this.f22490b.size() > 0) {
            int i;
            MenuItem menuItem;
            List list = this.f22490b;
            ol olVar2 = (ol) list.get(list.size() - 1);
            op opVar2 = olVar2.f9002b;
            int size = opVar2.size();
            for (i = 0; i < size; i++) {
                MenuItem item = opVar2.getItem(i);
                if (item.hasSubMenu() && opVar == item.getSubMenu()) {
                    menuItem = item;
                    break;
                }
            }
            menuItem = null;
            if (menuItem == null) {
                view = null;
            } else {
                oo ooVar2;
                int i2;
                ListView listView = olVar2.f9001a.f19616e;
                ListAdapter adapter = listView.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    ooVar2 = (oo) headerViewListAdapter.getWrappedAdapter();
                } else {
                    ooVar2 = (oo) adapter;
                    i = 0;
                }
                int count = ooVar2.getCount();
                for (size = 0; size < count; size++) {
                    if (menuItem == ooVar2.m5661a(size)) {
                        i2 = size;
                        break;
                    }
                }
                i2 = -1;
                if (i2 != -1) {
                    i2 = (i2 + i) - listView.getFirstVisiblePosition();
                    view = i2 >= 0 ? i2 < listView.getChildCount() ? listView.getChildAt(i2) : null : null;
                } else {
                    view = null;
                }
            }
            olVar = olVar2;
        } else {
            view = null;
            olVar = null;
        }
        if (view == null) {
            if (this.f22507u) {
                tpVar.f19618g = this.f22509w;
            }
            if (this.f22508v) {
                tpVar.m14416b(this.f22510x);
            }
            tpVar.f19627p = this.f19540g;
        } else {
            int i3;
            if (tp.f22578a != null) {
                try {
                    tp.f22578a.invoke(tpVar.r, new Object[]{Boolean.valueOf(false)});
                } catch (Exception e) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
            tpVar.r.setEnterTransition(null);
            list = this.f22490b;
            ListView listView2 = ((ol) list.get(list.size() - 1)).f9001a.f19616e;
            int[] iArr = new int[2];
            listView2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f22492d.getWindowVisibleDisplayFrame(rect);
            if (this.f22506t == 1) {
                if ((listView2.getWidth() + iArr[0]) + a <= rect.right) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
            } else if (iArr[0] - a < 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            this.f22506t = i3;
            tpVar.f19623l = view;
            if ((this.f22504r & 5) == 5) {
                if (i3 != 0) {
                    i3 = a;
                } else {
                    i3 = -view.getWidth();
                }
            } else if (i3 != 0) {
                i3 = view.getWidth();
            } else {
                i3 = -a;
            }
            tpVar.f19618g = i3;
            tpVar.f19620i = true;
            tpVar.f19619h = true;
            tpVar.m14416b(0);
        }
        this.f22490b.add(new ol(tpVar, opVar, this.f22506t));
        tpVar.mo2474f();
        ViewGroup viewGroup = tpVar.f19616e;
        viewGroup.setOnKeyListener(this);
        if (olVar == null && this.f22512z && opVar.f19484f != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, viewGroup, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(opVar.f19484f);
            viewGroup.addHeaderView(frameLayout, null, false);
            tpVar.mo2474f();
        }
    }

    /* renamed from: a */
    public final void mo2438a(boolean z) {
        for (ol olVar : this.f22490b) {
            pb.m14297a(olVar.f9001a.f19616e.getAdapter()).notifyDataSetChanged();
        }
    }
}
