class Syndicate extends Bank{

    @Override
    public void interest(double intrest){
	System.out.println("Syndicate Bank");
	intrest = intrest+1.8;
	super.interest(intrest);
	}

}