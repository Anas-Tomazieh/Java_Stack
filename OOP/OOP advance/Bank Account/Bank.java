package com.anas.bankaccount assignment;
impotr java.utile.Random;
public class Bank{
    private String accountNumber;
    private double checkingBalance;
    private double savingBalance;
    private static in accounts =0;
    private static double totalAmount = 0;
    //Constructor

    public Bank(){
        this.account +=1;
        this.totalAmount+=savingBalance + checkingBalance;
        this.accountNumber = generateAccountNumber();
    }

    //Seter:


    //Getter:
        public double getCheckingBalance(){
            return this.checkingBalance;
        }
         public double getSavingBalance(){
            return this.savingBalance;
        }

        public void deposit(String accountName, int depositAmount){
            if(accountName =="checkingBalance")
                this.checkingBalance+=depositAmount;
            if(accountName=="savingBalance")
                this.savingBalance+=depositAmount;
            this.totalAmount+=depositAmount;

        }


    private String generateAccountNumber(){
        Random r = new Random();
        String accountNum;
        for(int i=0;i<10;i++){
            accountNum +=r.nextInt(9);
        }
        return accountNum;

    }

}