class YesBank extends Bank{

    @Override
    public void interest(double intrest){
	System.out.println("YesBank");
	intrest = intrest+2.4;
	super.interest(intrest);
	}

}