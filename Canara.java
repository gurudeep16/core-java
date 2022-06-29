class Canara extends Bank{

    @Override
    public void interest(double intrest){
	System.out.println("Canara");
	intrest = intrest+2.2;
	super.interest(intrest);
	}

}