package p000;

import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: aic */
final class aic implements arw {
    aic() {
    }

    /* renamed from: b */
    private static aid m6479b() {
        try {
            return new aid(MessageDigest.getInstance("SHA-256"));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo51a() {
        return aic.m6479b();
    }
}
