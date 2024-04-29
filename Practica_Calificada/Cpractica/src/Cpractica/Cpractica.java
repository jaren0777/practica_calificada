package Cpractica;
import java.util.Scanner;
public class Cpractica {
    public static void main(String[] args) {
        float precio,cantidad, importe, primerDescuento,segundoDescuento,descuentoTotal,pagar;
        
        precio = IngresarPrecio();
        cantidad = IngresarCantidad();

        importe = calcularImporteDeLaCompra(precio,cantidad);
        primerDescuento = calcularPrimerDescuento(importe);
        segundoDescuento = calcularSegundoDescuento(importe, primerDescuento);
        descuentoTotal = calcularDescuentoTotal(primerDescuento, segundoDescuento);
        pagar = calcularImporteAPagar(importe, descuentoTotal);
        
        Imprimir(pagar, descuentoTotal, primerDescuento,segundoDescuento, importe);
        
       
    }
    static float IngresarPrecio(){
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese precio del producto:");
    float claseAuto = teclado.nextFloat();
    return claseAuto;       
    }  
    static float IngresarCantidad(){
    Scanner teclado = new Scanner(System.in);  
    System.out.println("Ingrese la cantidad:");
    float kmrecorridos = teclado.nextFloat();
    return kmrecorridos;
    }    

    public static float calcularImporteDeLaCompra(float precio, float cantidad) {
        return precio * cantidad;
    }

    public static float calcularPrimerDescuento(float importe) {
        return 0.07f * importe;
    }

    public static float calcularSegundoDescuento(float importe, float primerDescuento) {
        float importeRestante = calcularPrimerDescuento(importe);
        return 0.07f * importeRestante;
    }

    public static float calcularDescuentoTotal(float primerDescuento, float segundoDescuento) {
        return primerDescuento + segundoDescuento;
    }

    public static float calcularImporteAPagar(float importe, float descuentoTotal) {
        return importe - descuentoTotal;
    }
    static void Imprimir(float pagar,float descuentoTotal, float primerDescuento, float segundoDescuento, float importe){
        System.out.println("Importe de la compra: " + importe);
        System.out.println("primer descuento: " + primerDescuento);
        System.out.println("segundo descuento: " + segundoDescuento);
        System.out.println("descuento total: " + descuentoTotal);
        System.out.println("total a pagar: " + pagar);
    }
}