package test3;

import util.Line;

import java.util.Scanner;

public class AccountMain {
  private static final int MAX_ACCOUNT = 5;
  private static Scanner scanner = new Scanner(System.in);
  private static Account[] accounts = new Account[MAX_ACCOUNT];

  public static void main(String[] args) {
    boolean stop = false;
    while (!stop) {
      Line.printLine('=', 70);
      System.out.println(" 메뉴 :  1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개별) 6.계좌조회(전체) 7.종료");
      Line.printLine('=', 70);
      System.out.print("선택 >> ");
      String menu = scanner.nextLine();
      switch (menu) {
        case "1": //신규
          createAccount();
          break;
        case "2": //폐지
          closeAccount();
          break;
        case "3": //입금
          deposit();
          break;
        case "4": //출금
          widthdraw();
          break;
        case "5": //계좌조회(개별)
          getAccount();
          break;
        case "6": //계좌조회(전체)
          listAccounts();
          break;
        case "7": // 종료
          stop = true;
          continue;
        default:
          System.out.println("메뉴를 다시 선택 바랍니다(1~7)");
      } // end of switch
    } // end of while
    System.out.println("프로그램 종료!");
  } // end of main

  // 출금
  private static void widthdraw() {
    //1)계좌번호 입력받기
    String accountNumber = getEnteredAccountNumber();
    //2)계좌번호로 계좌찾기
    int idx = findAccountByAccountNumber(accountNumber);
    if(idx == -1) {
      System.out.println("조회하고자 하는 계좌가 없습니다!");
      return;
    }
    //3)출금하기
    System.out.print("출금액 : ");
    int money = scanner.nextInt();
    scanner.nextLine(); // enter키 소모
    accounts[idx].widthdraw(money);    
  }

  // 입금
  private static void deposit() {
    //1)계좌번호 입력받기
    String accountNumber = getEnteredAccountNumber();
    //2)계좌번호로 계좌찾기
    int idx = findAccountByAccountNumber(accountNumber);
    if(idx == -1) {
      System.out.println("조회하고자 하는 계좌가 없습니다!");
      return;
    }
    //3)입금하기
    System.out.print("입금액 : ");
    int money = scanner.nextInt();
    scanner.nextLine(); // enter키 소모
    accounts[idx].deposit(money);
  }

  //계좌번호 입력받기
  private static String getEnteredAccountNumber() {
    System.out.print("계좌번호 : ");
    String accountNumber = scanner.nextLine();
    return accountNumber;
  }

  // 폐지
  private static void closeAccount() {
    //1)계좌번호 입력받기
    String accountNumber = getEnteredAccountNumber();
    //2)계좌번호로 계좌찾기
    int idx = findAccountByAccountNumber(accountNumber);
    if(idx == -1) {
      System.out.println("조회하고자 하는 계좌가 없습니다!");
      return;
    }
    //3)찾은 계좌 폐지하기
    //3-1)잔액체크
    int balance = accounts[idx].getBalance();
    if(balance > 0){
      System.out.println("잔액이 존재합니다 : " + balance);
      return;
    }
    //3-2)계좌 폐지
    accounts[idx] = null;
  }

  // 신규
  private static void createAccount() {
    //계좌계설 가능여부 체크
    if (!canOpenAccount()) {
      System.out.println("계좌 개설 가능 최대수를 초과합니다!");
      return;
    }

    System.out.print("예금주명 : ");
    String accountName = scanner.nextLine();

    //동명이인 체크
    if(existSameAccountName(accountName)){
      System.out.println("동일이름의 예금주명이 존재합니다!");
      return;
    }

    //계좌계설
    Account account = new Account(accountName);
    System.out.println(account);

    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] == null) {
        accounts[i] = account;
        break;
      }
    }
  }

  // 동명이인 체크
  private static boolean existSameAccountName(String accountName) {
    boolean exist = false;
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] != null) {
        if(accounts[i].getAccountName().equals(accountName)){
          exist = true;
          break;
        }
      }
    }
    return exist;
  }

  //계좌계설 가능여부 체크
  private static boolean canOpenAccount() {
    boolean isNull = false;
    for (Account account : accounts) {
      if (account == null) {
        isNull = true;
        break;
      }
    }
    return isNull;
  }
  /**
   * 계좌번호를 찾아 인덱스 반환하기
   * @param accountNumber 찾고자하는 계좌번호
   * @return 찾고자하는 계좌 위치를 반환, 못찾으면 -1반환
   */
  private static int findAccountByAccountNumber(String accountNumber){
    int idx = -1;
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] != null) {
        if(accounts[i].getAccountNumber().equals(accountNumber)){
          idx = i;
          break;
        }
      }
    }
    return idx;
  }



} // end of class