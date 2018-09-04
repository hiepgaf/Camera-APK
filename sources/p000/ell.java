package p000;

import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ell */
public final class ell implements elo {
    /* renamed from: a */
    private static final String f15279a = bli.m862a("LocalFileStorageMgr");
    /* renamed from: b */
    private File f15280b;
    /* renamed from: c */
    private gtf f15281c;
    /* renamed from: d */
    private final File f15282d;
    /* renamed from: e */
    private final gmn f15283e;
    /* renamed from: f */
    private final gnu f15284f;

    public ell(gln gln, gtf gtf, gmn gmn, gnu gnu) {
        this.f15282d = gln.mo1502a("panorama_sessions");
        File file = new File(Environment.getExternalStorageDirectory(), "panoramas");
        if (!(file.mkdirs() || file.exists())) {
            bli.m866b(f15279a, "Panorama directory not created.");
            file = null;
        }
        this.f15280b = file;
        this.f15281c = gtf;
        this.f15283e = gmn;
        this.f15284f = gnu;
    }

    /* renamed from: a */
    public static void m9748a(eln eln) {
        if (!new File(eln.f3937c).exists()) {
            bli.m866b(f15279a, "The storage directory does not exist.");
        }
    }

    /* renamed from: a */
    public final void mo1231a(eln eln, elp elp) {
        new elm(eln, elp).start();
    }

    /* renamed from: a */
    public final eln mo1230a() {
        long currentTimeMillis = System.currentTimeMillis();
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(currentTimeMillis));
        File file = this.f15282d;
        String valueOf = String.valueOf("session_");
        String valueOf2 = String.valueOf(format);
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        File file2 = new File(file, valueOf2);
        file2.mkdirs();
        try {
            if (file2.isDirectory()) {
                String[] list = file2.list();
                for (String file3 : list) {
                    new File(file2, file3).delete();
                }
            }
        } catch (Exception e) {
            bli.m866b(f15279a, "Could not delete temporary images.");
        }
        eln eln = new eln();
        eln.f3935a = format;
        eln.f3937c = file2.getAbsolutePath();
        String a = this.f15281c.m2813a(currentTimeMillis, new SimpleDateFormat("'PANO'_yyyyMMdd_HHmmss", Locale.US));
        goe goe = new goe(this.f15284f, eln.f3937c, a);
        gmn gmn = this.f15283e;
        eln.f3936b = new gmi((gmp) gmn.m2617a((gmp) gmn.f5441a.mo345a(), 1), (glt) gmn.m2617a((glt) gmn.f5442b.mo345a(), 2), (Executor) gmn.m2617a((Executor) gmn.f5443c.mo345a(), 3), (gsl) gmn.m2617a((gsl) gmn.f5444d.mo345a(), 4), (eqa) gmn.m2617a((eqa) gmn.f5445e.mo345a(), 5), (gsp) gmn.m2617a((gsp) gmn.f5446f.mo345a(), 6), (gtf) gmn.m2617a((gtf) gmn.f5447g.mo345a(), 7), (gsi) gmn.m2617a((gsi) gmn.f5448h.mo345a(), 8), (grg) gmn.m2617a((grg) gmn.f5449i.mo345a(), 9), (bcv) gmn.m2617a((bcv) gmn.f5450j.mo345a(), 10), (goe) gmn.m2617a(goe, 11), (gnh) gmn.m2617a((gnh) gmn.f5451k.mo345a(), 12), (String) gmn.m2617a(a, 13), (kbg) gmn.m2617a(kau.f19138a, 14), currentTimeMillis, (hju) gmn.m2617a((hju) gmn.f5452l.mo345a(), 16), (gev) gmn.m2617a((gev) gmn.f5453m.mo345a(), 17));
        if (eln.f3936b.mo2885m().m2655c()) {
            format = String.valueOf(a);
            valueOf2 = String.valueOf(ixx.JPEG.f7546j);
            if (valueOf2.length() == 0) {
                valueOf2 = new String(format);
            } else {
                valueOf2 = format.concat(valueOf2);
            }
            if (m9749b() == null) {
                bli.m866b(f15279a, "Could not get the thumbnail directory.");
                eln.f3938d = "";
            } else {
                eln.f3938d = new File(m9749b(), valueOf2).getAbsolutePath();
            }
            eln.f3940f = new File(file2, "orientations.txt").getAbsolutePath();
            eln.f3939e = new File(file2, "session.meta").getAbsolutePath();
            return eln;
        }
        throw new IOException("Cannot create temporary session file.");
    }

    /* renamed from: b */
    private final File m9749b() {
        String valueOf = String.valueOf(this.f15280b.getAbsolutePath());
        String str = "Panorama directory is : ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            str.concat(valueOf);
        }
        File file = new File(this.f15280b, "thumbnails");
        if (file.mkdirs() || file.exists()) {
            return file;
        }
        bli.m866b(f15279a, "Thumbnails directory not created.");
        return null;
    }

    /* renamed from: a */
    public final boolean mo1232a(String str) {
        this.f15280b = new File(str);
        if (this.f15280b.exists() || this.f15280b.mkdirs()) {
            return true;
        }
        bli.m866b(f15279a, "Panorama directory not created.");
        return false;
    }
}
