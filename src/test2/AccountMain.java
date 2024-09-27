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

  // 전체목록
  private static void listAccounts() {
    //1)계좌목록 출력
    for (Account account : accounts) {
      if(account != null) {
        System.out.printf("예금주명 : %s, 계좌번호 : %s, 잔액 : %s \n",
                account.getAccountName(), account.getAccountNumber(), account.getBalance());
      }
    }

    //2)사용중인 계좌수 & 잔여계좌수
    int cntOfUsingAccount = getCntOfUsingAccount();
    int cntOfremainingAccount = accounts.length-cntOfUsingAccount;
    System.out.printf("사용중인계좌수 : %s, 잔여계좌수 : %s \n", cntOfUsingAccount, cntOfremainingAccount);
  }

  // 사용중인 계좌수 구하기
  private static int getCntOfUsingAccount() {
    int cnt = 0;
    for (int i = 0; i < accounts.length; i++) {
      if(accounts[i] != null){
        cnt++;
      }
    }
    return cnt;
  }

  // 개별 계좌(조회)
  private static void getAccount() {
    System.out.print("계좌번호 : ");
    String accountNumber = scanner.nextLine();

    //계좌번호가 존재유무 체크
    if(!isExistAccount(accountNumber)){
      System.out.println("조회하고자하는 계좌가 없습니다.!");
      return;
    }

    //계좌번호 출력
    printAccount(accountNumber);
  }

  // 계좌출력
  private static void printAccount(String accountNumber) {
    for (int i = 0; i < accounts.length; i++) {
      if (accounts != null) {
        if(accounts[i].getAccountNumber().equals(accountNumber) ){
          System.out.println(accounts[i].getAccount());
          break;
        }
      }
    }
  }

  // 계좌번호 존재 여부확인
  private static boolean isExistAccount(String accountNumber) {
    boolean existAccount = false;
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] != null) {
        if(accounts[i].getAccountNumber().equals(accountNumber) ){
          existAccount = true;
          break;
        }
      }
    }
    return existAccount;
  }

  //출금
  private static void widthdraw() {
    System.out.print("계좌번호 : ");
    String accountNumber = scanner.nextLine();

    //1)계좌번호가 존재유무 체크
    if(!isExistAccount(accountNumber)){
      System.out.println("조회하고자하는 계좌가 없습니다.!");
      return;
    }
    //2)계좌 검색
    Account findedAccount = findAccountByAccountNumber(accountNumber);

    System.out.print("출금액 : ");
    int money = scanner.nextInt();

    scanner.nextLine(); // 'enter키 소비'

    //3)출금 처리
    findedAccount.widthdraw(money);
  }

  //입금
  private static void deposit() {
    System.out.print("계좌번호 : ");
    String accountNumber = scanner.nextLine();

    //1)계좌번호가 존재유무 체크
    if(!isExistAccount(accountNumber)){
      System.out.println("조회하고자하는 계좌가 없습니다.!");
      return;
    }
    //2)계좌 검색
    Account findedAccount = findAccountByAccountNumber(accountNumber);

    System.out.print("입금액 : ");
    int money = scanner.nextInt();

    scanner.nextLine(); // 'enter키 소비'

    //3)입금 처리
    findedAccount.deposit(money);
  }
  //계좌 검색
  private static Account findAccountByAccountNumber(String accountNumber) {
    Account findedAccount = null;
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] != null) {
        if(accounts[i].getAccountNumber().equals(accountNumber)){
          findedAccount = accounts[i];
          break;
        }
      }
    }
    return findedAccount;
  }

  //폐지
  private static void closeAccount() {
    System.out.print("계좌번호 : ");
    String accountNumber = scanner.nextLine();

    //1)계좌번호가 존재유무 체크
    if(!isExistAccount(accountNumber)){
      System.out.println("조회하고자하는 계좌가 없습니다.!");
      return;
    }
    
    for (int i = 0; i < accounts.length; i++) {
      if(accounts[i] != null ){
        if(accounts[i].getAccountNumber().equals(accountNumber)){
          //2) 잔액 체크
          if(accounts[i].getBalance() > 0){
            System.out.println("잔액이 존재합니다!");
            return;
          }else{
          //3) 폐지 처리
            System.out.println("계좌번호 : " + accounts[i].getAccountNumber() + " 폐지 되었습니다.");
            accounts[i] = null;
            return;
          }
        }
      }
    }
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
} // end of class
