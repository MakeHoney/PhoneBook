package com.company;


import javax.swing.*;

public class PhoneBookVer04 {



    public static void main(String[] args) {
        int choice = 0;
        Manager manager = new Manager();

        while(true)
        {
            Menu.showMenu();
            try {
                choice = toFour(choice);
            }
            catch(MenuSelectionException e)
            {
                System.out.println(e.getMessage());
            }
            Menu.keyboard.nextLine();
            switch(choice)
            {
                case 1:
                    manager.addData();
                    break;

                case 2:
                    manager.searchData();
                    break;

                case 3:
                    manager.removeData();
                    break;

                case 4:
                    System.out.print("프로그램을 종료합니다");
                    return;
            }
        }
    }
    public static int toFour(int num) throws MenuSelectionException
    {
        num = Menu.keyboard.nextInt();
        if(num > 4 || num < 1)
        {
            MenuSelectionException excp = new MenuSelectionException();
            throw excp;
        }
        else
            return num;
    }
}
