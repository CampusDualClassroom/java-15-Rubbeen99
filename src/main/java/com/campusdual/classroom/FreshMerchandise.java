package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expirationDate;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    // Constructor actualizado
    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf,
                            int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getFormattedDate(Date date) {
        return sdf.format(date);
    }

    @Override
    public String getSpecificData() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto: ").append(name).append("\n");
        sb.append("ID Único: ").append(uniqueId).append("\n");
        sb.append("Responsable: ").append(responsibleId).append("\n");
        sb.append("Zona: ").append(getZone()).append("\n");
        sb.append("Área: ").append(getArea()).append("\n");
        sb.append("Estante: ").append(getShelf()).append("\n");
        sb.append("Cantidad: ").append(getQuantity()).append("\n");
        sb.append("Fecha de Caducidad: ").append(getFormattedDate(expirationDate)).append("\n");
        return sb.toString();
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }
}
