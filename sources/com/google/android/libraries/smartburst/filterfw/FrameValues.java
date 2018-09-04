package com.google.android.libraries.smartburst.filterfw;

import java.lang.reflect.Array;

/* compiled from: PG */
public class FrameValues extends FrameValue {
    FrameValues(BackingStore backingStore) {
        super(backingStore);
    }

    static FrameValues create(BackingStore backingStore) {
        FrameValue.assertObjectBased(backingStore.getFrameType());
        return new FrameValues(backingStore);
    }

    public int getCount() {
        Object value = super.getValue();
        if (value == null || !value.getClass().isArray()) {
            return 1;
        }
        return Array.getLength(super.getValue());
    }

    public FrameValue getFrameValueAtIndex(int i) {
        Object valueAtIndex = getValueAtIndex(i);
        FrameValue asFrameValue = Frame.create(getType().asSingle(), new int[0]).asFrameValue();
        asFrameValue.setValue(valueAtIndex);
        return asFrameValue;
    }

    public Object getValueAtIndex(int i) {
        Object value = super.getValue();
        if (value != null && value.getClass().isArray()) {
            return Array.get(value, i);
        }
        if (i == 0) {
            return value;
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public Object getValues() {
        Object value = super.getValue();
        if (value == null || value.getClass().isArray()) {
            return super.getValue();
        }
        Object[] objArr = (Object[]) Array.newInstance(value.getClass(), 1);
        objArr[0] = value;
        return objArr;
    }

    public void setFrameValueAtIndex(FrameValue frameValue, int i) {
        setValueAtIndex(frameValue.getValue(), i);
    }

    public void setValueAtIndex(Object obj, int i) {
        super.assertAccessible(2);
        Object value = super.getValue();
        if (value != null && value.getClass().isArray()) {
            Array.set(value, i, obj);
        } else if (i != 0) {
            throw new ArrayIndexOutOfBoundsException(i);
        } else {
            super.setValue(obj);
        }
    }

    public void setValues(Object obj) {
        super.setValue(obj);
    }
}
