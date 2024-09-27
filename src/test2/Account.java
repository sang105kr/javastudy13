package test2;

public class Account {
  private String accountName;   //예금주명
  private int balance;          //잔액
  private String accountNumber; //계좌번호

  private static int cntOfAccount; //계좌번호 카운트
  private static final int ACCOUNT_NUM_SIZE = 3; //계좌번호 자리수

  public Account(String accountName) {
    this.accountName = accountName;
    accountNumber = makeAcountNumber(++cntOfAccount);
  }

  // 계좌번호 만들기
  private String makeAcountNumber(int num) {
    //1)계좌번호 문자열 번환
    String strNum = num + "";  // "999"
    //2)계좌번호 문자열 길이
    int lengthOfStrNum = strNum.length(); // 3
    //3) "0"를 계좌번호 앞에 몇개 붙일지 계산
    int loop = ACCOUNT_NUM_SIZE - lengthOfStrNum; // 0
    //4) "0"을 계좌본호 앞에 붙이기
    for (int i = 0; i < loop; i++) {
      strNum = "0" + strNum;
    }
    return strNum;
  }

  //  기능 :  입금, 출금, 조회
  public void deposit(int money) {
    balance += money; // balance = balance + money
  }

  public void widthdraw(int money) {
    balance -= money; // balance = balance - money
  }

  public void getAccount(String accountNumber) {
    System.out.println("계좌번호 : " + accountNumber);
    System.out.println("예금주명 : " + accountName);
    System.out.println("잔액 : " + balance);
  }

  @Override
  public String toString() {
    return "Account{" +
            "예금주명='" + accountName + '\'' +
            ", 잔액=" + balance +
            ", 계좌번호='" + accountNumber + '\'' +
            '}';
  }

  public String getAccountName() {
    return accountName;
  }

  public int getBalance() {
    return balance;
  }

  public String getAccountNumber() {
    return accountNumber;
  }
}
