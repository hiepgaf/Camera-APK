package p000;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.GoogleCamera.R;
import com.google.common.io.ByteStreams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: cls */
public final class cls extends DialogFragment implements cmm, csj {
    /* renamed from: a */
    public static final String f12157a = bli.m862a("BurstEditFrag");
    /* renamed from: b */
    public final cno f12158b = new cno();
    /* renamed from: c */
    public cli f12159c;
    /* renamed from: d */
    public gqy f12160d;
    /* renamed from: e */
    public cmn f12161e;
    /* renamed from: f */
    public cop f12162f;
    /* renamed from: g */
    public jbj f12163g = jbj.m12751d();
    /* renamed from: h */
    public volatile cot f12164h;
    /* renamed from: i */
    public final cmy f12165i = new cmy(this);
    /* renamed from: j */
    public cnc f12166j = new cnc(this.f12175s);
    /* renamed from: k */
    public cmp f12167k;
    /* renamed from: l */
    public boolean f12168l = false;
    /* renamed from: m */
    public cme f12169m;
    /* renamed from: n */
    public boolean f12170n;
    /* renamed from: o */
    public csh f12171o;
    /* renamed from: p */
    public acm f12172p;
    /* renamed from: q */
    public irs f12173q;
    /* renamed from: r */
    public cre f12174r;
    /* renamed from: s */
    private final cne f12175s = new cne(this);
    /* renamed from: t */
    private cmh f12176t;

    /* renamed from: b */
    public final void m8337b() {
        cnc cnc = this.f12166j;
        if (cnc.f2205f) {
            for (int i = 0; i < cnc.f2202c.f682j.mo728a(); i++) {
                cnf cnf = (cnf) cnc.f2202c.m444a(i);
                if (cnf != null) {
                    cnf.mo2778b(true);
                }
            }
        } else {
            bli.m873e(cnc.f2200a, "adjustVisibleSelectionStatesFromController does nothing (BurstEditor has not been created).");
        }
        cmh cmh = this.f12176t;
        int size = this.f12158b.f2214b.size();
        if (size == 0) {
            cmh.f2144a.setTitle(cmh.f2146c.getString(R.string.burst_text));
            cmh.f2144a.setBackground(cmh.f2149f);
            cmh.f2144a.setNavigationIcon(R.drawable.ic_arrow_back);
            cmh.f2144a.setNavigationOnClickListener(new cmi(cmh));
            cmh.m1181b(((Boolean) cmh.f2147d.mo605b()).booleanValue() ^ 1);
            cmh.m1180a(false);
            cmh.m1182c(false);
        } else if (size == 1) {
            cmh.f2144a.setTitle(Integer.toString(size));
            cmh.f2144a.setBackground(cmh.f2150g);
            cmh.f2144a.setNavigationIcon(R.drawable.ic_cancel);
            cmh.f2144a.setNavigationOnClickListener(new cmj(cmh));
            cmh.m1181b(false);
            cmh.m1180a(true);
            cmh.m1182c(((Boolean) cmh.f2147d.mo605b()).booleanValue() ^ 1);
        } else {
            cmh.f2144a.setTitle(Integer.toString(size));
        }
    }

    /* renamed from: a */
    public static Intent m8331a(String str) {
        Intent intent = new Intent(str);
        intent.setType("image/*");
        intent.addFlags(1);
        intent.addFlags(ByteStreams.ZERO_COPY_CHUNK_SIZE);
        return intent;
    }

    /* renamed from: c */
    public final cou m8339c() {
        if (this.f12174r.mo1066e() != null && (this.f12174r.mo1066e() instanceof cou)) {
            return (cou) this.f12174r.mo1066e();
        }
        throw new RuntimeException("Trying to show non-BurstItem item in the burst editor");
    }

    /* renamed from: d */
    final void m8340d() {
        cno cno = this.f12158b;
        ArrayList arrayList = new ArrayList(cno.f2214b);
        cno.f2214b.clear();
        m8337b();
    }

