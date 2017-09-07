package com.company;

/**
 * Created by Byunghun on 2017-07-10.
 */
public class Manager {

    final int MAX_NODE = 100;
    PhoneInfo[] ph = new PhoneInfo[MAX_NODE];
    int numOfNode = 0;

    public void addData()
    {
        int choice = 0;

        System.out.println("데이터 입력을 시작합니다.");

        while(true)
        {
            System.out.println("1. 일반, 2. 대학, 3. 회사");
            try {
                choice = toThree(choice);
            }
            catch(MenuSelectionException e)
            {
                System.out.println(e.getMessage());
                continue;
            }
            Menu.keyboard.nextLine();
            break;
            /*if(!(choice == 1 || choice == 2 || choice == 3)) {
                System.out.println("1, 2, 3 중에서 선택하십시오.");
                continue;
            }
            else
                break; */
        }


        if(numOfNode >= MAX_NODE)
        {
            System.out.println("전화번호부의 저장공간이 꽉 찼습니다.");
            System.out.println("추가를 원하시면 기존의 명부를 삭제하세요.");
        }
        else
        {
            System.out.print("이름: ");
            String name = Menu.keyboard.nextLine();
            System.out.print("전화번호: ");
            String phonenumber = Menu.keyboard.nextLine();

            if(choice == 2)
            {
                System.out.print("전공: ");
                String major = Menu.keyboard.nextLine();
                System.out.print("학년: ");
                int year = Menu.keyboard.nextInt();
                Menu.keyboard.nextLine();
                ph[numOfNode++] = new PhoneUnivInfo(name, phonenumber, major, year);
            }
            else if(choice == 3)
            {
                System.out.print("회사: ");
                String company = Menu.keyboard.nextLine();
                ph[numOfNode++] = new PhoneCompanyInfo(name, phonenumber, company);
            }
            else
                ph[numOfNode++] = new PhoneInfo(name, phonenumber);
            System.out.println("\n데이터가 저장되었습니다.");
        }
    }

    public int toThree(int num) throws MenuSelectionException{
        num = Menu.keyboard.nextInt();
        if(num > 3 || num < 1)
        {
            MenuSelectionException excp = new MenuSelectionException();
            throw excp;
        }
        else
            return num;
    }

    public void searchData()
    {
        boolean flag = false;
        System.out.print("이름: ");
        String inp = Menu.keyboard.nextLine();
        for(int i = 0; i < numOfNode; i++)
        {
            if(inp.equals(ph[i].name))
            {
                flag = true;
                System.out.println("\n검색한 정보 출력...");
                ph[i].showPhoneInfo();
                System.out.println("");
                break;
            }
        }
        if(!flag)
            System.out.println("\n해당 전화번호부에 존재하지 않는 이름입니다.");
    }
    public void removeData()
    {
        int rIdx = 0;
        boolean flag = false;
        System.out.print("삭제할 이름: ");
        String inp = Menu.keyboard.nextLine();

        for(int i = 0; i < numOfNode; i++)
            if(inp.equals(ph[i].name))
            {
                flag = true;
                rIdx = i;
            }

        if(flag)
        {
            for(int i = rIdx; i < numOfNode - 1 ; i++)
                ph[i] = ph[i + 1];
            System.out.println("\n해당 명부가 정상적으로 삭제되었습니다.");
            numOfNode--;
        }
        else
        {
            System.out.println("\n해당 전화번호부에 존재하지 않는 이름입니다.");
        }
    }
}
