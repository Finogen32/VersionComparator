package org.classes;

import java.util.ArrayList;

public class Version {
    ArrayList<String> numberArray = new ArrayList<String>();
    int length;

    public Version(String version) {
        String[] numberArrayForList = version.split("\\.");
        if (checkIfArraysElementsIsNumeric(numberArrayForList)) {
            for (String numberFromArray : numberArrayForList) {
                this.numberArray.add(numberFromArray);
            }
            this.length = numberArray.size();
        } else {
            System.out.println("App version has invalid data");
            throw new NumberFormatException();
        }
    }

    public boolean checkIfArraysElementsIsNumeric(String[] numericArray) {
        boolean flag = true;
        for (String arrayElement : numericArray) {
            char[] charArray = arrayElement.toCharArray();
            for (char element : charArray) {
                flag = Character.isDigit(element);
                if (flag == false) {
                    return flag;
                }
            }
        }
        return flag;
    }

    public static void equalizeArraysSize(ArrayList<String> array1, ArrayList<String> array2){
        if (array1.size() > array2.size()){
            int sizeDiff = array1.size() - array2.size();
            for(int i = 0; i < sizeDiff; i++){
                array2.add("0");
            }
        }else if (array2.size() > array1.size()){
            int sizeDiff = array2.size() - array1.size();
            for(int i = 0; i < sizeDiff; i++){
                array1.add("0");
            }
        }
    }
}
