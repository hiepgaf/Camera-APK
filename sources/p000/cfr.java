package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore.Video.Media;
import java.util.Date;
import java.util.List;

/* compiled from: PG */
/* renamed from: cfr */
final class cfr implements glq {
    /* renamed from: a */
    public final /* synthetic */ cfk f11822a;

    cfr(cfk cfk) {
        this.f11822a = cfk;
    }

    /* renamed from: a */
    final void m8142a(cre cre, err err) {
        if (cre == cre.f2587c) {
            this.f11822a.f20256G.mo1009a(err, cov.m8503a(err));
        } else {
            this.f11822a.f20256G.mo1005a(cre, err);
        }
    }

    /* renamed from: a */
    private final boolean m8132a(Uri uri, cre cre) {
        Uri b = this.f11822a.f20288n.mo1642b(uri);
        if (b == null) {
            this.f11822a.f20256G.mo1018c(uri);
            return true;
        }
        String str = cfk.f20249a;
        String valueOf = String.valueOf(b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
        stringBuilder.append("onSessionDone: image content URI=");
        stringBuilder.append(valueOf);
        bli.m869c(str, stringBuilder.toString());
        err a = this.f11822a.f20259J.m8618a(b);
        if (a != null) {
            if (cre != cre.f2587c && this.f11822a.f20262M.mo767k() && this.f11822a.f20253D.mo1074a(cre.mo1066e())) {
                a.f20780a = this.f11822a.f20288n.mo1644c(uri);
            }
            m8142a(cre, a);
            return false;
        }
        str = cfk.f20249a;
        String valueOf2 = String.valueOf(b);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 49);
        stringBuilder2.append("onSessionDone: Could not find LocalData for URI: ");
        stringBuilder2.append(valueOf2);
        bli.m869c(str, stringBuilder2.toString());
        return true;
    }

    /* renamed from: a */
    public final void mo580a(Uri uri) {
        String str = cfk.f20249a;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
        stringBuilder.append("onSessionCanceled:");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
        cre b = this.f11822a.f20256G.mo1011b(uri);
        if (b != cre.f2587c) {
            this.f11822a.f20256G.mo1014b(b);
            return;
        }
        str = cfk.f20249a;
        valueOf = String.valueOf(uri);
        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 62);
        stringBuilder.append("onSessionCanceled tried to remove URI that couldn't be found: ");
        stringBuilder.append(valueOf);
        bli.m873e(str, stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo579a(Bitmap bitmap, int i) {
        String str = cfk.f20249a;
        String valueOf = String.valueOf(new iqp(bitmap.getWidth(), bitmap.getHeight()));
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 60);
        stringBuilder.append("onSessionCaptureIndicatorUpdate bitmap=");
        stringBuilder.append(valueOf);
        stringBuilder.append(" rotation=");
        stringBuilder.append(i);
        bli.m871d(str, stringBuilder.toString());
        cfk cfk = this.f11822a;
        if (!cfk.f20273X) {
            cfk.f20282h.post(new cft(cfk, bitmap, i));
        }
    }

    /* renamed from: a */
    public final void mo585a(Uri uri, List list) {
        String str = cfk.f20249a;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
        stringBuilder.append("onSessionDone: sessionUri:");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
        cre b = this.f11822a.f20256G.mo1011b(uri);
        if (cre.f2587c.equals(b)) {
            Uri b2 = this.f11822a.f20288n.mo1642b(uri);
            if (b2 == null) {
                this.f11822a.f20256G.mo1018c(uri);
                return;
            } else if (b2.getPath().startsWith(Media.EXTERNAL_CONTENT_URI.getPath())) {
                m8133b(uri, b);
                return;
            } else {
                m8132a(uri, b);
                return;
            }
        }
        err e = b.mo1066e();
        if (e instanceof cou) {
            new cfs(this, list, b, uri).executeOnExecutor(this.f11822a.f20265P, new Void[0]);
        } else if (e instanceof cqs) {
            m8133b(uri, b);
        } else if (e instanceof cql) {
            m8132a(uri, b);
        }
    }

    /* renamed from: a */
    public final void mo584a(Uri uri, hec hec, boolean z) {
        String str = cfk.f20249a;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("onSessionFailed:");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
        cre b = this.f11822a.f20256G.mo1011b(uri);
        if (this.f11822a.f20253D.mo1070a() == b) {
            this.f11822a.m14996b(0);
            cfk cfk = this.f11822a;
            crw crw = cfk.f20300z;
            CharSequence a = hec.mo1726a(cfk.f20280f.getResources());
            crw.m1442a();
            crw.f2618g.setVisibility(0);
            crw.f2619h.setText(a);
            this.f11822a.f20256G.mo1018c(uri);
        }
        if (z) {
            get b2 = this.f11822a.f20278d.mo1506b(uri);
            if (b2 != null) {
                grg h = b2.mo1482h();
                if (h != null) {
                    h.mo1525d();
                }
            }
            if (b != cre.f2587c) {
                this.f11822a.f20256G.mo1014b(b);
            }
        }
    }

