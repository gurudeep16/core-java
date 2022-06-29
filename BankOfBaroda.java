class BankOfBaroda extends Bank{

    @Override
    public void interest(double intrest){
	System.out.println("Bank Of Baroda");
	intrest = intrest+1.9;
	super.interest(intrest);
	}

}