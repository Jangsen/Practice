 package testclass02;

import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

public class BankApplication {
	public static Scanner sc = new Scanner(System.in);
	public static Account[] ac = new Account[100];	//객체 배열
	
	public static void main(String[] args) {
		boolean status = true;
		while (status) 
		{
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("--------------------------------------------");
			System.out.print("선택 >>");
			int select = Integer.parseInt(sc.nextLine());
			if (select == 1) 
			{
				createAccount();
			}
			else if(select == 2) 
			{
				listAccount();
			}
			else if(select == 3) 
			{
				deposit();
			}
			else if(select == 4) 
			{
				widthdraw();
			}
			else if(select == 5)
			{
				status = false;
			}
			System.out.println("프로그램 종료");
		}
		
	}//계좌생성
	private static void createAccount(){
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌번호 : ");
		String ano = sc.nextLine();
		System.out.print("계좌주 : ");
		String owner = sc.nextLine();
		System.out.print("초기입금액 : ");
		int balance = Integer.parseInt(sc.nextLine());
		Account newAccount = new Account(ano,owner,balance);
		for(int i=0; i < ac.length; i++) 
		{
			if(ac[i] == null) 
			{
			ac[i] = newAccount;
			System.out.println("계좌가 생성되었습니다.");
			break;
			}
		}
	}//계좌 목록
	private static void listAccount() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		for(int i = 0; i < ac.length; i++) 
		{
			if(ac[i] != null) 
			{
				System.out.print(ac[i].getAno() + " ");
				System.out.print(ac[i].getOwner() + " ");
				System.out.println(ac[i].getBalance() + " ");
				break;
			}
		}
	
		
	}//계좌 찾기
	private static Account findAcc(String ano) 
	{
		Account account = null;
		for(int i = 0; i < ac.length; i++)
			if(ac[i] != null) 		
			{
				String dbAno = ac[i].getAno();
				if(dbAno.equals(ano)) 
				{
					account = ac[i];
					break;
				}
			}
		return account;
	}	//예금
	private static void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		System.out.print("계좌번호 : ");
		String ano = sc.nextLine();
		System.out.print("예금액 : ");
		int money = Integer.parseInt(sc.nextLine());
		Account account = findAcc(ano);
		if(account == null) 
		{
			System.out.println("결과: 존재하지 않는 계좌입니다.");	
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 예금되었습니다.");
	}
		private static void widthdraw() {
			System.out.println("------");
			System.out.println("출금");
			System.out.println("------");
			System.out.print("계좌번호 : ");
			String ano = sc.nextLine();
			System.out.print("출금액 : ");
			int money = Integer.parseInt(sc.nextLine());
			Account account = findAcc(ano);
			if(account == null) 
			{
				System.out.println("결과: 존재하지 않는 계좌입니다.");	
				return;
			}
			account.setBalance(account.getBalance() - money);
			System.out.println("결과: 출금되었습니다.");
		}
		
	}
