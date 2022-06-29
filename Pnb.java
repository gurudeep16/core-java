class Pnb extends Bank{

    @Override
    public void interest(double intrest){
	System.out.println("Punjab National Bank");
	intrest = intrest+1.9;
	super.interest(intrest);
	}

}