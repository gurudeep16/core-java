class Icici extends Bank{

    @Override
    public void interest(double intrest){
	System.out.println("ICICI");
	intrest = intrest+2;
	super.interest(intrest);
	}

}