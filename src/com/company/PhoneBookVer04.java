package com.company;

public class PhoneBookVer04 {



    public static void main(String[] args) {
        int choice;
        manager manager = new manager();

        while(true)
        {
            Menu.showMenu();
            choice = Menu.keyboard.nextInt();
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
}
