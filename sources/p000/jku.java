package p000;

import com.google.common.io.ByteStreams;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: jku */
final class jku implements Callable {
    /* renamed from: a */
    private final /* synthetic */ InputStream f7898a;
    /* renamed from: b */
    private final /* synthetic */ OutputStream f7899b;
    /* renamed from: c */
    private final /* synthetic */ jwx f7900c;

    jku(InputStream inputStream, OutputStream outputStream, jwx jwx) {
        this.f7898a = inputStream;
        this.f7899b = outputStream;
        this.f7900c = jwx;
    }

    public final /* synthetic */ Object call() {
        ByteStreams.copy(this.f7898a, this.f7899b);
        this.f7898a.close();
        this.f7899b.close();
        return this.f7900c;
    }
}
