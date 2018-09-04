package p000;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnErrorListener;
import android.media.MediaRecorder.OnInfoListener;
import android.os.SystemClock;
import android.view.Surface;
import java.io.File;
import java.io.FileDescriptor;

/* compiled from: PG */
/* renamed from: biz */
public final class biz implements ipy {
    /* renamed from: a */
    private final ipy f10951a;
    /* renamed from: b */
    private final grr f10952b;

    public biz(ipy ipy, grr grr) {
        this.f10951a = ipy;
        this.f10952b = grr;
    }

    /* renamed from: a */
    public final MediaRecorder mo471a() {
        return this.f10951a.mo471a();
    }

    /* renamed from: b */
    public final synchronized Surface mo483b() {
        return this.f10951a.mo483b();
    }

    /* renamed from: c */
    public final synchronized void mo485c() {
        this.f10951a.mo485c();
    }

    /* renamed from: d */
    public final synchronized void mo487d() {
        try {
            grr grr = this.f10952b;
            iya iya = grr.m;
            grr.f17268a = SystemClock.elapsedRealtimeNanos();
            grr.m1326a("MediaRecorder Prepare Start", grr.f17268a);
            this.f10951a.mo487d();
            this.f10952b.m11407b();
        } catch (Throwable th) {
            this.f10952b.m11407b();
        }
    }

    /* renamed from: e */
    public final synchronized void mo489e() {
        this.f10951a.mo489e();
    }

    /* renamed from: f */
    public final synchronized void mo491f() {
        this.f10951a.mo491f();
    }

    /* renamed from: g */
    public final synchronized void mo493g() {
        this.f10951a.mo493g();
    }

    /* renamed from: a */
    public final synchronized void mo474a(int i) {
        this.f10951a.mo474a(i);
    }

    /* renamed from: b */
    public final synchronized void mo484b(int i) {
        this.f10951a.mo484b(i);
    }

    /* renamed from: c */
    public final synchronized void mo486c(int i) {
        this.f10951a.mo486c(i);
    }

    /* renamed from: d */
    public final synchronized void mo488d(int i) {
        this.f10951a.mo488d(i);
    }

    /* renamed from: e */
    public final synchronized void mo490e(int i) {
        this.f10951a.mo490e(i);
    }

    /* renamed from: a */
    public final synchronized void mo472a(double d) {
        this.f10951a.mo472a(d);
    }

    /* renamed from: a */
    public final synchronized void mo479a(Surface surface) {
        this.f10951a.mo479a(surface);
    }

    /* renamed from: a */
    public final synchronized void mo473a(float f, float f2) {
        this.f10951a.mo473a(f, f2);
    }

    /* renamed from: f */
    public final synchronized void mo492f(int i) {
        this.f10951a.mo492f(i);
    }

    /* renamed from: a */
    public final synchronized void mo476a(long j) {
        this.f10951a.mo476a(j);
    }

    /* renamed from: a */
    public final synchronized void mo480a(File file) {
        this.f10951a.mo480a(file);
    }

    /* renamed from: a */
    public final synchronized void mo477a(OnErrorListener onErrorListener) {
        this.f10951a.mo477a(onErrorListener);
    }

    /* renamed from: a */
    public final synchronized void mo478a(OnInfoListener onInfoListener) {
        this.f10951a.mo478a(onInfoListener);
    }

    /* renamed from: g */
    public final synchronized void mo494g(int i) {
        this.f10951a.mo494g(i);
    }

    /* renamed from: a */
    public final synchronized void mo481a(FileDescriptor fileDescriptor) {
        this.f10951a.mo481a(fileDescriptor);
    }

    /* renamed from: a */
    public final synchronized void mo482a(String str) {
        this.f10951a.mo482a(str);
    }

    /* renamed from: h */
    public final synchronized void mo496h(int i) {
        this.f10951a.mo496h(i);
    }

    /* renamed from: i */
    public final synchronized void mo498i(int i) {
        this.f10951a.mo498i(i);
    }

    /* renamed from: j */
    public final synchronized void mo499j(int i) {
        this.f10951a.mo499j(i);
    }

    /* renamed from: k */
    public final synchronized void mo500k(int i) {
        this.f10951a.mo500k(i);
    }

    /* renamed from: a */
    public final synchronized void mo475a(int i, int i2) {
        this.f10951a.mo475a(i, i2);
    }

    /* renamed from: l */
    public final synchronized void mo501l(int i) {
        this.f10951a.mo501l(i);
    }

    /* renamed from: h */
    public final synchronized void mo495h() {
        this.f10951a.mo495h();
    }

    /* renamed from: i */
    public final synchronized void mo497i() {
        this.f10951a.mo497i();
    }
}
