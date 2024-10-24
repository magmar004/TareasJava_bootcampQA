package TareasBootcampQA.QATesting24;

public class SistemaPagos {

    // Clase base Pago
    public static class Pago {
        public void procesarPago(double monto) {
            System.out.println("Procesando pago único de $" + monto);
        }

        // Sobrecarga: procesar pago en cuotas
        public void procesarPago(double monto, int cuotas) {
            if (cuotas == 1) {
                System.out.println("Procesando pago único de $" + monto);
            } else {
                System.out.println("Procesando pago de $" + monto + " en " + cuotas + " cuotas.");
            }
        }
    }

    // Clase derivada PagoConEfectivo
    public static class PagoConEfectivo extends Pago {
        @Override
        public void procesarPago(double monto) {
            // Calcular un descuento del 5%
            double descuento = monto * 0.05;
            double montoFinal = monto - descuento;
            System.out.printf("Pago en efectivo con 5%% de descuento. Monto final: $%.2f\n", montoFinal);
        }
    }

    // Clase derivada PagoConTarjeta
    public static class PagoConTarjeta extends Pago {
        @Override
        public void procesarPago(double monto, int cuotas) {
            if (cuotas == 1) {
                System.out.printf("Pago con tarjeta en una sola cuota. Monto total: $%.2f\n", monto);
            } else if (cuotas == 3) {
                // Calcular un interés del 7.5% para 3 cuotas
                double interes = monto * 0.075;
                double montoFinal = monto + interes;
                System.out.printf("Pago con tarjeta en 3 cuotas con 7.5%% de interés. Monto total: $%.2f\n", montoFinal);
            } else {
                System.out.println("Opción de cuotas no disponible.");
            }
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso

        // Pago en efectivo
        PagoConEfectivo pagoEfectivo = new PagoConEfectivo();
        pagoEfectivo.procesarPago(100);  // Pago en efectivo con descuento

        // Pago con tarjeta
        PagoConTarjeta pagoTarjeta = new PagoConTarjeta();
        pagoTarjeta.procesarPago(100, 1);  // Pago en una sola cuota
        pagoTarjeta.procesarPago(100, 3);  // Pago en 3 cuotas con interés
    }
}