    /* renamed from: e */
    public final void m8341e() {
        m8340d();
        this.f12158b.f2213a = null;
        if (this.f12171o.f2641c.mo1011b(m8339c().mo1033g().f4155h) != cre.f2587c) {
            csh csh = this.f12171o;
            err c = m8339c();
            cre b = csh.f2641c.mo1011b(c.mo1033g().f4155h);
            if (b != cre.f2587c) {
                csh.m1458a(b);
            } else {
                String valueOf = String.valueOf(c);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
                stringBuilder.append(valueOf);
                stringBuilder.append(" not found in filmstrip data adapter.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        bli.m866b(f12157a, "Trying to remove an invalid item from the filmstrip");
        dismiss();
    }

    /* renamed from: a */
    public final cot m8332a(Uri uri) {
        for (cot cot : ((cov) m8339c().e).m8520c()) {
            if (cot.f12527c.f12515e.f4155h.equals(uri)) {
                return cot;
            }
        }
        return null;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            synchronized (this) {
                cmn cmn = this.f12161e;
                if (cmn == null) {
                    bli.m866b(f12157a, "No stack image edit request after edit intent returns.");
                } else {
                    cmn.f2156a.f12527c.f12515e.f4153f.setTime(System.currentTimeMillis());
                    cnc cnc = this.f12166j;
                    cqn cqn = this.f12161e.f2156a;
                    acm acm = this.f12172p;
                    for (int i3 = 0; i3 < cnc.f2202c.f682j.mo728a(); i3++) {
                        if ((cnc.f2203d.f12193e.m1176a(i3).m1179a() ^ 1) != 0) {
                            cng cng = (cng) cnc.f2202c.m444a(i3);
                            if (cng != null && cng.f20327q.equals(cqn.f12527c.f12515e.f4155h)) {
                                cng.m15044a(acm, cqn);
                            }
                        }
                    }
                    cqn cqn2 = this.f12161e.f2156a;
                    cmp cmp = this.f12167k;
                    eru eru = cqn2.f12527c.f12515e;
                    Uri uri = eru.f4155h;
                    if (uri.equals(uri)) {
                        ImageView imageView = (kvr) cmp.f2171l.get(cqn2.f12527c.f12515e.f4155h);
                        if (imageView != null) {
                            acc.m100b(cmp.f2168i).m6281a(Drawable.class).m120a(eru.f4155h).m119a(new aqg().m604a(new ColorDrawable(-16777216)).m598a(new are(eru.f4151d, eru.f4153f.getTime(), 0))).m123a(imageView);
                        }
                    }
                    this.f12161e = null;
                }
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        cnc cnc = this.f12166j;
        su suVar = (su) cnc.f2202c.f683k;
        int a = cnc.m1196a(configuration);
        suVar.m16807a(a);
        suVar.f22570a = new cnd(cnc, a);
        cnc.m1198a(a);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.Theme.BurstEditor);
        setHasOptionsMenu(true);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new clu(this, getActivity(), getTheme());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().requestFeature(1);
        return layoutInflater.inflate(R.layout.burst_editor, viewGroup, true);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f12168l) {
            this.f12171o.f2641c.mo1021d(m8339c().mo1033g().f4155h);
        }
    }

    /* renamed from: a */
    public final void mo666a(int i, cre cre) {
        jbj jbj = this.f12163g;
        this.f12163g = jbj.m12751d();
        jbj.m12763a((Object) cre);
    }

    /* renamed from: b */
    public final void mo668b(int i, cre cre) {
        if (cre == this.f12174r) {
            dismiss();
        }
    }

    /* renamed from: a */
    public final void mo667a(csk csk) {
        this.f12166j.m1197a();
    }

    /* renamed from: a */
    public final void mo665a() {
    }

    /* renamed from: f */
    public final void mo718f() {
        cmp cmp = this.f12167k;
        if (cmp.f2162c) {
            cmp.m1192a();
        } else {
            dismiss();
        }
    }

    /* renamed from: g */
    public final void mo719g() {
        List list = this.f12158b.f2214b;
        if (list.size() == m8339c().m15146d()) {
            m8341e();
        } else if (list.size() > 0) {
            m8336a(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
                this.f12160d.m2745a();
            }
            m8340d();
        }
        this.f12159c.m1171a();
    }

    /* renamed from: h */
    public final void mo720h() {
        m8340d();
    }

    /* renamed from: i */
    public final void mo721i() {
        Collection collection = this.f12158b.f2214b;
        if (collection.size() > 0) {
            Intent a;
            if (collection.size() == 1) {
                a = cls.m8331a("android.intent.action.SEND");
                a.putExtra("android.intent.extra.STREAM", (Uri) collection.get(0));
                startActivity(a);
            } else if (collection.size() > 1) {
                a = cls.m8331a("android.intent.action.SEND_MULTIPLE");
                a.putParcelableArrayListExtra("android.intent.extra.STREAM", new ArrayList(collection));
                startActivity(Intent.createChooser(a, getResources().getString(R.string.share_to)));
            }
            m8340d();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        if (this.f12168l) {
            int i;
            this.f12159c = new cli(new clq(this));
            cli cli = this.f12159c;
            cli.f2115b = (FloatingActionButton) view.findViewById(R.id.burst_editor_fab);
            cli.f2118e = (LinearLayout) view.findViewById(R.id.burst_speed_dial);
            cli.f2118e.setVisibility(8);
            cli.f2116c = view.findViewById(R.id.burst_editor_fade_layer);
            cli.f2120g = AnimationUtils.loadInterpolator(cli.f2118e.getContext(), 17563653);
            cli.f2116c.setLayerType(2, null);
            cli.f2118e.setLayerType(2, null);
            cli.m1170a(jiy.GROUP_SMILES, R.string.creation_group_smiles, R.drawable.ic_insert_emoticon);
            cli.m1170a(jiy.COLLAGE, R.string.creation_collage, R.drawable.ic_auto_awesome_mix);
            cli.m1170a(jiy.ANIMATION, R.string.creation_gif, R.drawable.ic_auto_awesome_motion);
            cli.m1170a(jiy.VFR_VIDEO, R.string.creation_video, R.drawable.ic_auto_awesome_video);
            cli.m1170a(jiy.PHOTO_BOOTH, R.string.creation_photo_booth, R.drawable.ic_auto_awesome_mix);
            cli.f2115b.setOnClickListener(new clk(cli));
            cli.f2116c.setOnClickListener(new cll(cli));
            cli.m1174c();
            cli cli2 = this.f12159c;
            clr clt = new clt(this);
            ikd.m12259a();
            cli2.f2123j = clt;
            Resources resources = getResources();
            kbn cmb = new cmb(this);
            Object applicationContext = getActivity().getApplicationContext();
            cmh cmh = new cmh(this, resources, cmb, view);
            cmh.f2150g = new ColorDrawable(cmh.f2146c.getColor(R.color.burst_editor_selected_bg_color));
            cmh.f2144a.setPopupTheme(R.style.Theme.BurstEditor.Toolbar.Popup);
            cmh.f2144a.setTitle(cmh.f2146c.getString(R.string.burst_text));
            cmh.f2144a.setNavigationIcon(R.drawable.ic_arrow_back);
            cmh.f2144a.setNavigationContentDescription(cmh.f2146c.getString(R.string.burst_editor_navigate_up));
            cmh.f2144a.setNavigationOnClickListener(new cmk(cmh));
            cmh.f2144a.inflateMenu(R.menu.burst_editor_toolbar_menu);
            cmh.f2148e = cmh.f2144a.getMenu();
            if (!((Boolean) cmh.f2147d.mo605b()).booleanValue()) {
                Object obj = cmh.f2148e;
                jri.m13152b(applicationContext);
                jri.m13152b(obj);
                kbg a = axh.m731a(applicationContext, obj, axh.m730a(applicationContext));
                if (a.mo2084b()) {
                    cmh.f2151h = ((MenuItem) a.mo2081a()).getItemId();
                }
            }
            cmh.f2144a.setOnMenuItemClickListener(new cml(cmh));
            cmh.f2149f = cmh.f2144a.getBackground();
            this.f12176t = cmh;
            this.f12158b.f2213a = new cnp(this);
            kbn clv = new clv(this);
            this.f12169m = new cme(this.f12174r);
            cnc cnc = this.f12166j;
            Context activity = getActivity();
            cno cno = this.f12158b;
            cme cme = this.f12169m;
            acm acm = this.f12172p;
            cnc.f2204e = activity;
            cnc.f2202c = (RecyclerView) view.findViewById(R.id.grid_view);
            int a2 = cnc.m1196a(cnc.f2204e.getResources().getConfiguration());
            activity = cnc.f2204e;
            ug suVar = new su(a2);
            cnc.f2202c.m451a(suVar);
            cnc.f2203d = new cnk(cno, clv, acm, cme, cnc.f2201b);
            RecyclerView recyclerView = cnc.f2202c;
            tx txVar = cnc.f2203d;
            tx txVar2 = recyclerView.f682j;
            if (txVar2 != null) {
                txVar2.f9295a.unregisterObserver(recyclerView.f675c);
            }
            recyclerView.m478o();
            recyclerView.f677e.m5849c();
            txVar2 = recyclerView.f682j;
            recyclerView.f682j = txVar;
            if (txVar != null) {
                txVar.m5869a(recyclerView.f675c);
            }
            ug ugVar = recyclerView.f683k;
            if (ugVar != null) {
                ugVar.mo824u();
            }
            up upVar = recyclerView.f676d;
            tx txVar3 = recyclerView.f682j;
            upVar.m5998a();
            un b = upVar.m6002b();
            if (txVar2 != null) {
                b.f9329b--;
            }
            if (b.f9329b == 0) {
                for (i = 0; i < b.f9328a.size(); i++) {
                    ((uo) b.f9328a.valueAt(i)).f9330a.clear();
                }
            }
            if (txVar3 != null) {
                b.f9329b++;
            }
            recyclerView.f656A.f9352f = true;
            recyclerView.m461b(false);
            recyclerView.requestLayout();
            suVar.f22570a = new cnd(cnc, a2);
            cnc.m1198a(a2);
            cnc.f2205f = true;
            RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.grid_view);
            cmp cmp = this.f12167k;
            ViewGroup viewGroup = (ViewGroup) view;
            Context activity2 = getActivity();
            cmp.f2164e = viewGroup;
            cmp.f2165f = recyclerView2;
            cmp.f2172m = (ViewPager) viewGroup.findViewById(R.id.pager);
            cmp.f2172m.m404a(new jy());
            cmp.f2169j = viewGroup.findViewById(R.id.share_icons);
            cmp.f2172m.m403a(new cmq(cmp));
            cmp.m1193a(8);
            ViewGroup viewGroup2 = cmp.f2172m;
            jl cmz = new cmz(cmp);
            jl jlVar = viewGroup2.f584d;
            if (jlVar != null) {
                jlVar.setViewPagerObserver(null);
                viewGroup2.f584d.startUpdate(viewGroup2);
                for (i = 0; i < viewGroup2.f583c.size(); i++) {
                    ju juVar = (ju) viewGroup2.f583c.get(i);
                    viewGroup2.f584d.destroyItem(viewGroup2, juVar.f7980b, juVar.f7979a);
                }
                viewGroup2.f584d.finishUpdate(viewGroup2);
                viewGroup2.f583c.clear();
                i = 0;
                while (i < viewGroup2.getChildCount()) {
                    if (!((jv) viewGroup2.getChildAt(i).getLayoutParams()).f7994a) {
                        viewGroup2.removeViewAt(i);
                        i--;
                    }
                    i++;
                }
                viewGroup2.f585e = 0;
                viewGroup2.scrollTo(0, 0);
            }
            viewGroup2.f584d = cmz;
            viewGroup2.f582b = 0;
            if (viewGroup2.f584d != null) {
                if (viewGroup2.f589i == null) {
                    viewGroup2.f589i = new jz(viewGroup2);
                }
                viewGroup2.f584d.setViewPagerObserver(viewGroup2.f589i);
                viewGroup2.f590j = false;
                boolean z = viewGroup2.f591k;
                viewGroup2.f591k = true;
                viewGroup2.f582b = viewGroup2.f584d.getCount();
                if (viewGroup2.f586f >= 0) {
                    viewGroup2.f584d.restoreState(viewGroup2.f587g, viewGroup2.f588h);
                    viewGroup2.m402a(viewGroup2.f586f, false, true);
                    viewGroup2.f586f = -1;
                    viewGroup2.f587g = null;
                    viewGroup2.f588h = null;
                } else if (z) {
                    viewGroup2.requestLayout();
                } else {
                    viewGroup2.m405b();
                }
            }
            cmp.f2168i = activity2;
            cmp.f2172m.m403a(new cmr(cmp));
            return;
        }
        view.post(new clz(this));
    }

    /* renamed from: a */
    public final void m8336a(List list) {
        List arrayList = new ArrayList();
        for (Uri a : list) {
            cot a2 = m8332a(a);
            if (a2 != null) {
                arrayList.add(a2);
                if (((cov) m8339c().e).m8520c().indexOf(a2) >= 0) {
                    ((cov) m8339c().e).m8517a(a2);
                }
            }
        }
        this.f12164h = m8339c().m15142b();
        this.f12166j.m1197a();
        cmp cmp = this.f12167k;
        for (int i = 0; i < cmp.f2161b.size(); i++) {
            if (list.contains(((cot) cmp.f2161b.get(i)).f12527c.f12515e.f4155h)) {
                cmp.f2161b.remove(i);
            }
        }
        cmp.f2172m.f584d.notifyDataSetChanged();
        Executor newSingleThreadExecutor = Executors.newSingleThreadExecutor(iel.m3721c("BurstDelete", 0));
        jli.m12939a(newSingleThreadExecutor, new cly(arrayList)).mo1973a(new ikd(), new clx(this, newSingleThreadExecutor)).mo1981b(new ikd(), new clw()).mo1980a(izw.f18704a);
    }
}
