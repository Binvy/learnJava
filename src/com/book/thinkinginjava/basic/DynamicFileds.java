package com.book.thinkinginjava.basic;

import com.tstar.basic.RecursiveBinarySearch;

/**
 * @comments: 异常链
 * @author: binvy
 * @Date: 2018/3/6
 */
class DynamicFieldsException extends Exception { }
public class DynamicFileds {
    private Object[][] fields;
    public DynamicFileds(int initialSize) {
        fields = new Object[initialSize][2];
        for ( int i = 0; i < initialSize; i++ ) {
            fields[i] = new Object[] {null, null};
        }
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object[] object : fields) {
            result.append(object[0]);
            result.append(":");
            result.append(object[1]);
            result.append("\n");
        }
        return result.toString();
    }
    private int hasFiled(String id) {
        for ( int i = 0; i < fields.length; i++ ) {
            if (id.equals(fields[i][0])) {
                return i;
            }
        }
        return -1;
    }
    private int getFiledNumber(String id) throws NoSuchFieldException {
        int filedName =hasFiled(id);
        if (filedName == -1) {
            throw new NoSuchFieldException();
        }
        return filedName;
    }
    private int makeFiled(String id) {
        for ( int i = 0; i < fields.length; i++ ) {
            if (fields[i][0] == null) {
                fields[i][0] = id;
                return i;
            }
        }
        // No empty fields, Add one
        Object[][] temp = new Object[fields.length + 1][2];
        for ( int i = 0; i < fields.length; i++ ) {
            temp[i] = fields[i];
        }
        for ( int i = fields.length; i < temp.length; i++ ) {
            temp[i] = new Object[] {null, null};
        }
        fields = temp;
        // Recursive call with expanded fields
        return makeFiled(id);
    }
    public Object getFiled(String id) throws NoSuchFieldException {
        return fields[getFiledNumber(id)];
    }
    public Object setFiled(String id, Object value) throws DynamicFieldsException{
        if (value == null) {
            DynamicFieldsException dynamicFieldsException = new DynamicFieldsException();
            dynamicFieldsException.initCause(new NullPointerException());
            throw dynamicFieldsException;
        }
        int fieldNumber = hasFiled(id);
        if (fieldNumber == -1) {
            fieldNumber = makeFiled(id);
        }
        Object result = null;
        try {
            result = getFiled(id);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        fields[fieldNumber][1] = value;
        return result;
    }

    public static void main(String[] args) {
        DynamicFileds dynamicFileds = new DynamicFileds(3);
        System.out.println(dynamicFileds);
        try {
            dynamicFileds.setFiled("d", "A value for d");
            dynamicFileds.setFiled("number", 47);
            dynamicFileds.setFiled("number2", 48);
            System.out.println(dynamicFileds);
            dynamicFileds.setFiled("d", "A new value for d");
            dynamicFileds.setFiled("number3", 11);
            System.out.println("dynamicField:" + dynamicFileds);
            System.out.println("dynamicField(\"d\") : " + dynamicFileds.getFiled("d"));
            Object field = dynamicFileds.setFiled("d", null);
        } catch (DynamicFieldsException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
