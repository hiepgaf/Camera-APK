package p000;

import android.content.Context;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gc */
public abstract class gc extends gf {
    /* renamed from: a */
    public volatile gd f16733a;
    /* renamed from: i */
    private final Executor f16734i;
    /* renamed from: j */
    private volatile gd f16735j;

    public gc(Context context) {
        this(context, gk.f5271b);
    }

    /* renamed from: b */
    public abstract Object mo3192b();

    private gc(Context context, Executor executor) {
        super(context);
        this.f16734i = executor;
    }

    /* renamed from: a */
    final void m10945a(gd gdVar) {
        if (this.f16735j == gdVar) {
            SystemClock.uptimeMillis();
            this.f16735j = null;
            m10944a();
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo1438a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo1438a(str, fileDescriptor, printWriter, strArr);
        if (this.f16733a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f16733a);
            printWriter.print(" waiting=");
            printWriter.println(this.f16733a.f16797a);
        }
        if (this.f16735j != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f16735j);
            printWriter.print(" waiting=");
            printWriter.println(this.f16735j.f16797a);
        }
    }

    /* renamed from: a */
    final void m10944a() {
        if (this.f16735j == null && this.f16733a != null) {
            boolean z = this.f16733a.f16797a;
            gk gkVar = this.f16733a;
            Executor executor = this.f16734i;
            if (gkVar.f5277e != go.f5563a) {
                switch (gkVar.f5277e - 1) {
                    case 1:
                        throw new IllegalStateException("Cannot execute task: the task is already running.");
                    case 2:
                        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                    default:
                        throw new IllegalStateException("We should never reach this state");
                }
            }
            gkVar.f5277e = go.f5564b;
            gp gpVar = gkVar.f5275c;
            executor.execute(gkVar.f5276d);
        }
    }

    /* renamed from: c */
    protected final boolean mo1439c() {
        boolean z = false;
        if (this.f16733a != null) {
            if (!this.e) {
                this.h = true;
            }
            boolean z2;
            if (this.f16735j != null) {
                z2 = this.f16733a.f16797a;
                this.f16733a = null;
            } else {
                z2 = this.f16733a.f16797a;
                gk gkVar = this.f16733a;
                gkVar.f5278f.set(true);
                z = gkVar.f5276d.cancel(false);
                if (z) {
                    this.f16735j = this.f16733a;
                }
                this.f16733a = null;
            }
        }
        return z;
    }

    /* renamed from: d */
    protected final void mo1440d() {
        super.mo1440d();
        mo1439c();
        this.f16733a = new gd(this);
        m10944a();
    }
}
