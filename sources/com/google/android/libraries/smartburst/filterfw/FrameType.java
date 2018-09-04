package com.google.android.libraries.smartburst.filterfw;

/* compiled from: PG */
public final class FrameType {
    public static final int ACCESS_UNKNOWN = 0;
    public static final int ELEMENT_DONTCARE = 0;
    public static final int ELEMENT_FLOAT32 = 200;
    public static final int ELEMENT_FLOAT64 = 201;
    public static final int ELEMENT_INT16 = 101;
    public static final int ELEMENT_INT32 = 102;
    public static final int ELEMENT_INT64 = 103;
    public static final int ELEMENT_INT8 = 100;
    public static final int ELEMENT_OBJECT = 1;
    public static final int ELEMENT_RGBA8888 = 301;
    public static final int READ_ALLOCATION = 4;
    public static final int READ_CPU = 1;
    public static final int READ_GPU = 2;
    public static final int WRITE_ALLOCATION = 32;
    public static final int WRITE_CPU = 8;
    public static final int WRITE_GPU = 16;
    public static SimpleCache mTypeCache = new SimpleCache(64);
    public final int mAccessHints;
    public final Class mClass;
    public final int mDimensions;
    public final int mElementId;

    private FrameType(int i, int i2, int i3, Class cls) {
        this.mElementId = i;
        this.mDimensions = i2;
        this.mClass = cls;
        this.mAccessHints = i3;
    }

    public static FrameType any() {
        return fetchType(0, -1, 0);
    }

    public static FrameType array() {
        return fetchType(null, 1);
    }

    public static FrameType array(Class cls) {
        return fetchType(cls, 1);
    }

    public final FrameType asArray() {
        if (this.mElementId == 1) {
            return fetchType(this.mClass, 1);
        }
        throw new RuntimeException("Calling asArray() on non-object type!");
    }

    public final FrameType asSingle() {
        if (this.mElementId == 1) {
            return fetchType(this.mClass, 0);
        }
        throw new RuntimeException("Calling asSingle() on non-object type!");
    }

    public static FrameType buffer1D(int i) {
        return fetchType(i, 1, 0);
    }

    public static FrameType buffer2D(int i) {
        return fetchType(i, 2, 0);
    }

