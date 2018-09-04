package p000;

/* renamed from: ieo */
public final class ieo {
    /* renamed from: a */
    public static final huh f6977a = new huh("LocationServices.API", f6979c, f6978b);
    /* renamed from: b */
    private static final hum f6978b = new hum((byte) 0);
    /* renamed from: c */
    private static final huk f6979c = new iep();

    static {
        iel iel = new iel();
        iem iem = new iem();
        ier ier = new ier();
    }

    /* renamed from: a */
    public static iff m3725a(huq huq) {
        boolean z = true;
        htl.m3436b(huq != null, (Object) "GoogleApiClient parameter is required.");
        iff iff = (iff) huq.mo1845a(f6978b);
        if (iff == null) {
            z = false;
        }
        htl.m3422a(z, (Object) "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return iff;
    }
}
