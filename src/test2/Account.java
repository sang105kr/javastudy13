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

  /**
   * 입금 처리
   * @param money 입금액
   */
  public void deposit(int money) {
    //1) 1회 입금한도 4만원 초과하는지 체크
    if(money > 40_000){
      System.out.println("1회 입금한도 4만원 초과!");
      return;
    }
    //2) 예치금액은 10만원 이하로 제한
    if( (balance + money) > 100_000 ){
      System.out.println("예치금액 10만원 초과!");
      System.out.println("현재 잔액 : " + balance);
      return;
    }
    balance += money; // balance = balance + money
  }

  /**
   * 출금 처리
   * @param money 출금액
   */
  public void widthdraw(int money) {
    //1) 1회 출금한도 4만원 초과하는지 체크
    if(money > 40_000){
      System.out.println("1회 출금한도 4만원 초과!");
      return;
    }
    //2) 잔액이 충분한지 체크
    if( balance < money ){
      System.out.println("잔액이 부족합니다!");
      System.out.println("현재 잔액 : " + balance);
      return;
    }
    balance -= money; // balance = balance - money
  }

  /**
   * 조회 처리
   */
  public String getAccount() {
    return "예금주명 : " + accountName + "," +
           "잔액 : " + balance + "," +
           "계좌번호 : " + accountNumber;
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
