import java.util.Scanner;
import java.math.*;
import java.text.NumberFormat;
import java.util.Locale;
public class Ejercicio_7_Efic_Viaje_Sasaima
    {
        public static void main(String[] args)
        {
        double CPV,Carga, P_Gasolina, Capacidad,N_Viajes,GPK, Consumo_Total;
        Scanner Tecl = new Scanner(System.in);
        System.out.print("Kilos a transportar = ");
        Carga = Tecl.nextDouble();
        System.out.print("Capacidad en Toneladas = ");
        Capacidad = Tecl.nextDouble();
        N_Viajes = Math.round(Carga/(Capacidad*1000));
        System.out.println("Cantidad de viajes = "+N_Viajes);
        System.out.print("Consumo en galones por Kilometro  = ");
        GPK = Tecl.nextDouble();
        CPV = 79.4/GPK;
        Consumo_Total = N_Viajes * CPV;
        BigDecimal a1 = new BigDecimal(CPV);
        BigDecimal b1 = new BigDecimal(Consumo_Total);
        MathContext m = new MathContext(3); 
        BigDecimal a2 = a1.round(m);
        BigDecimal b2 = b1.round(m);
        P_Gasolina = Consumo_Total * 10000;
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CANADA);
        String currency = format.format(P_Gasolina);
        System.out.println("Consumo de gasolina por viaje "+ a2 + " para un total de " + b2 + " galones para llevar la carga");
        System.out.print("Costo de gasolina es  = "+currency);
         
  
    }
    }
