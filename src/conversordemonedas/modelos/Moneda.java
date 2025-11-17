package conversordemonedas.modelos;

public class Moneda {
    private final String base;
    private final String target;
    private final double cantidad;
    private final double cantidadConvertida;

    public Moneda(TasaDeCambio tasa, double cantidad) {
        this.base = tasa.base_code();
        this.target = tasa.target_code();
        this.cantidad = cantidad;
        this.cantidadConvertida = cantidad * tasa.conversion_rate();
    }

    public double getCantidadConvertida() {
        return cantidadConvertida;
    }
}
