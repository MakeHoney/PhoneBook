package com.company;

/**
 * Created by Byunghun on 2017-09-07.
 */
public class MenuSelectionException extends Exception {
    public MenuSelectionException(){
        super("유효하지 않은 숫자가 입력되었습니다.");
    }
}