package p000;

import android.system.ErrnoException;
import android.system.Os;
import com.google.android.GoogleCamera.R;
import com.google.googlex.gcam.DebugParams;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamSwigLoader;
import com.google.googlex.gcam.InitParams;
import com.google.googlex.gcam.JniUtilsJniLoader;
import com.google.googlex.gcam.StaticMetadataVector;
import com.google.googlex.gcam.hdrplus.HalideRuntime;
import com.google.googlex.gcam.image.ImageJniLoader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: byc */
public final class byc {
    /* renamed from: a */
    private static final String f1717a = bli.m862a("HdrPlusModule");

    static {
        GcamSwigLoader.initialize();
        JniUtilsJniLoader.initialize();
        ImageJniLoader.initialize();
    }

    /* renamed from: a */
    public static brx m1055a() {
        return bxg.f1690f;
    }

    /* renamed from: b */
    public static brx m1058b() {
        return bxg.f1687c;
    }

    /* renamed from: c */
    public static brx m1059c() {
        return bxg.f1686b;
    }

    /* renamed from: d */
    public static brx m1060d() {
        return bxg.f1688d;
    }

    /* renamed from: e */
    public static brx m1061e() {
        return bxg.f1689e;
    }

    /* renamed from: a */
    public static byy m1056a(bkw bkw, era era, bxg bxg, fgw fgw, bku bku) {
        return new byy(bkw, era, bxg, fgw, bku);
    }

    /* renamed from: a */
    public static Gcam m1057a(fbn fbn, fhc fhc, byy byy, ird ird, cbd cbd, fgw fgw, kbg kbg) {
        String valueOf;
        iqz iqz;
        StringBuilder stringBuilder;
        ird.mo1903a("Gcam#provide");
        if (HalideRuntime.checkGcamHalideRuntime()) {
            bli.m869c(f1717a, "HalideRuntime.checkGcamHalideRuntime -> OK");
        } else {
            bli.m866b(f1717a, "HalideRuntime.checkGcamHalideRuntime -> Failed");
        }
        InitParams initParams = byy.f1721b;
        StaticMetadataVector staticMetadataVector = new StaticMetadataVector();
        iut[] iutArr = new iut[]{iut.BACK, iut.FRONT};
        for (int i = 0; i < 2; i++) {
            iut iut = iutArr[i];
            if (fhc.f4552a != go.av) {
                for (iur iur : fbn.mo1344a(iut)) {
                    if (!(iur == null || iur.f7482b == null)) {
                        staticMetadataVector.add(bya.m1044a(fbn.m10176b(iur)));
                    }
                }
            }
        }
        DebugParams a = bxe.m1033a(fgw, false);
        int execute_finish_on = initParams.getExecute_finish_on();
        if (execute_finish_on != 1) {
            Object obj;
            if (execute_finish_on == 4) {
                obj = 1;
            } else if (execute_finish_on == 6) {
                obj = 1;
            } else if (execute_finish_on == 3) {
                obj = 1;
            } else if (execute_finish_on != 5) {
                obj = null;
            } else {
                obj = 1;
            }
            if (obj != null && kbg.mo2084b()) {
                ((gco) kbg.mo2081a()).m2482a();
            }
        } else {
            try {
                cbd.f1832a.mo518d("Will attempt to load libadsprpc.so from the system partition");
                cbd.f1832a.mo518d("Loading libhalide_hexagon_host.so from the app");
                System.loadLibrary("halide_hexagon_host_app");
                try {
                    String str = cbd.f1833b.getApplicationInfo().dataDir;
                    cbd.f1834c.mo1903a("HexagonEnvironment#copyHexagonRemoteToDisk");
                    String concat = String.valueOf(str).concat("/libhalide_hexagon_remote_skel.so");
                    iqz iqz2 = cbd.f1832a;
                    valueOf = String.valueOf(concat);
                    String str2 = "Writing libhalide_hexagon_remote_skel.so to ";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str2);
                    } else {
                        valueOf = str2.concat(valueOf);
                    }
                    iqz2.mo518d(valueOf);
                    InputStream openRawResource = cbd.f1833b.getResources().openRawResource(R.raw.libhalide_hexagon_remote_skel);
                    OutputStream fileOutputStream = new FileOutputStream(concat);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openRawResource.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.flush();
                    openRawResource.close();
                    fileOutputStream.close();
                    cbd.f1834c.mo1904b();
                    str = String.valueOf(str).concat(";/dsp");
                    try {
                        iqz iqz3 = cbd.f1832a;
                        String str3 = "ADSP_LIBRARY_PATH=";
                        valueOf = String.valueOf(str);
                        if (valueOf.length() == 0) {
                            valueOf = new String(str3);
                        } else {
                            valueOf = str3.concat(valueOf);
                        }
                        iqz3.mo518d(valueOf);
                        Os.setenv("ADSP_LIBRARY_PATH", str, true);
                    } catch (ErrnoException e) {
                        iqz = cbd.f1832a;
                        valueOf = String.valueOf(e);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
                        stringBuilder.append("Failed to set ADSP_LIBRARY_PATH: ");
                        stringBuilder.append(valueOf);
                        iqz.mo520f(stringBuilder.toString());
                    }
                } catch (Exception e2) {
                    iqz = cbd.f1832a;
                    valueOf = String.valueOf(e2);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    stringBuilder.append("Error initializing Hexagon: ");
                    stringBuilder.append(valueOf);
                    iqz.mo520f(stringBuilder.toString());
                }
            } catch (UnsatisfiedLinkError e3) {
                iqz = cbd.f1832a;
                valueOf = String.valueOf(e3);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
                stringBuilder.append("Failed to load Hexagon library: ");
                stringBuilder.append(valueOf);
                iqz.mo520f(stringBuilder.toString());
            }
        }
        Gcam Create = Gcam.Create(initParams, staticMetadataVector, a);
        ird.mo1904b();
        return Create;
    }
}
