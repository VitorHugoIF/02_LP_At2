/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.Model;

/**
 *
 * @author vitor.marcelino
 */
public class Sedex implements IDeliveryService {
    @Override
    public String deliver() {
        return "Entregue via Sedex";
    }

    @Override
    public String cancelDelivery() {
        return "Entrega via Sedex cancelada";
    }
}
