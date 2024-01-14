package org.classes;

import java.util.Scanner;

import static org.classes.CompareVersion.compareVersion;
import static org.classes.Version.equalizeArraysSize;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Version appVersion1 = new Version(scanner.nextLine());
        Version appVersion2 = new Version(scanner.nextLine());
        equalizeArraysSize(appVersion1.numberArray, appVersion2.numberArray);
        System.out.println(compareVersion(appVersion1.numberArray, appVersion2.numberArray, ">"));
        System.out.println(compareVersion(appVersion1.numberArray, appVersion2.numberArray, ">="));
        System.out.println(compareVersion(appVersion1.numberArray, appVersion2.numberArray, "<"));
        System.out.println(compareVersion(appVersion1.numberArray, appVersion2.numberArray, "<="));
        System.out.println(compareVersion(appVersion1.numberArray, appVersion2.numberArray, "="));
    }
}