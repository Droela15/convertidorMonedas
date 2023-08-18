package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
    public void ConvertirDolaresAPesos(double valor) {
        double monedaDolar = valor * 17.08;
        monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Méxicanos");
    }

    public void ConvertirEurosAPesos(double valor) {
        double monedaEuro = valor * 18.61;
        monedaEuro = (double) Math.round(monedaEuro *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Méxicanos");
    }

    public void ConvertirLibrasAPesos(double valor) {
        double monedaLibra = valor * 21.80;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Méxicanos");
    }

    public void ConvertirYenAPesos(double valor) {
        double monedaYen = valor * 0.12;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Méxicanos");
    }

    public void ConvertirWonAPesos(double valor) {
        double monedaWon = valor * 0.013;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Méxicanos");
    }
}
