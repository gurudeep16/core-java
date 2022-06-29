class Hdfc extends Bank{

    @Override
    public void interest(double intrest){
	System.out.println("HDFC");
	intrest = intrest+2.4;
	super.interest(intrest);
	}

}