class Bucb extends Bank{

    @Override
    public void interest(double intrest){
	System.out.println("Bhatkal Urban Co-operative Bank");
	intrest = intrest+2.2;
	super.interest(intrest);
	}

}