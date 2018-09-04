package p000;

import android.content.Context;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: esx */
public final class esx implements gqd {
    /* renamed from: a */
    private static final String f15497a = bli.m862a("ScanResumeBehav");
    /* renamed from: b */
    private final gsp f15498b;
    /* renamed from: c */
    private final gtf f15499c;
    /* renamed from: d */
    private final Context f15500d;
    /* renamed from: e */
    private final AtomicBoolean f15501e = new AtomicBoolean(false);

    public esx(gsp gsp, gtf gtf, Context context) {
        this.f15498b = gsp;
        this.f15499c = gtf;
        this.f15500d = context;
    }

    public final void run() {
        String valueOf;
        String str;
        try {
            if (!this.f15501e.getAndSet(true)) {
                File parentFile = this.f15499c.m2810a("arbitrary").getParentFile();
                File parentFile2 = this.f15499c.m2811a("arbitrary", ixx.JPEG).getParentFile();
                if (parentFile != null && parentFile.exists() && parentFile2 != null) {
                    File[] listFiles = parentFile.listFiles();
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (file.getName().endsWith(".jpg.tmp")) {
                                parentFile = new File(parentFile2, file.getName().replace(".tmp", ""));
                                str = f15497a;
                                valueOf = String.valueOf(file);
                                String valueOf2 = String.valueOf(parentFile);
                                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 19) + String.valueOf(valueOf2).length());
                                stringBuilder.append("Restoring JPEG ");
                                stringBuilder.append(valueOf);
                                stringBuilder.append(" to ");
                                stringBuilder.append(valueOf2);
                                bli.m863a(str, stringBuilder.toString());
                                kiz.m4970a(file, parentFile);
                                this.f15498b.mo1634a(this.f15500d, parentFile.getAbsolutePath());
                            } else if (!file.getName().equals(".nomedia")) {
                                str = f15497a;
                                valueOf = "Unknown file found in failsafe dir: ";
                                String valueOf3 = String.valueOf(file.getAbsolutePath());
                                if (valueOf3.length() == 0) {
                                    valueOf3 = new String(valueOf);
                                } else {
                                    valueOf3 = valueOf.concat(valueOf3);
                                }
                                bli.m873e(str, valueOf3);
                            }
                        }
                    }
                }
            }
        } catch (Throwable e) {
            str = f15497a;
            valueOf = "Failed to recover file ";
            String valueOf4 = String.valueOf(file.getAbsolutePath());
            if (valueOf4.length() == 0) {
                valueOf4 = new String(valueOf);
            } else {
                valueOf4 = valueOf.concat(valueOf4);
            }
            bli.m867b(str, valueOf4, e);
        } catch (Throwable e2) {
            bli.m867b(f15497a, "Failed to restore JPEG files", e2);
        }
    }
}
