package p000;

/* compiled from: PG */
/* renamed from: inb */
public enum inb {
    AAC("audio/mp4a-latm"),
    AMR_NB("audio/amr-wb"),
    AMR_WB("audio/3gpp"),
    VORBIS("audio/vorbis");
    
    /* renamed from: e */
    private final String f7135e;

    private inb(String str) {
        this.f7135e = str;
    }

    public final String toString() {
        return this.f7135e;
    }
}
