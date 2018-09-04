package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: pk */
final class pk extends pb implements OnKeyListener, OnItemClickListener, OnDismissListener, pe {
    /* renamed from: e */
    private static final int f22516e = R.layout.abc_popup_menu_item_layout;
    /* renamed from: a */
    public final tp f22517a;
    /* renamed from: b */
    public final OnGlobalLayoutListener f22518b = new pl(this);
    /* renamed from: c */
    public View f22519c;
    /* renamed from: d */
    public ViewTreeObserver f22520d;
    /* renamed from: f */
    private final Context f22521f;
    /* renamed from: h */
    private final op f22522h;
    /* renamed from: i */
    private final oo f22523i;
    /* renamed from: j */
    private final boolean f22524j;
    /* renamed from: k */
    private final int f22525k;
    /* renamed from: l */
    private final int f22526l;
    /* renamed from: m */
    private final int f22527m;
    /* renamed from: n */
    private final OnAttachStateChangeListener f22528n = new pm(this);
    /* renamed from: o */
    private OnDismissListener f22529o;
    /* renamed from: p */
    private View f22530p;
    /* renamed from: q */
    private pf f22531q;
    /* renamed from: r */
    private boolean f22532r;
    /* renamed from: s */
    private boolean f22533s;
    /* renamed from: t */
    private int f22534t;
    /* renamed from: u */
    private int f22535u = 0;
    /* renamed from: v */
    private boolean f22536v;

    public pk(Context context, op opVar, View view, int i, int i2, boolean z) {
        this.f22521f = context;
        this.f22522h = opVar;
        this.f22524j = z;
        this.f22523i = new oo(opVar, LayoutInflater.from(context), this.f22524j, f22516e);
        this.f22526l = i;
        this.f22527m = i2;
        Resources resources = context.getResources();
        this.f22525k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f22530p = view;
        this.f22517a = new tp(this.f22521f, this.f22526l, this.f22527m);
        opVar.m14247a((pe) this, context);
    }

    /* renamed from: a */
    public final void mo3303a(op opVar) {
    }

    /* renamed from: c */
    public final void mo2471c() {
        if (mo2473e()) {
            this.f22517a.mo2471c();
        }
    }

    /* renamed from: a */
    public final boolean mo2439a() {
        return false;
    }

    /* renamed from: d */
    public final ListView mo2472d() {
        return this.f22517a.f19616e;
    }

    /* renamed from: e */
    public final boolean mo2473e() {
        return !this.f22532r && this.f22517a.f19629r.isShowing();
    }

    /* renamed from: a */
    public final void mo2436a(op opVar, boolean z) {
        if (opVar == this.f22522h) {
            mo2471c();
            pf pfVar = this.f22531q;
            if (pfVar != null) {
                pfVar.mo2353a(opVar, z);
            }
        }
    }

    public final void onDismiss() {
        this.f22532r = true;
        this.f22522h.close();
        ViewTreeObserver viewTreeObserver = this.f22520d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f22520d = this.f22519c.getViewTreeObserver();
            }
            this.f22520d.removeGlobalOnLayoutListener(this.f22518b);
            this.f22520d = null;
        }
        this.f22519c.removeOnAttachStateChangeListener(this.f22528n);
        OnDismissListener onDismissListener = this.f22529o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        if (pnVar.hasVisibleItems()) {
            boolean z;
            pc pcVar = new pc(this.f22521f, pnVar, this.f22519c, this.f22524j, this.f22526l, this.f22527m);
            pcVar.m5667a(this.f22531q);
            pcVar.m5668a(pb.m14298b((op) pnVar));
            pcVar.f9014c = this.f22529o;
            this.f22529o = null;
            this.f22522h.m14248a(false);
            tg tgVar = this.f22517a;
            int i = tgVar.f19618g;
            int g = tgVar.m14421g();
            if ((Gravity.getAbsoluteGravity(this.f22535u, jm.m4576j(this.f22530p)) & 7) == 5) {
                i += this.f22530p.getWidth();
            }
            if (pcVar.m5670c()) {
                z = true;
            } else if (pcVar.f9012a != null) {
                pcVar.m5666a(i, g, true, true);
                z = true;
            } else {
                z = false;
            }
            if (z) {
                pf pfVar = this.f22531q;
                if (pfVar != null) {
                    pfVar.mo2354a(pnVar);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo3301a(View view) {
        this.f22530p = view;
    }

    /* renamed from: a */
    public final void mo2437a(pf pfVar) {
        this.f22531q = pfVar;
    }

    /* renamed from: b */
    public final void mo3305b(boolean z) {
        this.f22523i.f9007b = z;
    }

    /* renamed from: a */
    public final void mo3300a(int i) {
        this.f22535u = i;
    }

    /* renamed from: b */
    public final void mo3304b(int i) {
        this.f22517a.f19618g = i;
    }

    /* renamed from: a */
    public final void mo3302a(OnDismissListener onDismissListener) {
        this.f22529o = onDismissListener;
    }

    /* renamed from: c */
    public final void mo3308c(boolean z) {
        this.f22536v = z;
    }

    /* renamed from: c */
    public final void mo3307c(int i) {
        this.f22517a.m14416b(i);
    }

    /* renamed from: f */
    public final void mo2474f() {
        boolean z;
        if (mo2473e()) {
            z = true;
        } else if (this.f22532r) {
            z = false;
        } else {
            View view = this.f22530p;
            if (view != null) {
                this.f22519c = view;
                this.f22517a.m14414a((OnDismissListener) this);
                tg tgVar = this.f22517a;
                tgVar.f19624m = this;
                tgVar.m14424j();
                view = this.f22519c;
                ViewTreeObserver viewTreeObserver = this.f22520d;
                this.f22520d = view.getViewTreeObserver();
                if (viewTreeObserver == null) {
                    this.f22520d.addOnGlobalLayoutListener(this.f22518b);
                }
                view.addOnAttachStateChangeListener(this.f22528n);
                tg tgVar2 = this.f22517a;
                tgVar2.f19623l = view;
                tgVar2.f19621j = this.f22535u;
                if (!this.f22533s) {
                    this.f22534t = pb.m14296a(this.f22523i, null, this.f22521f, this.f22525k);
                    this.f22533s = true;
                }
                this.f22517a.m14411a(this.f22534t);
                this.f22517a.m14423i();
                tgVar = this.f22517a;
                tgVar.f19627p = this.f19540g;
                tgVar.mo2474f();
                ViewGroup viewGroup = this.f22517a.f19616e;
                viewGroup.setOnKeyListener(this);
                if (this.f22536v && this.f22522h.f19484f != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f22521f).inflate(R.layout.abc_popup_menu_header_item_layout, viewGroup, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f22522h.f19484f);
                    }
                    frameLayout.setEnabled(false);
                    viewGroup.addHeaderView(frameLayout, null, false);
                }
                this.f22517a.mo3329a(this.f22523i);
                this.f22517a.mo2474f();
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: a */
    public final void mo2438a(boolean z) {
        this.f22533s = false;
        oo ooVar = this.f22523i;
        if (ooVar != null) {
            ooVar.notifyDataSetChanged();
        }
    }
}