    /* renamed from: b */
    public final void mo587b(Uri uri) {
        String str = cfk.f20249a;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 17);
        stringBuilder.append("onSessionFocused:");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
        int a = this.f11822a.f20256G.mo997a(uri);
        if (a == -1) {
            a = this.f11822a.f20256G.mo997a(this.f11822a.f20288n.mo1642b(uri));
        }
        this.f11822a.f20253D.mo1073a(a);
    }

    /* renamed from: a */
    public final void mo586a(byte[] bArr, int i) {
    }

    /* renamed from: a */
    public final void mo581a(Uri uri, int i) {
        if (i >= 0) {
            cre a = this.f11822a.f20253D.mo1070a();
            if (a != cre.f2587c && uri.equals(a.mo1066e().mo1033g().f4155h)) {
                this.f11822a.m14996b(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo583a(Uri uri, hec hec) {
        cre a = this.f11822a.f20253D.mo1070a();
        if (a != cre.f2587c && uri.equals(a.mo1066e().mo1033g().f4155h)) {
            cfk cfk = this.f11822a;
            cfk.f20263N.m1440a(hec.mo1726a(cfk.f20280f.getResources()));
        }
    }

    /* renamed from: a */
    public final void mo582a(Uri uri, glw glw, eqi eqi) {
        String str = cfk.f20249a;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 17);
        stringBuilder.append("onSessionQueued: ");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
        if (this.f11822a.f20288n.mo1648g(uri)) {
            kbg c;
            if (eqi != null) {
                c = kbg.m4745c(Long.valueOf(eqi.mo1263b()));
            } else {
                c = kau.f19138a;
            }
            if (glw != glw.VIDEO) {
                err cou;
                boolean z;
                if (glw == glw.BURST || glw == glw.PORTRAIT) {
                    cov a = cov.m8501a(uri, this.f11822a.f20288n, c);
                    if (a != null) {
                        gev b = this.f11822a.aX;
                        cfk cfk = this.f11822a;
                        cou = new cou(b, cfk.f20278d, cfk.f20280f, cfk.f20255F, a, cfk.f20288n);
                    } else {
                        cou = null;
                    }
                } else if (glw == glw.RENDER_VIDEO) {
                    if (c.mo2084b()) {
                        cqx cqx = this.f11822a.f20260K;
                        long longValue = ((Long) c.mo2081a()).longValue();
                        Date date = new Date(cqx.f12546d.mo1647f(uri));
                        r1 = new cqs(cqx.f12543a, cqx.f12544b, ((cqw) ((cqw) ((cqw) ((cqw) new cqw(uri).m2081a(date)).m2083b(date)).m2085d()).m2080a(longValue)).m8666a(), cqx);
                    } else {
                        str = cfk.f20249a;
                        valueOf = String.valueOf(uri);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 49);
                        stringBuilder.append("onSessionQueued has no MediaStore record for uri ");
                        stringBuilder.append(valueOf);
                        bli.m866b(str, stringBuilder.toString());
                        return;
                    }
                } else if (glw == glw.HDR_PLUS || glw == glw.HDR_PLUS_AUTO) {
                    r1 = this.f11822a.f20259J.m8619a(uri, true, c);
                } else {
                    r1 = this.f11822a.f20259J.m8619a(uri, false, c);
                }
                if (cou == null) {
                    z = false;
                } else if (cou instanceof cou) {
                    z = true;
                } else if (cou.mo1033g().f4149b == cqo.f12528a) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    this.f11822a.f20256G.mo1009a(cou, cfk.m14943a(cou, glw) ^ 1);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo578a(Bitmap bitmap) {
    }

    /* renamed from: c */
    public final void mo588c(Uri uri) {
        String str = cfk.f20249a;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
        stringBuilder.append("onSessionUpdated: ");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
        this.f11822a.f20256G.mo1018c(uri);
    }

    /* renamed from: b */
    private final void m8133b(Uri uri, cre cre) {
        Uri b = this.f11822a.f20288n.mo1642b(uri);
        err a = this.f11822a.f20260K.m8670a(b);
        if (a != null) {
            m8142a(cre, a);
            return;
        }
        String str = cfk.f20249a;
        String valueOf = String.valueOf(b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
        stringBuilder.append("Could not find VideoItem for URI: ");
        stringBuilder.append(valueOf);
        bli.m866b(str, stringBuilder.toString());
    }
}
