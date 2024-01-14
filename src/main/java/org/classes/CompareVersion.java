package org.classes;

import java.util.ArrayList;

public class CompareVersion {

    public static boolean compareVersion(ArrayList<String> version1, ArrayList<String> version2, String symbol) {
        boolean flag = false;
        switch (symbol) {
            case (">"):
                for (int i = 0; i < version1.size(); i++) {
                    if (version1.get(i).equals(version2.get(i)) && i == version1.size() - 1) {
                        continue;
                    } else if (version1.get(i).equals(version2.get(i))) {
                        return false;
                    } else {
                        return Integer.parseInt(version1.get(i)) > Integer.parseInt(version2.get(i));
                    }
                }
            case (">="):
                for (int i = 0; i < version1.size(); i++) {
                    if (version1.get(i).equals(version2.get(i)) && i == version1.size() - 1) {
                        continue;
                    } else if (version1.get(i).equals(version2.get(i))) {
                        return true;
                    } else {
                        return Integer.parseInt(version1.get(i)) >= Integer.parseInt(version2.get(i));
                    }
                }
            case ("<"):
                for (int i = 0; i < version1.size(); i++) {
                    if (version1.get(i).equals(version2.get(i)) && i == version1.size() - 1) {
                        continue;
                    } else if (version1.get(i).equals(version2.get(i))) {
                        return false;
                    } else {
                        return Integer.parseInt(version1.get(i)) < Integer.parseInt(version2.get(i));
                    }
                }
            case ("<="):
                for (int i = 0; i < version1.size(); i++) {
                    if (version1.get(i).equals(version2.get(i)) && i == version1.size() - 1) {
                        continue;
                    } else if (version1.get(i).equals(version2.get(i))) {
                        return true;
                    } else {
                        return Integer.parseInt(version1.get(i)) <= Integer.parseInt(version2.get(i));
                    }
                }
            case ("="):
                for (int i = 0; i < version1.size(); i++) {
                    if (version1.get(i).equals(version2.get(i)) && i == version1.size() - 1) {
                        continue;
                    } else if (version1.get(i).equals(version2.get(i))) {
                        return true;
                    } else {
                        return Integer.parseInt(version1.get(i)) == Integer.parseInt(version2.get(i));
                    }
                }
        }
        return flag;
    }
}
