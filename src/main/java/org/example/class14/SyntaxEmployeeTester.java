package org.example.class14;

import jdk.dynalink.NamespaceOperation;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {
    SyntaxEmployee e1=new SyntaxEmployee();
    e1.EmpID=1234;
    e1.salary=3250000;
        System.out.println("Syntax CEO "+ e1.CEO+"'s EID is "+ e1.EmpID+" and he's annual salary is USD"+e1.salary);
        SyntaxEmployee e2=new SyntaxEmployee();
        e2.EmpID=567;
        e2.salary=150000;

        System.out.println(e2.salary);
        System.out.println(e2.EmpID);
        System.out.println(e2.CEO);

        SyntaxEmployee e3=new SyntaxEmployee();
        e3.EmpID=10111;
        e3.salary=130000;

        System.out.println(e3.salary);
        System.out.println(e3.EmpID);
        System.out.println(e3.CEO);
}}
