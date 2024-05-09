import java.util.Scanner;
public class testTerreno {

    public static void main(String[] args) {
        /*  terreno t1 = new terreno(10,11,3);
            terreno t2 = new terreno(20,11,3);
            terreno t3 = new terreno(20,11,3);
    terreno arrayTerreno[]=new terreno[10];
    arrayTerreno[0]= t1;
     arrayTerreno[1]= t2;
      arrayTerreno[2]= t3;
        for(terreno terreno: arrayTerreno){
            terreno.calcualarArea();
            terreno.calcularCostof();
            System.out.println(terreno);
       
        } */

       /* terreno arrayTerrenos[] = {new terreno(10, 3, 2), new terreno(1, 2, 3), new terreno(1, 2, 3)};
        for (terreno terrenos : arrayTerrenos) {
            terrenos.calcualarArea();
            terrenos.calcularCostof();
            System.out.println(terrenos);
        }*/
       Scanner t = new Scanner(System.in);
       terreno arrayTerrenos[]= new terreno[10];
       String opc = "s";
       int i =                                                       0 ;
       while(opc.equals("s")){
                System.out.print("Dame alto ancho y vmc:");
                arrayTerrenos[0]=new terreno(t.nextDouble(), t.nextDouble(),t.nextDouble());
                arrayTerrenos[i].calcualarArea();
                arrayTerrenos[i].calcularCostof();
                //System.out.println(arrayTerrenos[i]);
                i++;
                System.out.println("quieres ingresar mas terrenos (s/n)? ");
                 opc= t.next();
                 if (opc.equals("n")&&(i>=arrayTerrenos.length)) break; 
               
           
       
       
       
       }
        System.out.println("los terrenos ingresados y calculados son");
       for(terreno terr:arrayTerrenos ){
       terr.calcualarArea();
       terr.calcularCostof();
           System.out.println(terr);
       
       }
       
    }
}
