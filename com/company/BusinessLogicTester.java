package com.company;

public final class BusinessLogicTester {

    public static void main(String[] args) {
        try{

        VehicleRental vr = VehicleRental.getVehicleRental();
        Customer cu1 = new Customer("1111111A", "Jiminy Cricket", "Hispanidad");
        Reservation res1 = new Reservation("1", "12/05/2016", "15/05/2016", "1");
            res1.setrCu(cu1);
            res1.setrCa(vr.getCategory("sedan"));
            res1.setrBOpickup(vr.getBranchOffice(1));
            res1.setrBOreturn(vr.getBranchOffice(1));
        vr.add_Reservation();

            Reservation res2 = new Reservation("2", "13/10/2016", "21/10/2016", "2");
            res2.setrCa(vr.getCategory("economy"));
            res2.setrCu(cu2);
            res2.setrBOpickup(vr.getBranchOffice(1));
            res2.setrBOreturn(vr.getBranchOffice(2));



    }catch (Exception e){}

}
}

