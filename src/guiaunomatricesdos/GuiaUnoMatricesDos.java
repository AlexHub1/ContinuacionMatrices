
package guiaunomatricesdos;

import javax.swing.*;


public class GuiaUnoMatricesDos {

    public static int [][] cantidadJuegosEconomicos = {

        {2,6},
        {3,4},
        {1,2},
        {2,1}
    };
    
    public static int [][] ventasPreciosMeses = new int [12][6];
    public static int [][] cantidadProductosVendidos = new int [12][4];
    public static int [][] valorProductosVendidos = new int [12][4];
    public static int [] totalGeneralVentas = new int [12];
    public static int [] ventasAnuales = new int [4];
           
    public static void main(String[] args) {
        
        
        /*En la papelería "MULTICOLOR" se están realizando promociones de venta de artículos como lápices, 
        cuadernos, borradores y reglas, ofreciendo dos tipos de juegos económicos:

        Juego 1: Contiene 2 lápices, 3 cuadernos, 1 borrador y 2 reglas.
        Juego 2: Contiene 6 lápices, 4 cuadernos, 2 borradores y 1 regla.

        Se registran las ventas de estos juegos económicos durante todos los meses del año. Cada artículo tiene un precio específico 
        que puede variar de un mes a otro.

        Implemente un programa en Java que permita:

        Ingresar las ventas de los juegos económicos (tipo 1 y tipo 2) para cada uno de los 12 meses del año.
        Ingresar los precios de los artículos (lápices, cuadernos, borradores y reglas) para cada mes.
        Calcular y mostrar el número total de lápices, cuadernos, borradores y reglas vendidos en cada mes.
        Calcular y mostrar el total de ventas ($) por artículo para cada mes.
        /Calcular y mostrar el total general de ventas para cada mes.
        /Calcular y mostrar el total anual de ventas de cada artículo.
        Calcular y mostrar el total anual de ventas.*/
        
        for (int i = 0; i < 12; i++) {
           int cantidadVendidaJuegoEconomicoU = Integer.parseInt(JOptionPane.showInputDialog("Digite cuantas unidades del tipo 1 se vendieron en el mes "+ (i+1))); 
           ventasPreciosMeses[i][0]= cantidadVendidaJuegoEconomicoU;
           int cantidadVendidaJuegoEconomicoD = Integer.parseInt(JOptionPane.showInputDialog("Digite cuantas unidades del tipo 2 se vendieron en el mes "+ (i+1)));
           ventasPreciosMeses[i][1]= cantidadVendidaJuegoEconomicoD;
           int precioLapiz = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio de los lapices en el mes "+ (i+1)));
           ventasPreciosMeses[i][2]= precioLapiz;
           int precioCuaderno = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio de los cuadernos en el mes "+ (i+1)));
           ventasPreciosMeses[i][3]= precioCuaderno;
           int precioBorrador = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio de los borradores en el mes "+ (i+1)));
           ventasPreciosMeses[i][4]= precioBorrador;
           int precioRegla = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio de las reglas en el mes "+ (i+1)));
           ventasPreciosMeses[i][5]= precioRegla;
        }
        
        StringBuilder cantidadVentasP = new StringBuilder();
        
        for (int i = 0; i < 12; i++) {
           cantidadVentasP.append("====== CANTIDAD VENDIDA DE CADA PRODUCTO EN EL MES ").append(i+1).append(" ======\n");
            cantidadProductosVendidos[i][0] = (ventasPreciosMeses[i][0] * cantidadJuegosEconomicos[0][0]) + (ventasPreciosMeses[i][1] * cantidadJuegosEconomicos[0][1]); 
            cantidadProductosVendidos[i][1] = (ventasPreciosMeses[i][0] * cantidadJuegosEconomicos[1][0]) + (ventasPreciosMeses[i][1] * cantidadJuegosEconomicos[1][1]);
            cantidadProductosVendidos[i][2] = (ventasPreciosMeses[i][0] * cantidadJuegosEconomicos[2][0]) + (ventasPreciosMeses[i][1] * cantidadJuegosEconomicos[2][1]);
            cantidadProductosVendidos[i][3] = (ventasPreciosMeses[i][0] * cantidadJuegosEconomicos[3][0]) + (ventasPreciosMeses[i][1] * cantidadJuegosEconomicos[3][1]);
           cantidadVentasP.append("La cantidad de Lapices vendidos ->").append(cantidadProductosVendidos[i][0]).append("\n");
           cantidadVentasP.append("La cantidad de Cuadernos vendidos ->").append(cantidadProductosVendidos[i][1]).append("\n");
           cantidadVentasP.append("La cantidad de Borradores vendidos ->").append(cantidadProductosVendidos[i][2]).append("\n");
           cantidadVentasP.append("La cantidad de Reglas vendidas ->").append(cantidadProductosVendidos[i][3]).append("\n");
           
        }
        JOptionPane.showMessageDialog(null,cantidadVentasP.toString());
        
        StringBuilder valorVentasP = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            valorVentasP.append("====== VALOR VENDIDA DE CADA PRODUCTO EN EL MES ").append(i+1).append(" ======\n");
            valorProductosVendidos[i][0] = cantidadProductosVendidos[i][0] * ventasPreciosMeses[i][2];
            valorProductosVendidos[i][1] = cantidadProductosVendidos[i][1] * ventasPreciosMeses[i][3];
            valorProductosVendidos[i][2] = cantidadProductosVendidos[i][2] * ventasPreciosMeses[i][4];
            valorProductosVendidos[i][3] = cantidadProductosVendidos[i][3] * ventasPreciosMeses[i][5];
           valorVentasP.append("El valor de Lapices vendidos ->").append(valorProductosVendidos[i][0]).append("\n");
           valorVentasP.append("El valor de Cuadernos vendidos ->").append(valorProductosVendidos[i][1]).append("\n");
           valorVentasP.append("El valor de Borradores vendidos ->").append(valorProductosVendidos[i][2]).append("\n");
           valorVentasP.append("El valor de Reglas vendidas ->").append(valorProductosVendidos[i][3]).append("\n");
           
        }
        
        JOptionPane.showMessageDialog(null,valorVentasP.toString());
        
        StringBuilder ventasGeneralesMensual = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            
            ventasGeneralesMensual.append("====== VALOR GENERAL DE VENTAS EN EL MES ").append(i+1).append(" ======\n");
            totalGeneralVentas[i] = valorProductosVendidos[i][0] + valorProductosVendidos[i][1] + valorProductosVendidos[i][2] + valorProductosVendidos[i][3];
            
            ventasGeneralesMensual.append(" -> $").append(totalGeneralVentas[i]);
        }
        JOptionPane.showMessageDialog(null,ventasGeneralesMensual.toString());
        
        StringBuilder ventasGeneralesAnuales = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            ventasGeneralesAnuales.append("====== VALOR GENERAL ANUAL DE CADA PRODUCTO").append(" ======\n");
            for (int j = 0; j < 12; j++) {
                ventasAnuales[i]+= valorProductosVendidos[j][i]; 
            } 
            ventasGeneralesAnuales.append(" -> $").append(ventasAnuales[i]);
        }
        
        JOptionPane.showMessageDialog(null,ventasGeneralesAnuales.toString());
        
        int ventasAnualesTotales = ventasAnuales[0]+ventasAnuales[1]+ventasAnuales[2]+ventasAnuales[3];
        JOptionPane.showMessageDialog(null,"EL TOTAL ANUAL DE VENTAS ES DE $" + ventasAnualesTotales);
    }
    
}
