package diyizhou;

public class VendingMachine {
	int price = 80;
	int total;
	int balance;
	
	VendingMachine() //构造函数
	{
		total = 0;
	}
	
	VendingMachine(int price) //重载
	{
		this.price = price;
	}
	void showPrompt() 
	{
		System.out.println("Welcome");
	}
	void insertMoney(int amount) 
	{
		balance += amount;
	}
	void showBalance() 
	{
		System.out.println("balance: "+ balance);
	}
	void getFood()
	{
		if(balance >= price) {
			System.out.println("Here are you.");
			balance -= price;
			total += price;
		}
	}
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		VendingMachine vm1 = new VendingMachine(100);
		vm1.insertMoney(200);
		vm.showBalance();
		vm1.showBalance();
	}

}