    private static String elementToString(int i, Class cls) {
        switch (i) {
            case 0:
                return "*";
            case 1:
                String simpleName = cls != null ? cls.getSimpleName() : "*";
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(simpleName).length() + 2);
                stringBuilder.append("<");
                stringBuilder.append(simpleName);
                stringBuilder.append(">");
                return stringBuilder.toString();
            case 100:
                return "int8";
            case 101:
                return "int16";
            case 102:
                return "int32";
            case 103:
                return "int64";
            case 200:
                return "float32";
            case ELEMENT_FLOAT64 /*201*/:
                return "float64";
            case ELEMENT_RGBA8888 /*301*/:
                return "rgba8888";
            default:
                return "?";
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FrameType)) {
            return false;
        }
        FrameType frameType = (FrameType) obj;
        if (this.mElementId == frameType.mElementId && this.mDimensions == frameType.mDimensions && this.mAccessHints == frameType.mAccessHints && this.mClass == frameType.mClass) {
            return true;
        }
        return false;
    }

    private static FrameType fetchType(int i, int i2, int i3) {
        return fetchType(i, i2, i3, null);
    }

    private static FrameType fetchType(int i, int i2, int i3, Class cls) {
        String keyValueForType = keyValueForType(i, i2, i3, cls);
        FrameType frameType = (FrameType) mTypeCache.get(keyValueForType);
        if (frameType != null) {
            return frameType;
        }
        frameType = new FrameType(i, i2, i3, cls);
        mTypeCache.put(keyValueForType, frameType);
        return frameType;
    }

    private static FrameType fetchType(Class cls, int i) {
        return fetchType(1, i, 0, cls);
    }

    public final int getAccessHints() {
        return this.mAccessHints;
    }

    public final Class getContentClass() {
        return this.mClass;
    }

    public final int getElementId() {
        return this.mElementId;
    }

    public final int getElementSize() {
        switch (this.mElementId) {
            case 100:
                return 1;
            case 101:
                return 2;
            case 102:
            case 103:
            case 200:
            case ELEMENT_FLOAT64 /*201*/:
            case ELEMENT_RGBA8888 /*301*/:
                return 4;
            default:
                return 0;
        }
    }

    public final int getNumberOfDimensions() {
        return this.mDimensions;
    }

    public final int hashCode() {
        return ((this.mElementId ^ this.mDimensions) ^ this.mAccessHints) ^ this.mClass.hashCode();
    }

    public static FrameType image2D(int i, int i2) {
        return fetchType(i, 2, i2);
    }

    public final boolean isSpecified() {
        return this.mElementId != 0 && this.mDimensions >= 0;
    }

    final String keyString() {
        return keyValueForType(this.mElementId, this.mDimensions, this.mAccessHints, this.mClass);
    }

    private static String keyValueForType(int i, int i2, int i3, Class cls) {
        String name = cls == null ? "0" : cls.getName();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(name).length() + 36);
        stringBuilder.append(i);
        stringBuilder.append(":");
        stringBuilder.append(i2);
        stringBuilder.append(":");
        stringBuilder.append(i3);
        stringBuilder.append(":");
        stringBuilder.append(name);
        return stringBuilder.toString();
    }

    static FrameType merge(FrameType frameType, FrameType frameType2) {
        FrameType tryMerge = tryMerge(frameType, frameType2);
        if (tryMerge != null) {
            return tryMerge;
        }
        String valueOf = String.valueOf(frameType);
        String valueOf2 = String.valueOf(frameType2);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 40) + String.valueOf(valueOf2).length());
        stringBuilder.append("Incompatible types in connection: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" vs. ");
        stringBuilder.append(valueOf2);
        stringBuilder.append("!");
        throw new RuntimeException(stringBuilder.toString());
    }

    private static Class mergeClasses(Class cls, Class cls2) {
        if (cls == null) {
            return cls2;
        }
        if (cls2 == null) {
            return cls;
        }
        if (cls.isAssignableFrom(cls2)) {
            return cls2;
        }
        if (cls2.isAssignableFrom(cls)) {
            return cls;
        }
        return null;
    }

    public static FrameType single() {
        return fetchType(null, 0);
    }

    public static FrameType single(Class cls) {
        return fetchType(cls, 0);
    }

    public final String toString() {
        String elementToString = elementToString(this.mElementId, this.mClass);
        int i = this.mDimensions;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(elementToString).length() + 13);
        stringBuilder.append(elementToString);
        stringBuilder.append("[");
        stringBuilder.append(i);
        stringBuilder.append("]");
        elementToString = stringBuilder.toString();
        if ((this.mAccessHints & 1) != 0) {
            elementToString = String.valueOf(elementToString).concat("(rcpu)");
        }
        if ((this.mAccessHints & 2) != 0) {
            elementToString = String.valueOf(elementToString).concat("(rgpu)");
        }
        if ((this.mAccessHints & 4) != 0) {
            elementToString = String.valueOf(elementToString).concat("(ralloc)");
        }
        if ((this.mAccessHints & 8) != 0) {
            elementToString = String.valueOf(elementToString).concat("(wcpu)");
        }
        if ((this.mAccessHints & 16) != 0) {
            elementToString = String.valueOf(elementToString).concat("(wgpu)");
        }
        if ((this.mAccessHints & 32) != 0) {
            return String.valueOf(elementToString).concat("(walloc)");
        }
        return elementToString;
    }

    static FrameType tryMerge(FrameType frameType, FrameType frameType2) {
        int i = frameType.mElementId;
        if (i == 0) {
            return frameType2;
        }
        int i2 = frameType2.mElementId;
        if (i2 == 0) {
            return frameType;
        }
        if (i == 1 && i2 == 1) {
            return tryMergeObjectTypes(frameType, frameType2);
        }
        return (frameType.mDimensions <= 0 || i != i2) ? null : tryMergeBuffers(frameType, frameType2);
    }

    static FrameType tryMergeBuffers(FrameType frameType, FrameType frameType2) {
        int i = frameType.mDimensions;
        if (i != frameType2.mDimensions) {
            return null;
        }
        return fetchType(frameType.mElementId, i, frameType.mAccessHints | frameType2.mAccessHints);
    }

    static FrameType tryMergeObjectTypes(FrameType frameType, FrameType frameType2) {
        Object obj = 1;
        int max = Math.max(frameType.mDimensions, frameType2.mDimensions);
        Class mergeClasses = mergeClasses(frameType.mClass, frameType2.mClass);
        if (mergeClasses == null && frameType.mClass != null) {
            obj = null;
        }
        return obj != null ? fetchType(mergeClasses, max) : null;
    }
}
