package com.book.thinkinginjava.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @comments: 注解类处理器
 * @author: binvy
 * @Date: 2018/7/29
 */
public class TableCreator {
    public static void main(String[] args) throws ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list.add("com.book.thinkinginjava.annotation.Member");
        generatorSQL(list);
    }
    public static void generatorSQL(List<String> classes) throws ClassNotFoundException {
        if (classes == null || classes.size() <= 0) {
            System.out.println("Can't generator SQL without not annotation class name");
            System.exit(0);
        }
        for ( String className : classes
               ) {
            Class<?> clazz = Class.forName(className);
            DBTable dbTable = clazz.getAnnotation(DBTable.class);
            if (dbTable == null) {
                System.out.println("No DBTable annotation in class " + className);
                continue;
            }
            String tableName = dbTable.name();
            if (tableName.length() < 1) {
                tableName = clazz.getName().toUpperCase();
            }
            List<String> columnDefs = new ArrayList<>();
            for ( Field field : clazz.getDeclaredFields()
                   ) {
                String columnName = null;
                Annotation[] annotations = field.getDeclaredAnnotations();
                if (annotations.length < 1) {
                    continue;
                }
                if (annotations[0] instanceof SQLInteger) {
                    SQLInteger sqlInteger = (SQLInteger) annotations[0];
                    if (sqlInteger.name().length() < 1) {
                        columnName = field.getName().toUpperCase();
                    } else {
                        columnName = sqlInteger.name();
                    }
                    columnDefs.add(columnName + " INT " + getConstraints(sqlInteger.constraints()));
                }
                if (annotations[0] instanceof SQLString) {
                    SQLString sqlString = (SQLString) annotations[0];
                    if (sqlString.name().length() < 1) {
                        columnName = field.getName().toUpperCase();
                    } else {
                        columnName = sqlString.name();
                    }
                    columnDefs.add(columnName + " VARCHAR(" + sqlString.value() + ")" + getConstraints(sqlString.constrains()));
                }
                StringBuilder command = new StringBuilder("CREATE TABLE " + tableName + "(");
                for ( String columnDef : columnDefs
                       ) {
                    command.append("\n     " + columnDef + "," );
                }
                String tableCreate = command.substring(0, command.length() - 1 ) + ");";
                System.out.println("Table Creating SQL for " + className + " is: \n" + tableCreate);
            }
        }
    }

    public static String getConstraints(Constraints constraints) {
        String result = "";
        if (!constraints.allowNull()){
            result += " NOT NULL";
        }
        if (constraints.primaryKey()) {
            result += " PRIMARY KEY";
        }
        if (constraints.unique()) {
            result += " UNIQUE";
        }
        return result;
    }
}
