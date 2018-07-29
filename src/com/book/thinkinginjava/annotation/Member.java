package com.book.thinkinginjava.annotation;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/7/29
 */
@DBTable(name = "MEMBER") // 表名
public class Member {
    @SQLString(30) String firstName;
    @SQLString(50) String lastName;
    @SQLInteger Integer age;
    @SQLString(value = 30, constrains = @Constraints(primaryKey = true)) String handle;
    static int memberCount;

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public Integer getAge() { return age; }
    public String getHandle() { return handle; }
    @Override public String toString() { return handle; }
}
