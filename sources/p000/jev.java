package p000;

import android.opengl.GLES30;

/* compiled from: PG */
/* renamed from: jev */
public final class jev {
    /* renamed from: a */
    public static final int[] f7752a = new int[2];

    /* renamed from: a */
    static jfj m4436a() {
        String glGetString = GLES30.glGetString(7938);
        String[] split = glGetString.split("\\s");
        StringBuilder stringBuilder;
        if (split.length >= 3 && split[0].equals("OpenGL") && split[1].equals("ES")) {
            String str = split[2];
            split = str.split("\\.");
            String[] strArr = split.length == 1 ? new String[]{split[0], "0"} : split;
            if (strArr.length != 2) {
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 32);
                stringBuilder.append("Unexpected GL version format '");
                stringBuilder.append(str);
                stringBuilder.append("'!");
                throw new jdh(stringBuilder.toString());
            }
            try {
                return new jfj(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]));
            } catch (NumberFormatException e) {
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 42);
                stringBuilder.append("Unexpected numerical GL version format '");
                stringBuilder.append(str);
                stringBuilder.append("'!");
                throw new jdh(stringBuilder.toString());
            }
        }
        stringBuilder = new StringBuilder(String.valueOf(glGetString).length() + 32);
        stringBuilder.append("Unexpected GL version string '");
        stringBuilder.append(glGetString);
        stringBuilder.append("'!");
        throw new jdh(stringBuilder.toString());
    }
}
