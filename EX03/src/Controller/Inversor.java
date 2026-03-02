package Controller;

public class Inversor {

    // Construtor
    public Inversor() {
        super();
    }

    public String inverterString(String texto) {

        /*
         * Quando o texto tiver tamanho menor ou igual a 1,
         * não há mais o que inverter.
         */
        if (texto.length() <= 1) {
            return texto;
        }

        /*
         * inverter(texto) =
         * inverter(texto.substring(1)) + texto.substring(0,1)
         */

        return inverterString(texto.substring(1)) + texto.substring(0, 1);
    }
}