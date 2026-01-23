package deteciondeaños;

public class Fechas {

    private int dia;
    private int mes;
    private int año;

    // Constructor predeterminado (1-1-1900)
    public Fechas() {
        dia = 1;
        mes = 1;
        año = 1900;
    }

    // Constructor con parámetros
    public Fechas(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        valida();
    }

    // Validar fecha básica
    private void valida() {
        if (año < 1900 || año > 2050) {
            año = 1900;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        if (dia < 1 || dia > diasMes()) {
            dia = 1;
        }
    }

    // Saber si el año es bisiesto
    public boolean esBisiesto() {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    // Días que tiene el mes actual
    public int diasMes() {
        switch (mes) {
            case 2: return esBisiesto() ? 29 : 28;
            case 4: case 6: case 9: case 11: return 30;
            default: return 31;
        }
    }

    // Mostrar fecha en formato dd-mm-aaaa
    public String corta() {
        return String.format("%02d-%02d-%d", dia, mes, año);
    }

    // Avanza al siguiente día
    public void siguiente() {
        dia++;
        if (dia > diasMes()) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                año++;
            }
        }
    }

    // Retrocede al día anterior
    public void anterior() {
        dia--;
        if (dia < 1) {
            mes--;
            if (mes < 1) {
                mes = 12;
                año--;
            }
            dia = diasMes();
        }
    }

    // Getters y setters básicos
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAño() { return año; }

    public void setDia(int dia) { this.dia = dia; valida(); }
    public void setMes(int mes) { this.mes = mes; valida(); }
    public void setAño(int año) { this.año = año; valida(); }
}
