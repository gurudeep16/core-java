class Union extends Bank{

    @Override
    public void interest(double intrest){
	System.out.println("Union Bank");
	intrest = intrest+2.1;
	super.interest(intrest);
	}

}