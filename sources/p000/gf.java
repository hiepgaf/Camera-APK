package p000;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: PG */
/* renamed from: gf */
public class gf {
    /* renamed from: b */
    public int f5124b;
    /* renamed from: c */
    public gg f5125c;
    /* renamed from: d */
    public Context f5126d;
    /* renamed from: e */
    public boolean f5127e = false;
    /* renamed from: f */
    public boolean f5128f = false;
    /* renamed from: g */
    public boolean f5129g = true;
    /* renamed from: h */
    public boolean f5130h = false;

    public gf(Context context) {
        this.f5126d = context.getApplicationContext();
    }

    /* renamed from: a */
    public static String m2521a(Object obj) {
        StringBuilder stringBuilder = new StringBuilder(64);
        ha.m2972a(obj, stringBuilder);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public void mo3193b(Object obj) {
        gg ggVar = this.f5125c;
        if (ggVar != null) {
            ggVar.onLoadComplete(this, obj);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo1438a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f5124b);
        printWriter.print(" mListener=");
        printWriter.println(this.f5125c);
        if (this.f5127e || this.f5130h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f5127e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f5130h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(false);
        }
        if (this.f5128f || this.f5129g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f5128f);
            printWriter.print(" mReset=");
            printWriter.println(this.f5129g);
        }
    }

    /* renamed from: c */
    public boolean mo1439c() {
        return false;
    }

    /* renamed from: d */
    public void mo1440d() {
    }

    /* renamed from: e */
    public void mo3194e() {
    }

    /* renamed from: f */
    public void mo3195f() {
    }

    /* renamed from: g */
    public final void m2528g() {
        this.f5129g = true;
        this.f5127e = false;
        this.f5128f = false;
        this.f5130h = false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        ha.m2972a((Object) this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.f5124b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
