package com.company;
import java.util.ArrayList;
import java.util.HashMap;


public class VehicleRental {
    // single instance
    private static VehicleRental INSTANCE = new VehicleRental();
    private VehicleRental(){
        // load pre-existing data
        systemload();
    }
    public static VehicleRental getVehicleRental(){
        return INSTANCE;
    }

    private ArrayList<BranchOffice> colvrB = new ArrayList<BranchOffice>();
    public BranchOffice getBranchOffice(int identifier_BranchOffice){
        for(BranchOffice element: colvrB)	{
            if(identifier_BranchOffice==(element.getId())){
                return element;
            }
        }
        return null;
    }
    public void add_BranchOffice(BranchOffice o){
        colvrB.add(o);
    }
    public void remove_BranchOffice(String identifier_BranchOffice){
        for(BranchOffice element: colvrB)	{
            if(identifier_BranchOffice.equals(element.getAddress())){
                colvrB.remove(element);
            }
        }
    }

    private HashMap<String, Category> colvrCa = new HashMap<String, Category>();
    public Category getCategory(String identifier_Category){
        return colvrCa.get(identifier_Category);
    }
    public void add_Category(String nombre_cat,Category o){
            colvrCa.put(nombre_cat, o);
    }
    public void remove_Category(String identifier_Category) {
        colvrCa.remove(identifier_Category);
    }


    private ArrayList <Customer> colvrCu = new ArrayList<Customer>();
    public Customer getCustomer(String identifier_Customer){
        for(Customer element: colvrCu)	{
            if(identifier_Customer.equals(element.getName())){
                return element;
            }
        }
        return null;
    }
    public void add_Customer(Customer o){
        colvrCu.add(o);
    }
    public void remove_Customer(String identifier_Customer){
        for(Customer element: colvrCu)	{
            if(identifier_Customer.equals(element.getName())){
                colvrCu.remove(element);
            }
        }
    }


    private HashMap<String, Reservation> colvrR = new HashMap<String, Reservation>();
    public Reservation getReservation(String identifier_Reservation){
        return colvrR.get(identifier_Reservation);
    }
    public void add_Reservation(String nombre_res,Reservation o){
        colvrR.put(nombre_res, o);
    }
    public void remove_Reservation(String identifier_Reservation) {
        colvrR.remove(identifier_Reservation);
    }


    // Control class code
    private void systemload(){
        BranchOffice bo1 = new BranchOffice("Camino de Vera s/n", 1);
        BranchOffice bo2 = new BranchOffice("Archiduque Carlos, 3", 2);
        Category ca1 = new Category("sedan", 45, 23, 0.75, 50.25, 43.23);
        Category ca2 = new Category("economy", 48, 27, 0.85, 75.25, 55.23);
        ca2.setCaCa(ca1);
        add_BranchOffice(bo1);
        add_BranchOffice(bo2);
        add_Category(ca1.getName(), ca1);
        add_Category(ca2.getName(), ca2);
    }

}
