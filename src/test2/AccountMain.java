package test2;

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

  private static void listAccounts() {
    for (Account account : accounts) {
      if(account != null) {
        System.out.printf("예금주명 : %s, 계좌번호 : %s, 잔액 : %s \n",
                account.getAccountName(), account.getAccountNumber(), account.getBalance());
      }
    }

    int cntOfUsingAccount = 0;
    for (int i = 0; i < accounts.length; i++) {
      if(accounts[i] != null){
        cntOfUsingAccount++;
      }
    }
    int cntOfremainingAccount = accounts.length-cntOfUsingAccount;
    System.out.printf("사용중인계좌수 : %s, 잔여계좌수 : %s \n", cntOfUsingAccount, cntOfremainingAccount);
  }

  private static void getAccount() {

  }

  private static void widthdraw() {

  }

  private static void deposit() {

  }

  private static void closeAccount() {

  }

  //계좌계설
  private static void createAccount() {
    //계좌계설 가능여부 체크
    if (!canOpenAccount()) {
      System.out.println("계좌 개설 가능 최대수를 초과합니다!");
      return;
    }

    System.out.print("예금주명 : ");
    String accountName = scanner.nextLine();
    Account account = new Account(accountName);
    System.out.println(account);

    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] == null) {
        accounts[i] = account;
        break;
      }
    }
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
} // end of class
