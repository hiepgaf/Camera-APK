package p000;

/* compiled from: PG */
/* renamed from: jiy */
public enum jiy {
    COLLAGE,
    ANIMATION,
    PHOTO_BOOTH,
    GROUP_SMILES,
    VFR_VIDEO;

    /* renamed from: a */
    public static jiy m4515a(String str) {
        if (jiu.m4512b(str)) {
            return COLLAGE;
        }
        if (jiu.m4513c(str)) {
            return ANIMATION;
        }
        if (str.equals("AllSmiles")) {
            return GROUP_SMILES;
        }
        if (str.equals("Collage_PhotoBooth")) {
            return PHOTO_BOOTH;
        }
        if (str.equals("Video_VFR")) {
            return VFR_VIDEO;
        }
        String valueOf = String.valueOf(str);
        String str2 = "No creation type for artifact ";
        throw new RuntimeException(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
    }
}
