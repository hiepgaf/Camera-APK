package p000;

/* compiled from: PG */
/* renamed from: kuu */
final class kuu extends IllegalArgumentException {
    kuu(int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("Unpaired surrogate at index ");
        stringBuilder.append(i);
        stringBuilder.append(" of ");
        stringBuilder.append(i2);
        super(stringBuilder.toString());
    }
}
